public class Rakete extends Sprite{
    private final int BOARD_BREITE = 800;
    private final int RAKETEN_GESCHWINDIGKEIT = 2;
    public Rakete(int x, int y){
        super(x,y);
        loadImage("C:\\Users\\FIS-02-2020\\Documents\\GitHub\\Java\\img\\rakete.png");
        getImageDimension();
    }

    public void move(int geschwX,int geschwY, ){
        
        
        .geschwX = this.geschwX + geschwX;
        this.geschwY = this.geschwY + geschwY;

        if(geschwX < 1){
            geschwX = 1;
        }

        if(geschwY < 1){
            geschwY = 1;
        }
    }
    
}
