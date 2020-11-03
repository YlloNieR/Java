public class Rakete extends Sprite {
    private final int BOARD_BREITE = 800;
    private final int RAKETEN_GESCHWINDIGKEIT = 2;

    public Rakete(int x, int y) {
        super(x, y);
        loadImage("src/rakete_gut.png");
        getImageDimensions();
    }
    public void move() {
        this.xKoordinate += this.RAKETEN_GESCHWINDIGKEIT;
        if(this.xKoordinate >= this.BOARD_BREITE){
            setSichtbar();
        }
    }
}