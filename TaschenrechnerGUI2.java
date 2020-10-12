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

    private double ersteZahl;
    public double zweiteZahl;
    public String operand;
    public double ergebnis = 0;

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
        this.ausgabeFeld = new JTextField(20); // Initialisierung Textfield
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

    public double summeBerechnen(double a, double b) {
        return a + b;
    }

    public double differenzBerechnen(double a, double b) {
        return a - b;
    }

    public double produktBerechnen(double a, double b) {
        return a * b;
    }

    public double quotientBerechnen(double a, double b) {
        return a / b;
    }

    public void showArray() {
        String strArray = "";
        for (int i = 0; i < zahlArr.length + 1; i++) {
            if (zahlArr[i] != null) {
                try {
                    strArray = strArray + Integer.parseInt(zahlArr[i]);
                } catch (NumberFormatException nfe) {
                    strArray = strArray + zahlArr[i];
                }
            } else {
                break;
            }

        }
        this.eingabeLabel.setText(strArray);
    }

    public void putIntTogetherErste(int position) {
        String summeStr = "";

        for (int i = 0; i < position; i++) {
            summeStr = summeStr + zahlArr[i];
        }

        ersteZahl = Integer.parseInt(summeStr);

        for (int i = 0; i < zahlArr.length; i++) {
            zahlArr[i] = null;
        }
    }

    public void putIntTogetherZweite(int position) {
        String summeStr = "";

        for (int i = 0; i < position; i++) {
            summeStr = summeStr + zahlArr[i];
        }

        zweiteZahl = Integer.parseInt(summeStr);

        for (int i = 0; i < zahlArr.length; i++) {
            zahlArr[i] = null;
        }
    }

    public double berechneErgebnis() {
        String summe = "+";
        String differenz = "-";
        String produkt = "*";
        String quotient = "/";

        if (operand.equals(summe)) {
            this.ergebnis = summeBerechnen(ersteZahl, zweiteZahl);
        }
        if (operand.equals(differenz)) {
            this.ergebnis = differenzBerechnen(ersteZahl, zweiteZahl);
        }
        if (operand.equals(produkt)) {
            this.ergebnis = produktBerechnen(ersteZahl, zweiteZahl);
        }
        if (operand.equals(quotient)) {
            this.ergebnis = quotientBerechnen(ersteZahl, zweiteZahl);
        }
        return this.ergebnis;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object source = e.getSource(); // Welcher Knopf? if (source == this.einzahlenButton) { try {

        if (source == this.b0) {
            zahlArr[zahlIndex] = this.b0.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b1) {
            zahlArr[zahlIndex] = this.b1.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b2) {
            zahlArr[zahlIndex] = this.b2.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b3) {
            zahlArr[zahlIndex] = this.b3.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b4) {
            zahlArr[zahlIndex] = this.b4.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b5) {
            zahlArr[zahlIndex] = this.b5.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b6) {
            zahlArr[zahlIndex] = this.b6.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b7) {
            zahlArr[zahlIndex] = this.b7.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b8) {
            zahlArr[zahlIndex] = this.b8.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }
        if (source == this.b9) {
            zahlArr[zahlIndex] = this.b9.getText();
            showArray();
            zahlIndex++;
            this.ausgabeFeld.setText("");
        }

        // Operationen

        if (source == this.additionButton) {
            zahlArr[zahlIndex] = this.additionButton.getText();
            showArray();
            operand = zahlArr[zahlIndex];
            if (this.ausgabeFeld.getText().equals("")) {
                putIntTogetherErste(zahlIndex);
            }
            zahlIndex = 0;
        }
        if (source == this.subtraktionButton) {
            zahlArr[zahlIndex] = this.subtraktionButton.getText();
            showArray();
            operand = zahlArr[zahlIndex];

            if (this.ausgabeFeld.getText().equals("")) {
                putIntTogetherErste(zahlIndex);
            }
            zahlIndex = 0;
        }
        if (source == this.multiplikationButton) {
            zahlArr[zahlIndex] = this.multiplikationButton.getText();
            showArray();
            operand = zahlArr[zahlIndex];

            if (this.ausgabeFeld.getText().equals("")) {
                putIntTogetherErste(zahlIndex);
            }
            zahlIndex = 0;
        }
        if (source == this.divisionButton) {
            zahlArr[zahlIndex] = this.divisionButton.getText();
            showArray();
            operand = zahlArr[zahlIndex];

            if (this.ausgabeFeld.getText().equals("")) {
                putIntTogetherErste(zahlIndex);
            }
            zahlIndex = 0;
        }
        if (source == this.ergebnisButton) {
            zahlArr[zahlIndex] = this.ergebnisButton.getText();
            putIntTogetherZweite(zahlIndex);

            this.eingabeLabel.setText("das Ergebnis ist ...");
            this.ausgabeFeld.setText(Double.toString(berechneErgebnis()));
            ersteZahl = this.ergebnis;
            zweiteZahl = 0;
            zahlIndex = 0;
        }
    }

    public static void main(String[] args) {
        // GUI Anfang
        TaschenrechnerGUI2 GUI = new TaschenrechnerGUI2();
        GUI.setVisible(true);
        // GUI Ende
    }
}
