import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;


public class RaumSchiff extends Sprites implements KeyListener{

    public int geschwX;
    public int geschwY;
    public List<Rakete> raketenliste;

    public RaumSchiff(int xKoordinate, int yKoordinate){
        super(xKoordinate, yKoordinate);
        raketenliste = new ArrayList<>();
        loadImage("C:\\Users\\FIS-02-2020\\Documents\\GitHub\\Java\\img\\spaceship.png");
        getImageDimension();
    }

    public void move(int geschwX,int geschwY){
        this.geschwX = this.geschwX + geschwX;
        this.geschwY = this.geschwY + geschwY;

        if(geschwX < 1){
            geschwX = 1;
        }

        if(geschwY < 1){
            geschwY = 1;
        }
    }

    public List<Rakete> getRaketenliste(){
        return this.raketenliste;
    }

    public void keyPressed(KeyEvent keyEvent){
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.xKoordinate = this.xKoordinate - 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.xKoordinate = this.xKoordinate + 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.yKoordinate = this.yKoordinate - 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.yKoordinate = this.yKoordinate + 5;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE) {
            feuern();
        }
    }

    public void keyReleased(KeyEvent keyEvent){
        if (keyEvent.getKeyCode() == KeyEvent.VK_LEFT) {
            this.geschwX = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_RIGHT) {
            this.geschwX = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_UP) {
            this.geschwY = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_DOWN) {
            this.geschwY = 0;
        }
        if (keyEvent.getKeyCode() == KeyEvent.VK_SPACE) {            
        }
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    public void feuern(){
        raketenliste.add(new Rakete(xKoordinate+breite,yKoordinate+hoehe/2));
    }


}
