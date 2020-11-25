import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.GridLayout;

public class Ticket extends JFrame {

    public Ticket() {
        this.setTitle("Ticket");
        this.setSize(250, 160);

        JLabel ticketOutput1 = new JLabel(" ##################");
        JLabel ticketOutput2 = new JLabel(" # The HM Line         #");
        JLabel ticketOutput3 = new JLabel(" # Ticket                    #");
        JLabel ticketOutput4 = new JLabel(" # 50Cents.               #");
        JLabel ticketOutput5 = new JLabel(" ##################");
        Container contentPane = this.getContentPane();
        contentPane.add(ticketOutput1);
        contentPane.add(ticketOutput2);
        contentPane.add(ticketOutput3);
        contentPane.add(ticketOutput4);
        contentPane.add(ticketOutput5);

        contentPane.setLayout(new GridLayout(5, 0));
    }
}
