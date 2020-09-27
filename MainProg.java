import javax.swing.*;
import java.awt.*;

public class MainProg extends JFrame {
    public MainProg() {
        this.add(new Fenster());
        this.pack();
        this.setTitle("Dino Fight");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MainProg mainProg = new MainProg();
        mainProg.setVisible(true);
        
       
            
    }
}
