public class Wand extends Sprite {
    boolean reverse = false;
    public Wand(int x, int y) {
        super(x, y);
        loadImage("src/wand.png");
        getImageDimensions();
    }
    public void move(){
        if (this.yKoordinate >= 400 || this.yKoordinate<=0){
            reverse = !reverse;
        }
        if(!reverse){
            this.yKoordinate -= 2;
        }
        else {
            this.yKoordinate += 2;
        }
    }

}
