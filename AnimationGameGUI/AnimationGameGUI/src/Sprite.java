/*
 *Als Sprites werden Objekte bezeichnet, die mit einem Bild oder einer
 *Animation dargestellt werden. Alle Objekte, die bewegbar sind.
 */

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class Sprite{    
    protected int startPosX;
    protected int startPosY;
    protected int sizeWidth;
    protected int sizeHeight;    
    protected boolean visible;
    protected Image img;

    public Sprite(int x, int y){
        this.startPosX = x;
        this.startPosY = y;
        this.visible = true;
    }

    protected void getImageDimension(){
        this.sizeWidth = this.img.getWidth(null);
        this.sizeHeight = this.img.getHeight(null);
    }

    protected void loadImage(String imgName){
        ImageIcon imic = new ImageIcon(imgName);
        this.img = imic.getImage();
    }

    public int getStartPosX(){
        return this.startPosX;
    }

    public int getStartPosY(){
        return this.startPosY;
    }

    public boolean isVisible(){
        return this.visible;
    }

    //damit der loadimage void sichtbar wird
    public Image getImage(){
        return this.img;
    }

    public Rectangle getBounds(){
        return new Rectangle (this.startPosX,this.startPosY,this.sizeWidth,this.sizeHeight);
    }

    //Bei Aufruf wird aus 1 = 0, danach 0 = 1
    public void setVisible(){
        this.visible = !this.visible;
    }


}