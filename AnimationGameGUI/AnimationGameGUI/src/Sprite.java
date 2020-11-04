import javax.imageio.ImageIO;

import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Sprite extends JPanel{

    public BufferedImage getBufferedImg(String strPath) {
        BufferedImage bImg = null;
        try {
            bImg = ImageIO.read(getClass().getResource(strPath));
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        return bImg;
    }
       
    /*
    public void loadImage(int x,int y, int objectSizeWidth, int objectSizeHeight, int objectStartposX, int objectStartposY, String strPath){
        getBufferedImg(strPath);

    }
    */

}