import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketMachineGUI extends JFrame implements ActionListener {

    private JTextField balanceStatusTextfield;
    private JButton insertOneCentCoinButton;
    private JButton insertTwoCentCoinButton;
    private JButton insertFiveCentCoinButton;
    private JButton insertTenCentCoinButton;
    private JButton RefundButton;
    private JButton GetTicketButton;
    private JTextField oneCentCoinsTextfield;
    private JTextField twoCentCoinsTextfield;
    private JTextField fiveCentCoinsTextfield;
    private JTextField tenCentCoinsTextfield;

    public int balanceCount = 0;

    public TicketMachineGUI() {        
        this.setTitle("Ticket Machine");
        this.setSize(280, 300);
      
        // First
        JPanel backgroundPanelFirst = new JPanel();
        JLabel balanceStatusLabel = new JLabel("Balance:");        
        this.balanceStatusTextfield = new JTextField(2);
        this.balanceStatusTextfield.setText(Integer.toString(balanceCount));        
        this.balanceStatusTextfield.setEditable(false);
        JLabel internalStorageLabel = new JLabel("Internal Storage");
 
        backgroundPanelFirst.add(balanceStatusLabel);
        backgroundPanelFirst.add(this.balanceStatusTextfield);
        backgroundPanelFirst.add(internalStorageLabel);

        // Second
        JPanel backgroundPanelSecond = new JPanel();        
        this.insertOneCentCoinButton = new JButton("Insert 1Ct Coin");
        JLabel oneCentCoinsLabel = new JLabel("1 Ct Coins:");
        this.oneCentCoinsTextfield = new JTextField(2);  
        this.oneCentCoinsTextfield.setEditable(false);


        backgroundPanelSecond.add(this.insertOneCentCoinButton);
        backgroundPanelSecond.add(oneCentCoinsLabel);
        backgroundPanelSecond.add(this.oneCentCoinsTextfield);

        // Third
        JPanel backgroundPanelThird = new JPanel();
        this.insertTwoCentCoinButton = new JButton("Insert 2Ct Coin");
        JLabel twoCentCoinsLabel = new JLabel("2 Ct Coins:");
        this.twoCentCoinsTextfield = new JTextField(2);
        this.twoCentCoinsTextfield.setEditable(false);

        backgroundPanelThird.add(this.insertTwoCentCoinButton);
        backgroundPanelThird.add(twoCentCoinsLabel);
        backgroundPanelThird.add(this.twoCentCoinsTextfield);

        // Fourth
        JPanel backgroundPanelFourth = new JPanel();
        this.insertFiveCentCoinButton = new JButton("Insert 5Ct Coin");
        JLabel fiveCentCoinsLabel = new JLabel("5 Ct Coins:");
        this.fiveCentCoinsTextfield = new JTextField(2);
        this.fiveCentCoinsTextfield.setEditable(false);

        backgroundPanelFourth.add(this.insertFiveCentCoinButton);
        backgroundPanelFourth.add(fiveCentCoinsLabel);
        backgroundPanelFourth.add(this.fiveCentCoinsTextfield);

        // Fifth
        JPanel backgroundPanelFifth = new JPanel();
        this.insertTenCentCoinButton = new JButton("Insert 10Ct Coin");
        JLabel tenCentCoinsLabel = new JLabel("10 Ct Coins:");
        this.tenCentCoinsTextfield = new JTextField(2);
        this.tenCentCoinsTextfield.setEditable(false);

        backgroundPanelFifth.add(this.insertTenCentCoinButton);
        backgroundPanelFifth.add(tenCentCoinsLabel);
        backgroundPanelFifth.add(this.tenCentCoinsTextfield);

        // Sixth
        JPanel backgroundPanelSixth = new JPanel();
        this.RefundButton = new JButton("Refund");
        backgroundPanelSixth.add(this.RefundButton);

        // Seventh
        JPanel backgroundPanelSeventh = new JPanel();
        this.GetTicketButton = new JButton("Get Ticket");
        backgroundPanelSeventh.add(this.GetTicketButton);

         // content pane
        Container contentPane = this.getContentPane();
        contentPane.add(backgroundPanelFirst);
        contentPane.add(backgroundPanelSecond);
        contentPane.add(backgroundPanelThird);
        contentPane.add(backgroundPanelFourth);
        contentPane.add(backgroundPanelFifth);
        contentPane.add(backgroundPanelSixth);
        contentPane.add(backgroundPanelSeventh);
        contentPane.setLayout(new GridLayout(7,0));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == this.insertOneCentCoinButton){
            this.balanceCount = this.balanceCount+1;
        }

    }
}