public class Rakete extends Sprite{
    private final int BOARD_BREITE = 800;
    private final int RAKETEN_GESCHWINDIGKEIT = 2;

    public Rakete(int x, int y){
        super(x,y);
        loadImage("C:\\Users\\FIS-02-2020\\Documents\\GitHub\\Java\\img\\rakete.png");
        getImageDimension();
    }

    public void move(){       
        this.x += this.RAKETEN_GESCHWINDIGKEIT;
        if(this.x >= this.BOARD_BREITE){
            this.isSichtbar();
        }
    }
    
}
