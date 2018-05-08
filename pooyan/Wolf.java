package pooyan;
import java.util.Random;
public class Wolf extends Sprite implements Runnable{
	private boolean isShot;
	private Balloon balloon;

	public Wolf(int x, int y, String filename) {
		super(x,y,filename);	
		this.balloon = new Balloon();
		this.isShot = false;
	}
	

	
	














	public boolean getIsShot() {
		return this.isShot;
	}

	public void setIsShot(){
		this.isShot = true;
	}
	public void occupy(Balloon balloon) {
		balloon.carry(this);
	}
	public void climb(Ladder ladder) {
		ladder.occupy(this);
	}
	public void shoot(MamaPig mamaPig) {
		Random r = new Random();
		boolean success = r.nextBoolean();
		if(success == true) {
			System.out.println("Wolf shot MamaPig!");
		}
		else{
			System.out.println("Wolf missed!");
		}
	}
	public void attack(MamaPig mamaPig) {
		if(mamaPig.getLife() == 1) {
			mamaPig.isEaten();
		}
		else
			mamaPig.isHit();
	}
	public void move() {
		this.height++;
	}

	public int height(){
		return this.height;
	}
}
