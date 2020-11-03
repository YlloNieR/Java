import javax.imageio.ImageIO;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class BackgroundImg extends JPanel {

    public int x; // startpos x
    public int y; // startpos y

    public int bImgSizeWidth;
    public int bImgSizeHeight;

    public int frameSizeX = 1041;
    public int frameSizeY = 694;

    public BufferedImage bImg = null;

    public BackgroundImg() {
        this.x = 0; // startpos x
        this.y = 0; // startpos y
        this.bImgSizeWidth = frameSizeX;
        this.bImgSizeHeight = frameSizeY;
    }

    public BufferedImage getImg() {
        try {
            bImg = ImageIO.read(getClass().getResource("./img/starSky.jpg"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return bImg;
    }
    
    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.drawImage(getImg(), x, y, this);
    }
}
