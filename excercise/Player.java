import java.awt.event.KeyEvent;

public class Player extends Sprite {
    private int geschwX;
    private int geschwY;

    public Player(int x, int y) {
        super(x, y);
        loadImage("C:\\Users\\FIS-02-2020\\Downloads\\ankylosaurus.png");
        getImageDimension();
    }

    public void move() {
        this.x += geschwX;
        this.y += geschwY;

        if (this.x < 1) {
            this.x = 1;
        }
        if (this.y < 1) {
            this.y = 1;
        }
    }

    public void keyPressed(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.geschwX = -1;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.geschwX = 1;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.geschwY = -1;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.geschwY = 1;
        }
    }
    public void keyReleased(KeyEvent keyEvent){
        if(keyEvent.getKeyCode() == KeyEvent.VK_LEFT){
            this.geschwX = 0;
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_RIGHT){
            this.geschwX = 0;
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_UP){
            this.geschwY = 0;
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_DOWN){
            this.geschwY = 0;
        }
    }
}
