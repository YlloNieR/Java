import java.awt.event.KeyEvent;

public class Player2 extends Sprite {
    private int geschwX;
    private int geschwY;

    public Player2(int x, int y) {
        super(x, y);
        loadImage("C:\\Users\\FIS-02-2020\\Downloads\\t-rex.png");
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
        if (keyEvent.getKeyCode() == KeyEvent.VK_A) {
            this.geschwX = -1;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_D) {
            this.geschwX = 1;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_W) {
            this.geschwY = -1;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_S) {
            this.geschwY = 1;
        }
    }
    public void keyReleased(KeyEvent keyEvent){
        if(keyEvent.getKeyCode() == KeyEvent.VK_A){
            this.geschwX = 0;
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_D){
            this.geschwX = 0;
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_W){
            this.geschwY = 0;
        }
        if(keyEvent.getKeyCode() == KeyEvent.VK_S){
            this.geschwY = 0;
        }
    }
}
