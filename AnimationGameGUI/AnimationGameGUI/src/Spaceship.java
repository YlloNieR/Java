import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Graphics; //create rectangle or Image

import static java.awt.event.KeyEvent.*;

public class Spaceship extends Sprite implements KeyListener {
    public String spaceShipImgStrPath;
    public int spaceshipStartPosX;
    public int spaceshipStartPosY;
    public int spaceshipSizeWidth;
    public int spaceshipSizeHeight;
    public int spaceshipSpeed;

    public String backgroundImgStrPath;
    public int backgroundFrameSizeX = 1041;
    public int backgroundFrameSizeY = 694;
    public int backgroundStartposX;
    public int backgroundStartposY;
    public int backgroundBImgSizeWidth;
    public int backgroundBImgSizeHeight;

    public int spaceshipImgFrameSizeXSubBySpaceshipX = backgroundFrameSizeX - 121;
    public int spaceshipImgFrameSizeYSubBySpaceshipY = backgroundFrameSizeY - 103;

    public Spaceship() {
        this.spaceShipImgStrPath = "./img/spaceship.png";
        this.spaceshipStartPosX = 100;
        this.spaceshipStartPosY = 220;
        this.spaceshipSizeWidth = 100;
        this.spaceshipSizeHeight = 58;
        this.spaceshipSpeed = 10; // start speed

        this.backgroundImgStrPath = "./img/starSky.jpg";
        this.backgroundStartposX = 0;
        this.backgroundStartposY = 0;
        this.backgroundBImgSizeWidth = backgroundFrameSizeX;
        this.backgroundBImgSizeHeight = backgroundFrameSizeY;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // g.setColor(Color.BLACK);
        // g.fillRect(x, y, spaceshipSizeWidth, spaceshipSizeHeight); //create at
        // startpos x,startpos y with size width=100,height=60

        g.drawImage(getBufferedImg(backgroundImgStrPath), backgroundStartposX, backgroundStartposY, this);
        g.drawImage(getBufferedImg(spaceShipImgStrPath), spaceshipStartPosX, spaceshipStartPosY, this);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_LEFT:
                if (this.spaceshipStartPosX > 0) {
                    this.spaceshipStartPosX -= spaceshipSpeed;
                    break;
                }
            case VK_RIGHT:
                if (this.spaceshipStartPosX < backgroundFrameSizeX) {
                    this.spaceshipStartPosX += spaceshipSpeed;
                    break;
                }
            case VK_DOWN:
                if (this.spaceshipStartPosY < backgroundFrameSizeY) {
                    this.spaceshipStartPosY += spaceshipSpeed;
                    break;
                }
            case VK_UP:
                if (this.spaceshipStartPosY > 0) {
                    this.spaceshipStartPosY -= spaceshipSpeed;
                    break;
                }
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_LEFT:
                if (this.spaceshipStartPosX > 0) {
                    this.spaceshipStartPosX -= spaceshipSpeed;
                    break;
                }
            case VK_RIGHT:
                if (this.spaceshipStartPosX < backgroundFrameSizeX) {
                    this.spaceshipStartPosX += spaceshipSpeed;
                    break;
                }
            case VK_DOWN:
                if (this.spaceshipStartPosY < backgroundFrameSizeY) {
                    this.spaceshipStartPosY += spaceshipSpeed;
                    break;
                }
            case VK_UP:
                if (this.spaceshipStartPosY > 0) {
                    this.spaceshipStartPosY -= spaceshipSpeed;
                    break;
                }
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }
}
