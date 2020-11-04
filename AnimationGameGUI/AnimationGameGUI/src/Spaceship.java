import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import static java.awt.event.KeyEvent.VK_LEFT;
import static java.awt.event.KeyEvent.VK_RIGHT;
import static java.awt.event.KeyEvent.VK_DOWN;
import static java.awt.event.KeyEvent.VK_UP;
import static java.awt.event.KeyEvent.VK_SPACE;

/*
 *Als Sprites werden Objekte bezeichnet, die mit einem Bild oder einer
 *Animation dargestellt werden. Alle Objekte, die bewegbar sind.
 */

public class Spaceship extends Sprite implements KeyListener {
    private int speedX;
    private int speedY;
    protected ArrayList<Rocket> RocketList;

    private final int WINDOW_FRAME_WIDTH = 1041;
    private final int WINDOW_FRAME_HEIGHT = 694;

    public Spaceship(int startPosX, int startPosY) {
        super(startPosX, startPosY);
        RocketList = new ArrayList<>();
        loadImage("./img/spaceship.png");
        getImageDimension();
    }

    public void moveShip() {
        this.startPosX += speedX;
        this.startPosY += speedY;        
    }

    public void stopShip(){
        speedX = 0;
        speedY = 0;        
    }

    public ArrayList<Rocket> getRocketList() {
        return this.RocketList;
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {
    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        //System.out.println("key pressed");
        switch (keyEvent.getKeyCode()) {
            case VK_LEFT:
                this.speedX--;
                moveShip();
                break;
            case VK_RIGHT:
                this.speedX++;
                moveShip();
                break;
            case VK_DOWN:
                this.speedY++;
                moveShip();
                break;
            case VK_UP:
                this.speedY--;
                moveShip();
                break;
            case VK_SPACE:
                shooting();
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {
    }

    public void shooting() {
        RocketList.add(new Rocket(this.startPosX + this.sizeWidth, this.startPosY + this.sizeHeight / 2));
    }
}