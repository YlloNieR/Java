import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;

public class BuyTicket extends JFrame {

    public BuyTicket() {
        this.setTitle("Error");
        this.setSize(250, 100);

        JLabel errorOutput1 = new JLabel(" ############################# ");
        JLabel errorOutput2 = new JLabel(" # Please put more Coins in me  # ");
        JLabel errorOutput3 = new JLabel(" ############################# ");
        Container contentPane = this.getContentPane();
        contentPane.add(errorOutput1);
        contentPane.add(errorOutput2);
        contentPane.add(errorOutput3);

        contentPane.setLayout(new GridLayout(3, 0));
    }
}
