
/*
Hier soll das Spielfenster mit allen Inhalten erzeugt werden
*/
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;
import static java.awt.event.KeyEvent.*;

public class Window extends JPanel implements KeyListener, ActionListener{
    /*
     * Die Klasse Window erbt von JPanel und überschreibt Methoden von
     * ActionListener
     */

    Timer tm = new Timer(10,this);
    int geschwindigkeit = 5;

    private Spaceship spaceshipAlpha;
    private BackgroundImg backgroundStarSky;
    private Rocket rocketshot;

    public int spaceshipStartPosX = 100;
    public int spaceshipStartPosY = 220;
    public int spaceshipSpeed = 10;

    public int rocketStartPosX;
    public int rocketStartPosY;
    private final int ROCKETFIREPOINT_Y = 20;

    private final int BACKGROUNDIMG_START_POS_X = 0;
    private final int BACKGROUNDIMG_START_POS_Y = 0;

    private final int WINDOW_FRAME_WIDTH = 1041;
    private final int WINDOW_FRAME_HEIGHT = 694;

    public Window() {
        spaceshipAlpha = new Spaceship(spaceshipStartPosX, spaceshipStartPosY);
        backgroundStarSky = new BackgroundImg(BACKGROUNDIMG_START_POS_X, BACKGROUNDIMG_START_POS_Y);
        rocketshot = new Rocket(spaceshipStartPosX, spaceshipStartPosY);
        //rocketshot.setVisible();
        
        addKeyListener(this);
        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WINDOW_FRAME_WIDTH, WINDOW_FRAME_HEIGHT));
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawObjects(g);
    }


    public void actionPerformed(ActionEvent e){
        if(rocketStartPosX < WINDOW_FRAME_WIDTH){
            rocketStartPosX = geschwindigkeit + rocketStartPosX;
            repaint();
        } else{
            System.out.println("yep");
            tm.stop();
        }        
    }

    public void drawObjects(Graphics g) {
        g.drawImage(backgroundStarSky.getImage(), backgroundStarSky.getStartPosX(), backgroundStarSky.getStartPosY(),
                this);
        rocketshot.setVisible();

        if (spaceshipAlpha.isVisible()) {
            g.drawImage(spaceshipAlpha.getImage(), spaceshipStartPosX, spaceshipStartPosY, this);
        }
        if (rocketshot.isVisible()){            
            g.drawImage(rocketshot.getImage(), rocketStartPosX, rocketStartPosY+ROCKETFIREPOINT_Y, this);
            
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        // System.out.println("key pressed");
        switch (keyEvent.getKeyCode()) {
            case VK_LEFT:
                if (spaceshipStartPosX > 0) {
                    spaceshipStartPosX = spaceshipStartPosX - spaceshipSpeed;
                }
                break;
            case VK_RIGHT:
                if (spaceshipStartPosX < 940) {
                    spaceshipStartPosX = spaceshipStartPosX + spaceshipSpeed;
                }
                break;
            case VK_DOWN:
                if (spaceshipStartPosY < 630) {
                    spaceshipStartPosY = spaceshipStartPosY + spaceshipSpeed;
                }
                break;
            case VK_UP:
                if (spaceshipStartPosY > 0) {
                    spaceshipStartPosY = spaceshipStartPosY - spaceshipSpeed;
                }
                break;
            case VK_SPACE:
                rocketStartPosX = spaceshipStartPosX;
                rocketStartPosY = spaceshipStartPosY;
                rocketshot.isVisible();
                tm.start();
                break;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {            
    }



    

}
