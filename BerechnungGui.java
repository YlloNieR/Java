
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BerechnungGui extends JFrame implements ActionListener {

    private JTextField eingabe1;
    private JTextField eingabe2;
    private JTextField ausgabe;
    private JButton summe;
    private JButton produkt;    

    public BerechnungGui() {
        this.setTitle("Bankkonto2 GUI"); // Rahmentitel
        this.setSize(380, 280); // Größe Fenster

        // Eingabe
        this.eingabe1 = new JTextField(10); 
        this.eingabe1.setText(Double.toString());
        this.eingabe2 = new JTextField(10); 
        this.eingabe2.setText(Double.toString());

        // Button
        this.summe = new JButton("Summe");
        this.summe.addActionListener(this);
        this.produkt = new JButton("Produkt");
        this.produkt.addActionListener(this);

        // Label
        JLabel labelZahlEins = new JLabel("Zahl:"); 
        JLabel labelZahlZwei = new JLabel("Zahl:"); 
        JPanel hintergrundPanel = new JPanel(); 

        hintergrundPanel.add(labelZahlEins);
        hintergrundPanel.add(this.eingabe1); 
        hintergrundPanel.add(labelZahlZwei);
        hintergrundPanel.add(this.eingabe2); 

        JPanel betragPanel = new JPanel();
        JLabel labelBetrag = new JLabel("asd");
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
