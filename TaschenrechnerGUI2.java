import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerGUI2 extends JFrame implements ActionListener {

    private JTextField ausgabeFeld;
    private JLabel eingabeLabel;
    private JButton additionButton;
    private JButton subtraktionButton;
    private JButton multiplikationButton;
    private JButton divisionButton;
    private JButton ergebnisButton;

    private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0;

    private int eins,zwei,drei,vier,fuenf,sechs,sieben,acht,neun,null0;

    private String plus,minus,mal,durch,istgleich;

    private double[] zahlArr  = new double[10];
    private int zahlIndex = 0;

    public TaschenrechnerGUI2() {

        this.setTitle("mein Taschenrechner"); // Rahmentitel
        this.setSize(350, 350); // Größe Fenster

        // ausgabeFeld
        JPanel hintergrundPanelausgabeFeld = new JPanel();
        this.ausgabeFeld = new JTextField(10); // Initialisierung Textfield
        this.ausgabeFeld.setText("");
        this.ausgabeFeld.setEditable(false);
        hintergrundPanelausgabeFeld.add(this.ausgabeFeld);

        // eingabeLabel
        JPanel hintergrundPaneleingabeLabel = new JPanel();
        this.eingabeLabel = new JLabel();
        this.eingabeLabel.setText(Integer.toString(0));
        hintergrundPaneleingabeLabel.add(eingabeLabel);

        JPanel hintergrundPanelButtonOperanden = new JPanel();

        // additionButton
        this.additionButton = new JButton("+");
        this.additionButton.addActionListener(this);
        hintergrundPanelButtonOperanden.add(additionButton);

        // subtraktionButton
        this.subtraktionButton = new JButton("-");
        this.subtraktionButton.addActionListener(this);
        hintergrundPanelButtonOperanden.add(subtraktionButton);

        // multiplikationButton
        this.multiplikationButton = new JButton("*");
        this.multiplikationButton.addActionListener(this);
        hintergrundPanelButtonOperanden.add(multiplikationButton);

        // divisionButton
        this.divisionButton = new JButton("/");
        this.divisionButton.addActionListener(this);
        hintergrundPanelButtonOperanden.add(divisionButton);

        // ergebnisButton
        this.ergebnisButton = new JButton("=");
        this.ergebnisButton.addActionListener(this);
        hintergrundPanelButtonOperanden.add(ergebnisButton);

        JPanel hintergrundPanelButtonZahlenReihe1 = new JPanel();
        this.b1 = new JButton("1");
        this.b1.addActionListener(this);
        this.b2 = new JButton("2");
        this.b2.addActionListener(this);
        this.b3 = new JButton("3");
        this.b3.addActionListener(this);
        hintergrundPanelButtonZahlenReihe1.add(b1);
        hintergrundPanelButtonZahlenReihe1.add(b2);
        hintergrundPanelButtonZahlenReihe1.add(b3);

        JPanel hintergrundPanelButtonZahlenReihe2 = new JPanel();
        this.b4 = new JButton("4");
        this.b4.addActionListener(this);
        this.b5 = new JButton("5");
        this.b5.addActionListener(this);
        this.b6 = new JButton("6");
        this.b6.addActionListener(this);
        hintergrundPanelButtonZahlenReihe2.add(b4);
        hintergrundPanelButtonZahlenReihe2.add(b5);
        hintergrundPanelButtonZahlenReihe2.add(b6);

        JPanel hintergrundPanelButtonZahlenReihe3 = new JPanel();
        this.b7 = new JButton("7");
        this.b7.addActionListener(this);
        this.b8 = new JButton("8");
        this.b8.addActionListener(this);
        this.b9 = new JButton("9");
        this.b9.addActionListener(this);
        hintergrundPanelButtonZahlenReihe3.add(b7);
        hintergrundPanelButtonZahlenReihe3.add(b8);
        hintergrundPanelButtonZahlenReihe3.add(b9);

        JPanel hintergrundPanelButtonZahlenReihe4 = new JPanel();
        this.b0 = new JButton("0");
        this.b0.addActionListener(this);
        hintergrundPanelButtonZahlenReihe4.add(b0);

        // content pane
        Container contentPane = this.getContentPane();
        contentPane.add(hintergrundPanelausgabeFeld);
        contentPane.add(hintergrundPaneleingabeLabel);
        contentPane.add(hintergrundPanelButtonOperanden);
        contentPane.add(hintergrundPanelButtonZahlenReihe1);
        contentPane.add(hintergrundPanelButtonZahlenReihe2);
        contentPane.add(hintergrundPanelButtonZahlenReihe3);
        contentPane.add(hintergrundPanelButtonZahlenReihe4);
        contentPane.setLayout(new GridLayout(7, 1));

        // Schließbefehl, ich klick auf X und Programm endet, auch in Console
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public double summeBerechnen(double[] arr) {
        double summe = 0;
        for(int i = 0; i<arr.length;i++){
            summe = summe + arr[i];
        }        
        return summe;
    }

    public double differenzBerechnen(double[] arr) {
        double differenz = 0;
        for(int i = 0; i<arr.length;i++){
            differenz = differenz - arr[i];
        }        
        return differenz;
    }
    
    public double produktBerechnen(double[] arr) {
        double produkt = 0;
        for(int i = 0; i<arr.length;i++){
            produkt = produkt * arr[i];
        }        
        return produkt;
    }
         
    public double quotientBerechnen(double[] arr) {
        double quotient = 0;
        for(int i = 0; i<arr.length;i++){
            quotient = quotient / arr[i];
        }        
        return quotient;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object source = e.getSource(); // Welcher Knopf? if (source == this.einzahlenButton) { try {
        
        if (source == this.b0) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b0.getText());
            zahlIndex++;
            this.null0 = Integer.parseInt(this.b0.getText());
            this.eingabeLabel.setText(Double.toString(null0));
        }
        if (source == this.b1) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b1.getText());
            zahlIndex++;
            this.eins = Integer.parseInt(this.b1.getText());
            this.eingabeLabel.setText(Double.toString(eins));
        }
        if (source == this.b2) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b2.getText());
            zahlIndex++;
            this.zwei = Integer.parseInt(this.b2.getText());
            this.eingabeLabel.setText(Double.toString(zwei));
        }
        if (source == this.b3) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b3.getText());
            zahlIndex++;
            this.drei = Integer.parseInt(this.b3.getText());
            this.eingabeLabel.setText(Double.toString(drei));
        }
        if (source == this.b4) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b4.getText());
            zahlIndex++;
            this.vier = Integer.parseInt(this.b4.getText());
            this.eingabeLabel.setText(Double.toString(vier));
        }
        if (source == this.b5) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b5.getText());
            zahlIndex++;
            this.fuenf = Integer.parseInt(this.b5.getText());
            this.eingabeLabel.setText(Double.toString(fuenf));
        }
        if (source == this.b6) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b6.getText());
            zahlIndex++;
            this.sechs = Integer.parseInt(this.b6.getText());
            this.eingabeLabel.setText(Double.toString(sechs));
        }
        if (source == this.b7) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b7.getText());
            zahlIndex++;
            this.sieben = Integer.parseInt(this.b7.getText());
            this.eingabeLabel.setText(Double.toString(sieben));
        }
        if (source == this.b8) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b8.getText());
            zahlIndex++;
            this.acht = Integer.parseInt(this.b8.getText());
            this.eingabeLabel.setText(Double.toString(acht));
        }
        if (source == this.b9) {
            zahlArr[zahlIndex] = Double.parseDouble(this.b9.getText());
            zahlIndex++;
            this.neun = Integer.parseInt(this.b9.getText());
            this.eingabeLabel.setText(Double.toString(neun));
        }
        if (source == this.additionButton) {
            this.plus = this.additionButton.getText();
            this.eingabeLabel.setText(plus);            
            this.ausgabeFeld.setText(Double.toString(summeBerechnen(zahlArr)));
        }
        if (source == this.subtraktionButton) {
            this.minus = this.subtraktionButton.getText();
            this.eingabeLabel.setText(minus);
            this.ausgabeFeld.setText(Double.toString(differenzBerechnen(zahlArr)));
        }
        if (source == this.multiplikationButton) {
            this.mal = this.multiplikationButton.getText();
            this.eingabeLabel.setText(mal);
            this.ausgabeFeld.setText(Double.toString(produktBerechnen(zahlArr)));
        }
        if (source == this.divisionButton) {
            this.durch = this.divisionButton.getText();
            this.eingabeLabel.setText(durch);
            this.ausgabeFeld.setText(Double.toString(quotientBerechnen(zahlArr)));
        }
        if (source == this.ergebnisButton) {
            this.istgleich = "das Ergebnis ist ...";
            this.eingabeLabel.setText(istgleich);
        }
    }

    public static void main(String[] args) {
        // GUI Anfang
        TaschenrechnerGUI2 GUI = new TaschenrechnerGUI2();
        GUI.setVisible(true);
        // GUI Ende
    }
}
