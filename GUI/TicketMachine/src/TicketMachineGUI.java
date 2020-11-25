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
    private JButton refundButton;
    private JButton getTicketButton;
    private JTextField oneCentCoinsTextfield;
    private JTextField twoCentCoinsTextfield;
    private JTextField fiveCentCoinsTextfield;
    private JTextField tenCentCoinsTextfield;

    public int balanceCount = 0;
    public int oneCentCount = 0;
    public int twoCentCount = 0;
    public int fiveCentCount = 0;
    public int tenCentCount = 0;
    public Ticket ticketGUI = new Ticket();
    public BuyTicket buyTicketGUI = new BuyTicket();
    public int restCount;
    public int tmp;

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
        this.insertOneCentCoinButton.addActionListener(this);
        JLabel oneCentCoinsLabel = new JLabel("1 Ct Coins:");
        this.oneCentCoinsTextfield = new JTextField(2);
        this.oneCentCoinsTextfield.setEditable(false);

        backgroundPanelSecond.add(this.insertOneCentCoinButton);
        backgroundPanelSecond.add(oneCentCoinsLabel);
        backgroundPanelSecond.add(this.oneCentCoinsTextfield);

        // Third
        JPanel backgroundPanelThird = new JPanel();
        this.insertTwoCentCoinButton = new JButton("Insert 2Ct Coin");
        this.insertTwoCentCoinButton.addActionListener(this);
        JLabel twoCentCoinsLabel = new JLabel("2 Ct Coins:");
        this.twoCentCoinsTextfield = new JTextField(2);
        this.twoCentCoinsTextfield.setEditable(false);

        backgroundPanelThird.add(this.insertTwoCentCoinButton);
        backgroundPanelThird.add(twoCentCoinsLabel);
        backgroundPanelThird.add(this.twoCentCoinsTextfield);

        // Fourth
        JPanel backgroundPanelFourth = new JPanel();
        this.insertFiveCentCoinButton = new JButton("Insert 5Ct Coin");
        this.insertFiveCentCoinButton.addActionListener(this);
        JLabel fiveCentCoinsLabel = new JLabel("5 Ct Coins:");
        this.fiveCentCoinsTextfield = new JTextField(2);
        this.fiveCentCoinsTextfield.setEditable(false);

        backgroundPanelFourth.add(this.insertFiveCentCoinButton);
        backgroundPanelFourth.add(fiveCentCoinsLabel);
        backgroundPanelFourth.add(this.fiveCentCoinsTextfield);

        // Fifth
        JPanel backgroundPanelFifth = new JPanel();
        this.insertTenCentCoinButton = new JButton("Insert 10Ct Coin");
        this.insertTenCentCoinButton.addActionListener(this);
        JLabel tenCentCoinsLabel = new JLabel("10 Ct Coins:");
        this.tenCentCoinsTextfield = new JTextField(2);
        this.tenCentCoinsTextfield.setEditable(false);

        backgroundPanelFifth.add(this.insertTenCentCoinButton);
        backgroundPanelFifth.add(tenCentCoinsLabel);
        backgroundPanelFifth.add(this.tenCentCoinsTextfield);

        // Sixth
        JPanel backgroundPanelSixth = new JPanel();
        this.refundButton = new JButton("Refund");
        this.refundButton.addActionListener(this);
        backgroundPanelSixth.add(this.refundButton);

        // Seventh
        JPanel backgroundPanelSeventh = new JPanel();
        this.getTicketButton = new JButton("Get Ticket");
        this.getTicketButton.addActionListener(this);
        backgroundPanelSeventh.add(this.getTicketButton);

        // content pane
        Container contentPane = this.getContentPane();
        contentPane.add(backgroundPanelFirst);
        contentPane.add(backgroundPanelSecond);
        contentPane.add(backgroundPanelThird);
        contentPane.add(backgroundPanelFourth);
        contentPane.add(backgroundPanelFifth);
        contentPane.add(backgroundPanelSixth);
        contentPane.add(backgroundPanelSeventh);
        contentPane.setLayout(new GridLayout(7, 0));

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public int calculationTotal(int insertCoin) {
        this.balanceCount = this.balanceCount + insertCoin;
        return balanceCount;
    }

    public void calculationCoinsOnly(int insertCoin) {
        if (insertCoin == 1) {
            this.oneCentCount++;
            this.oneCentCoinsTextfield.setText(Integer.toString(this.oneCentCount));
        }
        if (insertCoin == 2) {
            this.twoCentCount++;
            this.twoCentCoinsTextfield.setText(Integer.toString(this.twoCentCount));
        }
        if (insertCoin == 5) {
            this.fiveCentCount++;
            this.fiveCentCoinsTextfield.setText(Integer.toString(this.fiveCentCount));
        }
        if (insertCoin == 10) {
            this.tenCentCount++;
            this.tenCentCoinsTextfield.setText(Integer.toString(this.tenCentCount));
        }
    }

    public void setNULL(int option){        
        switch(option){
        case 1:
            this.oneCentCoinsTextfield.setText("0");
            this.twoCentCoinsTextfield.setText("0");           
            this.fiveCentCoinsTextfield.setText("0");           
            this.tenCentCoinsTextfield.setText("0");  
            oneCentCount = 0;
            twoCentCount = 0;
            fiveCentCount = 0;
            tenCentCount = 0;         
            break;               
        case 2:
            this.balanceStatusTextfield.setText("0");
            this.oneCentCoinsTextfield.setText("");
            this.twoCentCoinsTextfield.setText("");
            this.fiveCentCoinsTextfield.setText("");
            this.tenCentCoinsTextfield.setText("");
            balanceCount = 0;
            oneCentCount = 0;
            twoCentCount = 0;
            fiveCentCount = 0;
            tenCentCount = 0;
            break;
        }
    }

    public void checkRest(int coin){
        while(coin > 0) {
            if(coin - 10 >= 0 ) {
                this.tenCentCount = coin / 10;
                coin = coin - (this.tenCentCount * 10);
                this.tenCentCoinsTextfield.setText(Integer.toString(this.tenCentCount));
            } else if(coin - 5 >= 0){
                this.fiveCentCount = coin / 5;
                coin = coin - (this.fiveCentCount * 5);
                this.fiveCentCoinsTextfield.setText(Integer.toString(this.fiveCentCount));
            } else if(coin - 2 >= 0){
                this.twoCentCount = coin / 2;
                coin = coin - (this.twoCentCount * 2);
                this.twoCentCoinsTextfield.setText(Integer.toString(this.twoCentCount));
            } else if(coin - 1 >= 0){
                this.oneCentCount = coin / 1;
                coin = coin - (this.twoCentCount * 1);
                this.oneCentCoinsTextfield.setText(Integer.toString(this.oneCentCount));
            }          
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == this.insertOneCentCoinButton) {
            try {
                this.balanceStatusTextfield.setText(Integer.toString(calculationTotal(1)));
                calculationCoinsOnly(1);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (source == this.insertTwoCentCoinButton) {
            try {
                this.balanceStatusTextfield.setText(Integer.toString(calculationTotal(2)));
                calculationCoinsOnly(2);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (source == this.insertFiveCentCoinButton) {
            try {
                this.balanceStatusTextfield.setText(Integer.toString(calculationTotal(5)));
                calculationCoinsOnly(5);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (source == this.insertTenCentCoinButton) {
            try {
                this.balanceStatusTextfield.setText(Integer.toString(calculationTotal(10)));
                calculationCoinsOnly(10);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (source == this.refundButton) {
            try {
                setNULL(2);
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
        if (source == this.getTicketButton) {
            if (balanceCount > 50) {
                balanceCount = balanceCount - 50;
                this.balanceStatusTextfield.setText(Integer.toString(balanceCount));
                setNULL(1);
                checkRest(balanceCount);
                try {
                    ticketGUI.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            } else {
                try {
                    buyTicketGUI.setVisible(true);
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}