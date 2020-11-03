import javax.swing.*;
import java.awt.*;

public class Sprite {
    protected int x;
    protected int y;
    protected int hoehe;
    protected int breite;
    protected boolean sichtbar;
    protected Image bild;

    public void setSichtbar(boolean sichtbar) {
        this.sichtbar = sichtbar;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isSichtbar() {
        return sichtbar;
    }

    public Image getBild() {
        return bild;
    }

    public Sprite(int x, int y) {
        this.x = x;
        this.y = y;
        this.sichtbar = true;
    }

    protected void getImageDimension(){
        this.breite = bild.getWidth(null);
        this.hoehe = bild.getHeight(null);

    }

    protected void loadImage(String bildname) {
        ImageIcon imageIcon = new ImageIcon(bildname);
        this.bild = imageIcon.getImage();

    }

    public Rectangle getBounds() {
        return new Rectangle(this.x,this.y,this.breite,this.hoehe);
    }
}
