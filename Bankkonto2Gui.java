import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bankkonto2Gui extends JFrame implements ActionListener {

    private JTextField kontoStandFeld;
    private JTextField betragFeld;
    private JButton einzahlenButton;
    private JButton abhebenButton;
    private BankKonto2 konto;

    public Bankkonto2Gui(BankKonto2 konto) {

        this.konto = konto;
        this.setTitle("Bankkonto2 GUI"); // Rahmentitel
        this.setSize(280, 180); // Größe Fenster

        // Eingabe
        this.kontoStandFeld = new JTextField("0.0", 10); // Initialisierung kontoStandFeld Textfield
        this.kontoStandFeld.setEditable(false);
        this.betragFeld = new JTextField(10); // Initialisierung betragFeld Textfield
        this.kontoStandFeld.setText(Double.toString(this.konto.getKontoStand()));

        // Button
        this.einzahlenButton = new JButton("Einzahlen");
        this.einzahlenButton.addActionListener(this);
        this.abhebenButton = new JButton("Abheben");
        this.abhebenButton.addActionListener(this);

        // Label
        JLabel labelKontoStand = new JLabel("Kontostand:"); // Initialisierung labelKontoStand
        JPanel hintergrundPanel = new JPanel(); // Initialisierung hintergrundPanel
        hintergrundPanel.add(labelKontoStand); // Hinzufügen des Label labelKontoStand
        hintergrundPanel.add(this.kontoStandFeld); // Hinzufügen des Ist Standes

        JPanel betragPanel = new JPanel();
        JLabel labelBetrag = new JLabel("Betrag");
        betragPanel.add(labelBetrag);
        betragPanel.add(this.betragFeld);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(this.einzahlenButton);
        buttonPanel.add(this.abhebenButton);

        // content pane
        Container contentPane = this.getContentPane();
        contentPane.add(hintergrundPanel);
        contentPane.add(betragPanel);
        contentPane.add(buttonPanel);
        contentPane.setLayout(new GridLayout(3, 1));

        // Schließbefehl, ich klick auf X und Programm endet, auch in Console
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource(); // Welcher Knopf?
        if (source == this.einzahlenButton) {
            double betrag = Double.parseDouble(this.betragFeld.getText());
            this.konto.einzahlen(betrag);
            this.kontoStandFeld.setText(Double.toString(this.konto.getKontoStand()));
        }
        if (source == this.abhebenButton) {
            double betrag = Double.parseDouble(this.betragFeld.getText());
            try {
                this.konto.abheben(betrag);
            } catch (AusnahmeException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            this.kontoStandFeld.setText(Double.toString(this.konto.getKontoStand()));
        }
    }

}
