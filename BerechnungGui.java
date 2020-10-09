
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BerechnungGui extends JFrame implements ActionListener {

    private JTextField eingabe1;
    private JTextField eingabe2;
    private JTextField ausgabe;
    private JButton summeButton;
    private JButton produktButton;

    public BerechnungGui() {

        this.setTitle("Berechnung Summe Produkt"); // Rahmentitel
        this.setSize(380, 280); // Größe Fenster

        // Eingabe
        this.eingabe1 = new JTextField(10);
        this.eingabe2 = new JTextField(10);

        // Label + Input Feld Zahl Eins
        JPanel hintergrundPanelZahlEins = new JPanel();
        JLabel labelZahlEins = new JLabel("1. Zahl:");
        hintergrundPanelZahlEins.add(labelZahlEins);
        hintergrundPanelZahlEins.add(this.eingabe1);

        // Label + Input Feld Zahl Zwei
        JPanel hintergrundPanelZahlZwei = new JPanel();
        JLabel labelZahlZwei = new JLabel("2. Zahl:");
        hintergrundPanelZahlZwei.add(labelZahlZwei);
        hintergrundPanelZahlZwei.add(this.eingabe2);

        // Button Panel erstellen
        JPanel hintergrundPanelButton = new JPanel();

        // Button Summe
        this.summeButton = new JButton("Summe");
        this.summeButton.addActionListener(this);
        hintergrundPanelButton.add(this.summeButton);

        // Button Produkt
        this.produktButton = new JButton("Produkt");
        this.produktButton.addActionListener(this);
        hintergrundPanelButton.add(this.produktButton);

        // Label + Input Feld Ausgabe
        JPanel hintergrundPanelAusgabe = new JPanel();
        this.ausgabe = new JTextField(10);
        this.ausgabe.setEditable(false);
        JLabel labelAusgabe = new JLabel("Ausgabe:");
        hintergrundPanelAusgabe.add(labelAusgabe);
        hintergrundPanelAusgabe.add(this.ausgabe);

        // content pane Anbringen der erstellten Teile am Fenster
        Container contentPane = this.getContentPane();
        contentPane.add(hintergrundPanelZahlEins);
        contentPane.add(hintergrundPanelZahlZwei);
        contentPane.add(hintergrundPanelButton);
        contentPane.add(hintergrundPanelAusgabe);
        // 4 Zeilen mit immer einer Spalte
        contentPane.setLayout(new GridLayout(4, 1)); 

        // Schließbefehl, ich klick auf X und Programm endet, auch in Console
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public double produktBerechnen(double x, double y) {
        double produkt = x * y;
        return produkt;
    }

    public double summeBerechnen(double x, double y) {
        double summe = x + y;
        return summe;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Welcher Knopf? = source
        Object source = e.getSource(); 
        if (source == this.summeButton) {
            double zahl1 = Double.parseDouble(this.eingabe1.getText());
            double zahl2 = Double.parseDouble(this.eingabe2.getText());
            ausgabe.setText(Double.toString(summeBerechnen(zahl1, zahl2)));
        }

        if (source == this.produktButton) {
            double zahl1 = Double.parseDouble(this.eingabe1.getText());
            double zahl2 = Double.parseDouble(this.eingabe2.getText());
            ausgabe.setText(Double.toString(produktBerechnen(zahl1, zahl2)));
        }
    }

    public static void main(String[] args) {
        // GUI Anfang
        BerechnungGui GUI = new BerechnungGui();
        GUI.setVisible(true);
        // GUI Ende
    }

}
