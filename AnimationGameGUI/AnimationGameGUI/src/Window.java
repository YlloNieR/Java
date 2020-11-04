
import javax.imageio.ImageIO;
import java.awt.Graphics; //create rectangle or Image
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Window extends Sprite {

    public String backgroundImgStrPath;
    public int backgroundBframeSizeX = 1041;
    public int backgroundBframeSizeY = 694;
    public int backgroundStartposX;
    public int backgroundStartposY;
    public int backgroundBImgSizeWidth;
    public int backgroundBImgSizeHeight;

    public Window() {
        this.spaceShipImgStrPath = "./img/spaceship.png";
        this.spaceshipStartPosX = 100;
        this.spaceshipStartPosY = 220;
        this.spaceshipSizeWidth = 100;
        this.spaceshipSizeHeight = 58;
        this.spaceshipSpeed = 10; // start speed

        this.backgroundImgStrPath = "./img/starSky.jpg";
        this.backgroundStartposX = 0;
        this.backgroundStartposY = 0;
        this.backgroundBImgSizeWidth = backgroundBframeSizeX;
        this.backgroundBImgSizeHeight = backgroundBframeSizeY;
    }

    
}
