import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Fenster extends JPanel implements ActionListener {
    private Timer timer;
    private Player player;
    private Player2 player2;
    // private List<Gegner> gegnerListe;
    private boolean ingame;
    private final int PLAYER_X1 = 900;
    private final int PLAYER_Y1 = 300;
    private final int PLAYER_X2 = 100;
    private final int PLAYER_Y2 = 300;

    private final int HEIGHT = 800;    
    private final int WIDTH = 1200;
    private final int DELAY = 15;    

    public Fenster() {
        this.addKeyListener(new TAdapter());
        setFocusable(true);
        //setBackground(new ImageIcon("Background.jpg"));
        this.ingame = true;
        this.setPreferredSize(new Dimension(this.WIDTH, this.HEIGHT));
        this.player = new Player(this.PLAYER_X1, this.PLAYER_Y1);
        this.player2  = new Player2(this.PLAYER_X2, this.PLAYER_Y2);
        this.timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (this.ingame) {
            drawObjects(g);
        } else {
            drawGameOver(g);
        }
        Toolkit.getDefaultToolkit().sync();
    }

    private void drawObjects(Graphics g) {
        
        g.drawImage(new ImageIcon("Background.jpg").getImage(), 0, 0, this);
        if (this.player.isSichtbar()) {
            g.drawImage(player.getBild(), player.getX(), player.getY(), this);
        }
        if (this.player2.isSichtbar()) {
            g.drawImage(player2.getBild(), player2.getX(), player2.getY(), this);
        }
        //for (Gegner gegner: gegnerListe) { if(gegner.isSichtbar()) {gegner.drawImage(...)}}
    }

    public void drawGameOver(Graphics g) {
        String message = "Game Over";
        Font schrift = new Font("Helvetica", Font.BOLD, 14);
        FontMetrics fm = getFontMetrics(schrift);
        g.setColor(Color.WHITE);
        g.setFont(schrift);
        g.drawString(message, (WIDTH - fm.stringWidth(message) / 2), HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        inGame();
        updatePlayer();
        //updateGegner();

        //checkCollisions();

        repaint();

    }

    private void inGame() {
        if (!this.ingame) {
            timer.stop();
            ;
        }
    }

    private void updatePlayer() {
        if (this.player.isSichtbar()) {
            this.player.move();
        }
        if (this.player2.isSichtbar()){
            this.player2.move();
        }
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyReleased(KeyEvent keyEvent) {
            player.keyReleased(keyEvent);
            player2.keyReleased(keyEvent);

        }

        @Override
        public void keyPressed(KeyEvent keyEvent) {
            player.keyPressed(keyEvent);
            player2.keyPressed(keyEvent);

        }
    }
}
