
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {
    private Timer tm;
    private Spielerfigur raumschiff;
    private Wand wand;
    private final int RAUMSCHIFF_START_X = 40;
    private final int RAUMSCHIFF_START_Y = 60;
    private final int BOARD_WIDTH = 800;
    private final int BOARD_HEIGHT = 600;
    private final int TICK_TIME = 15;
    private ArrayList<Rakete> rL;

    public Board() {
        raumschiff = new Spielerfigur(RAUMSCHIFF_START_X, RAUMSCHIFF_START_Y);
        wand = new Wand(600, 0);
        this.addKeyListener(raumschiff);
        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        tm = new Timer(TICK_TIME, this);
        tm.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawObjects(g);
    }

    public void drawObjects(Graphics g) {
        if (raumschiff.isSichtbar()) {
            g.drawImage(raumschiff.getBild(), raumschiff.getxKoordinate(), raumschiff.getyKoordinate(), this);
        }
        ArrayList<Rakete> rL = raumschiff.getRaketenListe();
        for (Rakete r : rL) {
            if (r.isSichtbar()) {
                g.drawImage(r.getBild(), r.getxKoordinate(), r.getyKoordinate(), this);
            }
        }
        g.drawImage(wand.getBild(), wand.getxKoordinate(), wand.getyKoordinate(), this);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        checkCollision();
        if (raumschiff.isSichtbar()) {
            raumschiff.move();
        }
        ArrayList<Rakete> rL = raumschiff.getRaketenListe();
        for (Rakete r : rL) {
            if (r.isSichtbar()) {
                r.move();
            }
            //else {
            //    raumschiff.raketenListe.remove(r);
            //}
        }
        wand.move();
        repaint();
    }

    public void checkCollision() {
        Rectangle playerBounds = raumschiff.getBounds();
        Rectangle wandBounds = wand.getBounds();
        for (Rakete r : raumschiff.getRaketenListe()) {
            if (r.isSichtbar() && raumschiff.isSichtbar()) {
                Rectangle raketeBounds = r.getBounds();

                if (playerBounds.intersects(wandBounds)) {
                    raumschiff.setSichtbar();
                }
                if (raketeBounds.intersects(wandBounds)) {
                    r.setSichtbar();
                    //raumschiff.raketenListe.remove(r);
                }
            }
        }
    }
}
