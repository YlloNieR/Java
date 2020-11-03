import java.awt.*;

import javax.swing.ImageIcon;

public class Sprites {
    
    protected int xKoordinate;
    protected int yKoordinate;
    protected int breite;
    protected int hoehe;
    protected boolean sichtbar;
    protected Image bild;

    public int getXKoordinate(){
        return this.xKoordinate;
    }

    public int getYKoordinate(){
        return this.yKoordinate;
    }

    public Image getBild(){
        return this.bild;
    }

    public boolean getSichtbar(){
        return this.sichtbar;
    }

    public boolean setSichtbar(){
        return this.sichtbar = true;
    }

    public Sprites(int x, int y){
        this.xKoordinate = x;
        this.yKoordinate = y;
        setSichtbar();
    }

    public void getImageDimension(){
        this.breite = bild.getWidth(null);
        this.hoehe = bild.getHeight(null);
    }

    public void loadImage(String bildName){
        ImageIcon imic = new ImageIcon(bildName);
        this.bild = imic.getImage();
    }

    public Rectangle getBounds(){
        return new Rectangle(xKoordinate,yKoordinate,breite,hoehe);
    }

}
