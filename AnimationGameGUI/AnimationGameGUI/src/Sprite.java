import javax.swing.ImageIcon;
import java.awt.Image;

public abstract class Sprite {
    protected int xKoordinate;
    protected int yKoordinate;
    protected int breite;
    protected int hoehe;
    protected boolean sichtbar;
    protected Image bild;

    public Sprite(int x, int y) {
        this.xKoordinate = x;
        this.yKoordinate = y;
        this.sichtbar = true;
    }

    protected void getImageDimensions() {
        this.breite = this.bild.getWidth(null);
        this.hoehe = this.bild.getHeight(null);
    }

    protected void loadImage(String bildName) {
        ImageIcon imic = new ImageIcon(bildName);
        this.bild = imic.getImage();
    }

    public int getxKoordinate() {
        return this.xKoordinate;
    }

    public int getyKoordinate() {
        return this.yKoordinate;
    }

    public boolean isSichtbar() {
        return this.sichtbar;
    }

    public Image getBild() {
        return this.bild;
    }

    public Rectangle getBounds() {
        return new Rectangle(this.xKoordinate, this.yKoordinate, this.breite, this.hoehe);
    }

    public void setSichtbar() {
        this.sichtbar = !this.sichtbar;
    }
}