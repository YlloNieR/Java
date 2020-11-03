import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.*;

public class Rectangle extends JPanel implements KeyListener {
    public int x;
    public int y;
    public int geschwindigkeit;

    public Rectangle() {
        this.x = 30;
        this.y = 30;
        this.geschwindigkeit = 3;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(x, y, 50, 30);

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_UP:
                if (this.y > 0) {
                    this.y -= geschwindigkeit;
                    break;
                }
            case VK_DOWN:
                if (this.y < 150 - 30) {
                    this.y += geschwindigkeit;
                    break;
                }
            case VK_LEFT:
                if (this.x > 0) {
                    this.x -= geschwindigkeit;
                    break;
                }
            case VK_RIGHT:
                if (this.x < 400 - 50) {
                    this.x += geschwindigkeit;
                    break;
                }
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        switch (keyEvent.getKeyCode()) {
            case VK_UP:
                if (this.y > 0) {
                    this.y -= geschwindigkeit;
                }
                break;

            case VK_DOWN:
                if (this.y < 150 - 30) {
                    this.y += geschwindigkeit;
                }
                break;

            case VK_LEFT:
                if (this.x > 0) {
                    this.x -= geschwindigkeit;
                }
                break;

            case VK_RIGHT:
                if (this.x < 400 - 50) {
                    this.x += geschwindigkeit;
                }
                break;

        }
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}