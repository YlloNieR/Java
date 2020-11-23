import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class TicketMachineGUI extends JFrame {

    // column left
    private JLabel balanceStatusLabel;
    private JTextField balanceStatusTextfield;

    private JButton insertOneCentCoinButton;
    private JButton insertTwoCentCoinButton;
    private JButton insertFiveCentCoinButton;
    private JButton insertTenCentCoinButton;
    private JButton refundButton;
    private JButton getTicketButton;

    // column right
    private JLabel internalStorageLabel;

    private JLabel oneCentCoinsLabel;
    private JTextField oneCentCoinsTextfield;
    private JLabel twoCentCoinsLabel;
    private JTextField twoCentCoinsTextfield;
    private JLabel fiveCentCoinsLabel;
    private JTextField fiveCentCoinsTextfield;
    private JLabel tenCentCoinsLabel;
    private JTextField tenCentCoinsTextfield;

    public TicketMachineGUI() {

        this.setTitle("Ticket Machine"); // Titel
        this.setSize(380, 300);
      
        // column left
        JPanel backgroundPanelBalanceStatusLabel = new JPanel();
        JLabel balanceStatusLabel = new JLabel("Balance:");
        this.balanceStatusTextfield = new JTextField(10);
        this.balanceStatusTextfield.setEditable(false);
        backgroundPanelBalanceStatusLabel.add(this.balanceStatusLabel);
        backgroundPanelBalanceStatusLabel.add(this.balanceStatusTextfield);

        JPanel backgroundPanelButtons = new JPanel();
        this.insertOneCentCoinButton = new JButton("Insert 1Ct Coin");
        //this.insertOneCentCoinButton.addActionListener(this);

        this.insertTwoCentCoinButton = new JButton("Insert 2Ct Coin");
        //this.insertTwoCentCoinButton.addActionListener(this);
        
        this.insertFiveCentCoinButton = new JButton("Insert 5Ct Coin");
        //this.insertFiveCentCoinButton.addActionListener(this);

        this.insertTenCentCoinButton = new JButton("Insert 10Ct Coin");
        //this.insertTenCentCoinButton.addActionListener(this);

        this.refundButton = new JButton("Refund");
        //this.refundButton.addActionListener(this);

        this.getTicketButton = new JButton("Get Ticket");
        //this.getTicketButton.addActionListener(this);

        backgroundPanelButtons.add(this.insertOneCentCoinButton);
        backgroundPanelButtons.add(this.insertTwoCentCoinButton);
        backgroundPanelButtons.add(this.insertFiveCentCoinButton);
        backgroundPanelButtons.add(this.insertTenCentCoinButton);
        backgroundPanelButtons.add(this.refundButton);
        backgroundPanelButtons.add(this.getTicketButton);

        // column right
        JPanel backgroundPanelInternalStorage = new JPanel();
        JLabel internalStorageLabel = new JLabel("Internal Storage");
        backgroundPanelInternalStorage.add(this.internalStorageLabel);

        JPanel backgroundPanelCoinCounter = new JPanel();
        JLabel oneCentCoinsLabel = new JLabel("1 Ct Coins:");
        this.oneCentCoinsTextfield = new JTextField(2);        
        backgroundPanelCoinCounter.add(this.oneCentCoinsLabel);
        backgroundPanelCoinCounter.add(this.oneCentCoinsTextfield);

        JLabel twoCentCoinsLabel = new JLabel("2 Ct Coins:");
        this.twoCentCoinsTextfield = new JTextField(2);
        backgroundPanelCoinCounter.add(this.twoCentCoinsLabel);
        backgroundPanelCoinCounter.add(this.twoCentCoinsTextfield);

        JLabel fiveCentCoinsLabel = new JLabel("5 Ct Coins:");
        this.fiveCentCoinsTextfield = new JTextField(2);
        backgroundPanelCoinCounter.add(this.fiveCentCoinsLabel);
        backgroundPanelCoinCounter.add(this.fiveCentCoinsTextfield);

        JLabel tenCentCoinsLabel = new JLabel("10 Ct Coins:");
        this.tenCentCoinsTextfield = new JTextField(2);
        backgroundPanelCoinCounter.add(this.tenCentCoinsLabel);
        backgroundPanelCoinCounter.add(this.tenCentCoinsTextfield);

        Container contentPane = this.getContentPane();
        contentPane.add(backgroundPanelBalanceStatusLabel);
        contentPane.add(backgroundPanelButtons);
        contentPane.add(backgroundPanelInternalStorage);
        contentPane.add(backgroundPanelCoinCounter);
        contentPane.setLayout(new GridLayout(4, 2));
    }
}