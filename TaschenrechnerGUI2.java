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

    private String istgleich;

    private String[] zahlArr = new String[10];
    private int zahlIndex = 0;

    public TaschenrechnerGUI2() {

        this.setTitle("mein Taschenrechner"); // Rahmentitel
        this.setSize(350, 350); // Größe Fenster

        // eingabeLabel
        JPanel hintergrundPaneleingabeLabel = new JPanel();
        this.eingabeLabel = new JLabel();
        this.eingabeLabel.setText(Integer.toString(0));
        hintergrundPaneleingabeLabel.add(eingabeLabel);

        // ausgabeFeld
        JPanel hintergrundPanelausgabeFeld = new JPanel();
        this.ausgabeFeld = new JTextField(10); // Initialisierung Textfield
        this.ausgabeFeld.setText("");
        this.ausgabeFeld.setEditable(false);
        hintergrundPanelausgabeFeld.add(this.ausgabeFeld);

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
        contentPane.add(hintergrundPaneleingabeLabel);
        contentPane.add(hintergrundPanelausgabeFeld);
        contentPane.add(hintergrundPanelButtonOperanden);
        contentPane.add(hintergrundPanelButtonZahlenReihe1);
        contentPane.add(hintergrundPanelButtonZahlenReihe2);
        contentPane.add(hintergrundPanelButtonZahlenReihe3);
        contentPane.add(hintergrundPanelButtonZahlenReihe4);
        contentPane.setLayout(new GridLayout(7, 1));

        // Schließbefehl, ich klick auf X und Programm endet, auch in Console
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public double summeBerechnen(String[] arr, int laenge) {
        double summe = 0;
        for (int i = 0; i < arr.length; i++) {
            summe = summe + Integer.parseInt(arr[i]);
        }
        return summe;
    }

    public double differenzBerechnen(String[] arr, int laenge) {
        double differenz = 0;
        for (int i = 0; i < arr.length; i++) {
            differenz = differenz - Integer.parseInt(arr[i]);
        }
        return differenz;
    }

    public double produktBerechnen(String[] arr, int laenge) {
        double produkt = 0;
        for (int i = 0; i < arr.length; i++) {
            produkt = produkt * Integer.parseInt(arr[i]);
        }
        return produkt;
    }

    public double quotientBerechnen(String[] arr, int laenge) {
        double quotient = 0;
        for (int i = 0; i < arr.length; i++) {
            quotient = quotient / Integer.parseInt(arr[i]);
        }
        return quotient;
    }

    public void showArray(String[] arr, int laenge) {
        String strArray = "";
        for (int i = 0; i < laenge + 1; i++) {
            try {
                strArray = strArray + Integer.parseInt(arr[i]);
            } catch (NumberFormatException nfe) {
                strArray = strArray + arr[i];
            }
        }
        this.eingabeLabel.setText(strArray);
    }

    public String[] putIntTogether(String[] arrAlt, int position, String operand) {
        String arrNeu[] = new String[10];
        String summeStr = "";
        for (int i = 0; i < position; i++) {
            summeStr = summeStr + arrAlt[i];
        }
        for (int i = 0; i < arrNeu.length; i++)
            if (arrNeu[i] == null) {
                arrNeu[i] = summeStr;
                arrNeu[i + 1] = operand;
                break;
            }
        for (int i = 0; i < arrNeu.length; i++) {
            System.out.print(arrNeu[i]);
        }
        return arrNeu;
    }

    public void berechneErgebnis(String[] arr, int position) {
        double ergebnis = 0;
        String summe = "+";
        String differenz = "-";
        String produkt = "*";
        String quotient = "/";
        System.out.println(ergebnis);

        /*
         * arr = {"122","+","3","*","2","=","0"} position = 5
         * 
         * if (true) { ergebnis = ergebnis + (Double.parseDouble(arr[1 - 1]) +
         * Double.parseDouble(arr[1 + 1])); ergebnis = ergebnis + (122.0 + 3.0); }
         * ergebnis = 125.0
         * 
         * Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException
         * at TaschenrechnerGUI2.berechneErgebnis(TaschenrechnerGUI2.java:201)
         */

        for (int i = 0; i < position; i++) {
            if (arr[i].equals(summe)) {
                ergebnis = ergebnis + (Double.parseDouble(arr[i - 1]) + Double.parseDouble(arr[i + 1]));
            }
        }
        System.out.println(ergebnis);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource(); // Welcher Knopf? if (source == this.einzahlenButton) { try {

        if (source == this.b0) {
            zahlArr[zahlIndex] = this.b0.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b1) {
            zahlArr[zahlIndex] = this.b1.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b2) {
            zahlArr[zahlIndex] = this.b2.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b3) {
            zahlArr[zahlIndex] = this.b3.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b4) {
            zahlArr[zahlIndex] = this.b4.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b5) {
            zahlArr[zahlIndex] = this.b5.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b6) {
            zahlArr[zahlIndex] = this.b6.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b7) {
            zahlArr[zahlIndex] = this.b7.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b8) {
            zahlArr[zahlIndex] = this.b8.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }
        if (source == this.b9) {
            zahlArr[zahlIndex] = this.b9.getText();
            showArray(zahlArr, zahlIndex);
            zahlIndex++;
        }

        // Operationen

        if (source == this.additionButton) {
            zahlArr[zahlIndex] = this.additionButton.getText();
            showArray(zahlArr, zahlIndex);
            putIntTogether(zahlArr, zahlIndex, zahlArr[zahlIndex]);
            zahlIndex++;
        }
        if (source == this.subtraktionButton) {
            zahlArr[zahlIndex] = this.subtraktionButton.getText();
            showArray(zahlArr, zahlIndex);
            putIntTogether(zahlArr, zahlIndex, zahlArr[zahlIndex]);
            zahlIndex++;
        }
        if (source == this.multiplikationButton) {
            zahlArr[zahlIndex] = this.multiplikationButton.getText();
            showArray(zahlArr, zahlIndex);
            putIntTogether(zahlArr, zahlIndex, zahlArr[zahlIndex]);
            zahlIndex++;
        }
        if (source == this.divisionButton) {
            zahlArr[zahlIndex] = this.divisionButton.getText();
            showArray(zahlArr, zahlIndex);
            putIntTogether(zahlArr, zahlIndex, zahlArr[zahlIndex]);
            zahlIndex++;
        }
        if (source == this.ergebnisButton) {
            zahlArr[zahlIndex] = this.ergebnisButton.getText();
            berechneErgebnis(putIntTogether(zahlArr, zahlIndex, zahlArr[zahlIndex]), zahlIndex);

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
