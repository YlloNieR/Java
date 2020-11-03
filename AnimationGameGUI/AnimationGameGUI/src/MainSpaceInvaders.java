import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;


public class MainSpaceInvaders{

    public static int bImgSizeWidth = 1041;
    public static int bImgSizeHeight = 694;  

    public static void main(String[] args) {
        /* Frame */
        JFrame jf = new JFrame();
        jf.setSize(bImgSizeWidth, bImgSizeHeight);
        jf.setVisible(true);
        jf.setTitle("Space Invaders");

        /* Framesize */
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize(); // java.awt.Dimension[width=3440,height=1440]
        // System.out.println(dim); //wenn aktiv dann wird kein Spaceship angezeigt
        jf.setLocation(dim.width / 2 - jf.getSize().width / 2, dim.height / 2 - jf.getSize().height / 2);
        // java.awt.Dimension[width=3440,height=1440]
        // 3440 ,1440
        // 1720 - 800 ,720 -300
        // 920 ,420
        // jf.setLocation(920, 420);

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       


        /* Objekt Spaceship */
        Spaceship sc = new Spaceship();
        jf.addKeyListener(sc);
        jf.add(sc);
    }
}