import java.awt.*;
import javax.swing.*;

public class Sprite{
	public int x;
	public int y;
	public int width;
	public int height;
	private Image img;
	public boolean thisAppear;
	private String filename;
	
	public final int MINIMUM_Y_WOLF = 555;
	public final int MAXIMUM_Y_WOLF = 75;


	public Sprite(int x, int y, String filename){
		this.x = x;
		this.y = y;
		this.thisAppear = true;
		loadImage(filename);	
	}
	
	public void loadImage(String filename){
		img = Toolkit.getDefaultToolkit().getImage(filename);
	}

	public void getImageSize(){
		width = img.getWidth(null);
		height = img.getHeight(null);
	}

	public Image getImage(){
		return img;	
	}
 	
	public void setX(int val) {
        	this.x += val;
	}

	public void setY(int val) {
        	this.y += val;
	}

	public int getX() {
        	return this.x;
	}

	public int getY() {
    	return this.y;
	}

	public boolean getThisAppear(){
		return thisAppear;	
	}	

	public void setThisAppear(boolean value){
		this.thisAppear = true;
	}

	public void incY(){
		this.y += 5;
	}
}