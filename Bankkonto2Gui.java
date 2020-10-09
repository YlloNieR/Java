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
    private JButton einzahlenButton;
    private JButton abhebenButton;
    private BankKonto2 konto;

    public Bankkonto2Gui(BankKonto2 konto) {

        this.konto = konto;
        this.setTitle("Bankkonto2 GUI"); // Rahmentitel
        this.setSize(280, 180); // Größe Fenster

        // Kontobesitzer
        JPanel hintergrundPanelKontobesitzer = new JPanel();
        JLabel labelKontobesitzer = new JLabel("Kontobesitzer:");
        this.kontobesitzer.setText(this.konto.getKontobesitzer());
        this.kontobesitzer.setEditable(false);
        hintergrundPanelKontobesitzer.add(labelKontobesitzer);
        hintergrundPanelKontobesitzer.add(this.kontobesitzer);

        // Kontostand alt / neu
        JPanel hintergrundPanelKontostand = new JPanel();
        JLabel labelKontostand = new JLabel("Kontostand:");
        this.kontoStandFeld = new JTextField("0.0", 10); // Initialisierung kontoStandFeld Textfield
        this.kontoStandFeld.setEditable(false);
        this.kontoStandFeld.setText(Double.toString(this.konto.getKontostand()) + " Euro");
        hintergrundPanelKontostand.add(labelKontostand);

        // Kontofuehrungsgebuehr
        JPanel hintergrundPanelKontofuehrungsgebuehr = new JPanel();
        JLabel labelKontofuehrungsgebuehr = new JLabel("Kontofuehrungsgebuehr:");
        this.kontofuehrungsgebuehr = new JTextField(10); // Initialisierung kontoStandFeld Textfield
        this.kontofuehrungsgebuehr.setEditable(false);
        this.kontofuehrungsgebuehr.setText(Double.toString(this.konto.getKontofuehrungsgebuehr()) + " Euro");
        hintergrundPanelKontofuehrungsgebuehr.add(labelKontofuehrungsgebuehr);

        // Kontozinssatz
        JPanel hintergrundPanelKontozinssatz = new JPanel();
        JLabel labelKontozinssatz = new JLabel("Kontozinssatz:");
        this.kontozinssatz = new JTextField(10); // Initialisierung kontoStandFeld Textfield
        this.kontozinssatz.setEditable(false);
        this.kontozinssatz.setText(Double.toString(this.konto.getKontozinssatz()) + " %");
        hintergrundPanelKontozinssatz.add(labelKontozinssatz);

        // Betrag Eingabe Feld
        JPanel hintergrundPanelBetragfeld = new JPanel();
        JLabel labelBetragfeld = new JLabel("Betrag:");
        this.betragFeld = new JTextField(10); // Initialisierung betragFeld Textfield
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

        // content pane
        Container contentPane = this.getContentPane();
        contentPane.add(hintergrundPanelKontobesitzer);
        contentPane.add(hintergrundPanelKontostand);
        contentPane.add(hintergrundPanelKontofuehrungsgebuehr);
        contentPane.add(hintergrundPanelKontozinssatz);
        contentPane.add(hintergrundPanelBetragfeld);
        contentPane.add(hintergrundPanelButtons);
        contentPane.setLayout(new GridLayout(6, 1));

        // Schließbefehl, ich klick auf X und Programm endet, auch in Console
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // Welcher Knopf?
        if (source == this.einzahlenButton) {
            double betrag = Double.parseDouble(this.betragFeld.getText());
            this.konto.einzahlen(betrag);
            this.kontoStandFeld.setText(Double.toString(this.konto.getKontostand()));
        }
        if (source == this.abhebenButton) {
            double betrag = Double.parseDouble(this.betragFeld.getText());
            try {
                this.konto.abheben(betrag);
            } catch (AusnahmeException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            this.kontoStandFeld.setText(Double.toString(this.konto.getKontostand()));
        }
    }

}
