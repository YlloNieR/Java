import javax.swing.JFrame;
import java.io.IOException;

public class MainSpaceInvaders extends JFrame {

    public MainSpaceInvaders() throws IOException {
        Window wd = new Window();        
        add(wd);
        setResizable(false);
        pack();
        setTitle("Space Invaders");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws IOException {
        MainSpaceInvaders mainSpaceInvaders = new MainSpaceInvaders();        
        mainSpaceInvaders.setVisible(true);
    }
}