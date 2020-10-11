import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bankkonto2Gui extends JFrame implements ActionListener {

    private JTextField kontobesitzer;
    private JTextField kontoStandFeld;
    private JTextField kontofuehrungsgebuehr;
    private JTextField kontozinssatz;
    private JTextField betragFeld;
    private JLabel labelErrormeldung;
    private JButton einzahlenButton;
    private JButton abhebenButton;
    private JButton speicherbutton;
    private BankKonto2 konto;

    public Bankkonto2Gui(BankKonto2 konto) {

        this.konto = konto;
        this.setTitle("Bankkonto2 GUI"); // Rahmentitel
        this.setSize(350, 350); // Größe Fenster

        // Kontobesitzer
        JPanel hintergrundPanelKontobesitzer = new JPanel();
        JLabel labelKontobesitzer = new JLabel("Kontobesitzer:");
        this.kontobesitzer = new JTextField(10); // Initialisierung Textfield
        this.kontobesitzer.setText(konto.getKontobesitzer());
        this.kontobesitzer.setEditable(false);
        hintergrundPanelKontobesitzer.add(labelKontobesitzer);
        hintergrundPanelKontobesitzer.add(this.kontobesitzer);

        // Kontostand alt / neu
        JPanel hintergrundPanelKontostand = new JPanel();
        JLabel labelKontostand = new JLabel("Kontostand:");
        this.kontoStandFeld = new JTextField("0.0", 10); // Initialisierung Textfield
        this.kontoStandFeld.setText(konto.kommastellen(this.konto.getKontostand()) + " Euro");
        this.kontoStandFeld.setEditable(false);
        hintergrundPanelKontostand.add(labelKontostand);
        hintergrundPanelKontostand.add(this.kontoStandFeld);

        // Kontofuehrungsgebuehr
        JPanel hintergrundPanelKontofuehrungsgebuehr = new JPanel();
        JLabel labelKontofuehrungsgebuehr = new JLabel("Kontofuehrungsgebuehr:");
        this.kontofuehrungsgebuehr = new JTextField(10); // Initialisierung Textfield
        this.kontofuehrungsgebuehr.setText(konto.kommastellen(this.konto.getKontofuehrungsgebuehr()) + " Euro");
        this.kontofuehrungsgebuehr.setEditable(false);
        hintergrundPanelKontofuehrungsgebuehr.add(labelKontofuehrungsgebuehr);
        hintergrundPanelKontofuehrungsgebuehr.add(this.kontofuehrungsgebuehr);

        // Kontozinssatz
        JPanel hintergrundPanelKontozinssatz = new JPanel();
        JLabel labelKontozinssatz = new JLabel("Kontozinssatz:");
        this.kontozinssatz = new JTextField(10); // Initialisierung Textfield
        this.kontozinssatz.setEditable(false);
        this.kontozinssatz.setText(konto.kommastellen(this.konto.getKontozinssatz()) + " %");
        hintergrundPanelKontozinssatz.add(labelKontozinssatz);
        hintergrundPanelKontozinssatz.add(this.kontozinssatz);

        // Betrag Eingabe Feld
        JPanel hintergrundPanelBetragfeld = new JPanel();
        JLabel labelBetragfeld = new JLabel("Betrag:");
        this.betragFeld = new JTextField(10); // Initialisierung Textfield
        hintergrundPanelBetragfeld.add(labelBetragfeld);
        hintergrundPanelBetragfeld.add(this.betragFeld);

        // Button
        JPanel hintergrundPanelButtons = new JPanel();

        // Einzahlen
        this.einzahlenButton = new JButton("Einzahlen");
        this.einzahlenButton.addActionListener(this);
        hintergrundPanelButtons.add(einzahlenButton);

        // Abheben
        this.abhebenButton = new JButton("Abheben");
        this.abhebenButton.addActionListener(this);
        hintergrundPanelButtons.add(abhebenButton);

        // Speichern in json
        JPanel hintergrundPanelSpeicherbutton = new JPanel();
        this.speicherbutton = new JButton("Speichern in json");
        this.speicherbutton.addActionListener(this);
        hintergrundPanelSpeicherbutton.add(speicherbutton);

        // Error Meldung Feld
        JPanel hintergrundPanelErrorMeldungfeld = new JPanel();
        this.labelErrormeldung = new JLabel();
        hintergrundPanelErrorMeldungfeld.add(labelErrormeldung);

        // content pane
        Container contentPane = this.getContentPane();
        contentPane.add(hintergrundPanelKontobesitzer);
        contentPane.add(hintergrundPanelKontostand);
        contentPane.add(hintergrundPanelKontofuehrungsgebuehr);
        contentPane.add(hintergrundPanelKontozinssatz);
        contentPane.add(hintergrundPanelBetragfeld);
        contentPane.add(hintergrundPanelButtons);
        contentPane.add(hintergrundPanelSpeicherbutton);
        contentPane.add(hintergrundPanelErrorMeldungfeld);
        contentPane.setLayout(new GridLayout(8, 1));

        // Schließbefehl, ich klick auf X und Programm endet, auch in Console
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // Welcher Knopf?
        if (source == this.einzahlenButton) {
            try {
                double betrag = Double.parseDouble(this.betragFeld.getText());
                this.konto.einzahlen(betrag);
                this.kontoStandFeld.setText(konto.kommastellen(this.konto.getKontostand()) + " Euro");
                this.labelErrormeldung.setText("");

            } catch (NumberFormatException nfe) {
                this.labelErrormeldung.setText("Sie haben keinen Betrag eingeben!");
            }

        }
        if (source == this.abhebenButton) {
            double betrag = Double.parseDouble(this.betragFeld.getText());
            try {
                this.konto.abheben(betrag);
            } catch (AusnahmeException e1) {
                e1.printStackTrace();
            }
            this.kontoStandFeld.setText(konto.kommastellen(this.konto.getKontostand()) + " Euro");
        }
        if (source == this.speicherbutton) {
        }
    }

}
