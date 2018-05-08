package pooyan;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Image;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.event.*;

public class GameArea extends JPanel implements KeyListener {
	private Home home;
	private int MAX_WOLF = 5;
	private Wolf[] wolves;
	








	public GameArea() {
		this.home = new Home(); //****************
		this.wolves = new Wolf[MAX_WOLF];
		for (int i=0; i<MAX_WOLF; i++){
			this.wolves[i] = new Wolf();
		}
	}

	public boolean checkAllWolves(){
		boolean flag = false;
		for (int i=0; i<MAX_WOLF; i++){
			if(this.wolves[i].getIsShot() == true) flag = true;
			else flag = false; break;
		}
		return flag;
	}

	public int moveMama(){
		if(this.home.moveMama()==3){
			Random r = new Random();
			this.home.getElevator().getMamaPig().shoot(wolves[r.nextInt(MAX_WOLF)]);
			if(this.checkAllWolves()==true){
				System.out.println("You have shot all the wolves!");
				System.exit(0);
			}
		}
		return this.home.moveMama();
	}




}
