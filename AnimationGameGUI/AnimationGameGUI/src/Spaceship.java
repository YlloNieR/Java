//import java.awt.Color; //fill rectangle
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.imageio.ImageIO;
import java.awt.Graphics; //create rectangle or Image
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;


import static java.awt.event.KeyEvent.*;

public class Spaceship extends JPanel implements KeyListener {
    public int x; // startpos x
    public int y; // startpos y

    public int spaceshipSizeWidth;
    public int spaceshipSizeHeight;

    public int geschwindigkeit;

    public int frameSizeX = 1041;
    public int frameSizeY = 694;

    public int frameSizeSubBySpaceshipX = frameSizeX - 121;
    public int frameSizeSubBySpaceshipY = frameSizeY - 103;


    public BufferedImage bImg = null;
    
    public int backgroundStartposX;
    public int backgroundStartposY;
    public int backgroundBImgSizeWidth;
    public int backgroundBImgSizeHeight;

    public int backgroundBframeSizeX = frameSizeX;
    public int backgroundBframeSizeY = frameSizeY;

    public BufferedImage bImg2 = null;


    public Spaceship() {
        this.x = 100; // startpos x
        this.y = 220; // startpos y

        this.spaceshipSizeWidth = 100;
        this.spaceshipSizeHeight = 58;

        this.geschwindigkeit = 10; // start speed

        this.backgroundStartposX = 0; // startpos x
        this.backgroundStartposY = 0; // startpos y
        this.backgroundBImgSizeWidth = backgroundBframeSizeX;
        this.backgroundBImgSizeHeight = backgroundBframeSizeY;
    }

    public BufferedImage getSpaceshipImg() {
        try {
            bImg = ImageIO.read(getClass().getResource("./img/spaceship.png"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return bImg;
    }

    public BufferedImage getBackgroundImg() {
        try {
            bImg2 = ImageIO.read(getClass().getResource("./img/starSky.jpg"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return bImg2;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.setColor(Color.BLACK);
        // g.fillRect(x, y, spaceshipSizeWidth, spaceshipSizeHeight); //create at
        // startpos x,startpos y with size width=100,height=60
              
        g.drawImage(getBackgroundImg(), backgroundStartposX, backgroundStartposY, this); 
        g.drawImage(getSpaceshipImg(), x, y, this);  
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_UP:
                if (this.y > 0) { // posY Limit 0
                    this.y -= geschwindigkeit;
                    break;
                }
            case VK_DOWN:
                if (this.y < frameSizeY) {
                    this.y += geschwindigkeit;
                    break;
                }
            case VK_LEFT:
                if (this.x > 0) {
                    this.x -= geschwindigkeit;
                    break;
                }
            case VK_RIGHT:
                if (this.x < frameSizeX) {
                    this.x += geschwindigkeit;
                    break;
                }
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_UP:
                if (this.y > 0) {
                    this.y -= geschwindigkeit;
                }
                break;

            case VK_DOWN:
                if (this.y < frameSizeSubBySpaceshipY) {
                    this.y += geschwindigkeit;
                }
                break;

            case VK_LEFT:
                if (this.x > 0) {
                    this.x -= geschwindigkeit;
                }
                break;

            case VK_RIGHT:
                if (this.x < frameSizeSubBySpaceshipX) {
                    this.x += geschwindigkeit;
                }
                break;

        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}
