import java.awt.*;
import javax.swing.*;

public class Datenerfassungsprogramm extends JFrame {

    private JTextField dg;
    private JTextField familienname;
    private JTextField vorname;
    private JTextField pk;
    private JTextField strasse;
    private JTextField plz;
    private JTextField ort;

    private Label dgLabel;
    private Label familiennameLabel;
    private Label vornameLabel;
    private Label pkLabel;
    private Label strasseLabel;
    private Label plzLabel;
    private Label ortLabel;

    private JButton absenden;

    public Datenerfassungsprogramm() {
    
            this.setTitle("Datenerfassungsprogramm"); // Rahmentitel
            this.setSize(350, 350); // Größe Fenster
    
            // Dg
            JPanel hintergrundPanelDg = new JPanel();
            JLabel labelDg = new JLabel("Dg:");
            this.dg = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelDg.add(labelDg);
            hintergrundPanelDg.add(this.dg);
    
            // familienname
            JPanel hintergrundPanelfamilienname = new JPanel();
            JLabel labelFamilienname = new JLabel("Familienname:");
            this.familienname = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelfamilienname.add(labelFamilienname);
            hintergrundPanelfamilienname.add(this.familienname);

            // vorname
            JPanel hintergrundPanelVorname = new JPanel();
            JLabel labelVorname = new JLabel("Vorname:");
            this.vorname = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelVorname.add(labelVorname);
            hintergrundPanelVorname.add(this.vorname);

            // pk
            JPanel hintergrundPanelpk = new JPanel();
            JLabel labelPk = new JLabel("PK:");
            this.pk = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelpk.add(labelPk);
            hintergrundPanelpk.add(this.pk);

            // strasse
            JPanel hintergrundPanelstrasse = new JPanel();
            JLabel labelStrasse = new JLabel("Strasse:");
            this.strasse = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelstrasse.add(labelStrasse);
            hintergrundPanelstrasse.add(this.strasse);

            // plz
            JPanel hintergrundPanelplz = new JPanel();
            JLabel labelPlz = new JLabel("PLZ:");
            this.plz = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelplz.add(labelPlz);
            hintergrundPanelplz.add(this.plz);

            // ort
            JPanel hintergrundPanelort = new JPanel();
            JLabel labelOrt = new JLabel("Ort:");
            this.ort = new JTextField(10); // Initialisierung Textfield
            hintergrundPanelort.add(labelOrt);
            hintergrundPanelort.add(this.ort); 

            // Button
            JPanel hintergrundPanelButtons = new JPanel();
    
            // Absenden
            this.absenden = new JButton("Absenden");
            hintergrundPanelButtons.add(absenden);
    
            // content pane
            Container contentPane = this.getContentPane();
            contentPane.add(hintergrundPanelDg);
            contentPane.add(hintergrundPanelfamilienname);
            contentPane.add(hintergrundPanelVorname);
            contentPane.add(hintergrundPanelpk);
            contentPane.add(hintergrundPanelstrasse);
            contentPane.add(hintergrundPanelplz);
            contentPane.add(hintergrundPanelort);
            contentPane.add(hintergrundPanelButtons);
            contentPane.setLayout(new GridLayout(8, 1));
        }

    public static void main(String[] args) {
        // GUI Anfang
        Datenerfassungsprogramm GUI = new Datenerfassungsprogramm();
        GUI.setVisible(true);
        // GUI Ende
    }
}
