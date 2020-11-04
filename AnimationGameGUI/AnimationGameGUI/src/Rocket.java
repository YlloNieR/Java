/*
 *Als Sprites werden Objekte bezeichnet, die mit einem Bild oder einer
 *Animation dargestellt werden. Alle Objekte, die bewegbar sind.
 */

public class Rocket extends Sprite {
    private final int WINDOW_WIDTH = 1041;
    private final int ROCKET_SPEED = 2;

    public Rocket(int x, int y) {
        super(x, y);
        loadImage("./img/rocket.png");
        getImageDimension();
    }

    public void move() {
        this.startPosX += this.ROCKET_SPEED;
        if (this.startPosX >= this.WINDOW_WIDTH) {
            setVisible();
        }
    }

}