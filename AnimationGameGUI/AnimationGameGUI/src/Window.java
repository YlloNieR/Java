/*
 *Hier soll das Spielfenster mit allen Inhalten erzeugt werden
 */

import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Window extends JPanel implements ActionListener {
    /*
     * Die Klasse Window erbt von JPanel und überschreibt Methoden von
     * ActionListener
     */
    private Timer tm;
    private Spaceship spaceshipAlpha;
    private BackgroundImg backgroundStarSky;

    public final int SPACESHIP_START_POS_X = 100; // spaceshipStartPosX
    public final int SPACESHIP_START_POS_Y = 220; // spaceshipStartPosY

    private final int WINDOW_FRAME_WIDTH = 1041;
    private final int WINDOW_FRAME_HEIGHT = 694;

    public final int TICK_TIME = 15;

    // von mir Beginn
    private final int BACKGROUNDIMG_START_POS_X = 0;
    private final int BACKGROUNDIMG_START_POS_Y = 0;
    private final int AIM_HELP = 10;
    // von mir Ende

    public Window() {
        spaceshipAlpha = new Spaceship(SPACESHIP_START_POS_X, SPACESHIP_START_POS_Y);
        backgroundStarSky = new BackgroundImg(BACKGROUNDIMG_START_POS_X, BACKGROUNDIMG_START_POS_Y);
        this.addKeyListener(spaceshipAlpha);
        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(WINDOW_FRAME_WIDTH, WINDOW_FRAME_HEIGHT));
        tm = new Timer(TICK_TIME, this);
        tm.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawObjects(g);
    }

    public void drawObjects(Graphics g) {
        g.drawImage(backgroundStarSky.getImage(), backgroundStarSky.getStartPosX(), backgroundStarSky.getStartPosY(),
                this);
        if (spaceshipAlpha.isVisible()) {
            g.drawImage(spaceshipAlpha.getImage(), spaceshipAlpha.getStartPosX(), spaceshipAlpha.getStartPosY(), this);
        }
        ArrayList<Rocket> RocketList = spaceshipAlpha.getRocketList();

        for (Rocket rocket : RocketList) {
            if (rocket.isVisible()) {
                g.drawImage(rocket.getImage(), rocket.getStartPosX(), rocket.getStartPosY() - AIM_HELP, this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // checkCollision();
        if (spaceshipAlpha.isVisible()) {
            if ((spaceshipAlpha.startPosX < 941 && spaceshipAlpha.startPosX > 0)
                    ^ (spaceshipAlpha.startPosY < 632 && spaceshipAlpha.startPosY > 0)) {
                spaceshipAlpha.stopShip();
            } else {
                spaceshipAlpha.moveShip();
            }

            //System.out.println(spaceshipAlpha.startPosX + ":" + spaceshipAlpha.startPosY);
        }
        ArrayList<Rocket> RocketList = spaceshipAlpha.getRocketList();
        for (Rocket rocket : RocketList) {
            rocket.move();
        }
        repaint();
    }

    /*
     * public void checkCollision() { Rectangle playerBounds =
     * spaceshipAlpha.getBounds(); Rectangle windowBounds =
     * backgroundStarSky.getBounds();
     * 
     * for (Rocket rocket : spaceshipAlpha.getRocketList()) { if (rocket.isVisible()
     * && spaceshipAlpha.isVisible()) { Rectangle rocketBounds = rocket.getBounds();
     * if (playerBounds.intersects(windowBounds)) { spaceshipAlpha.setVisible(); }
     * if (rocketBounds.intersects(windowBounds)) { rocket.setVisible(); } } } }
     */
}
