public class Rocket extends Sprite {
    private final int WINDOW_WIDTH = 1041;
    private final int ROCKET_SPEED = 2;

    public Rocket(int x, int y) {
        super(x, y);
        loadImage("./img/rocket.png");
        getImage();      
        getImageDimension();
    }

    public void shooting(){
        this.startPosX += this.ROCKET_SPEED;
        if(this.startPosX >= this.WINDOW_WIDTH){
            setVisible();
        }
    }
}