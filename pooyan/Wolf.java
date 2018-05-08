package pooyan;
import java.util.Random;
public class Wolf extends Sprite implements Runnable{
	private boolean isShot;
	private Balloon balloon;
	private final int WOLF_START = 555;
	private final int WOLF_FINISH = 75;
	public Wolf(String filename) {
		super(filename);	
		Random rn = new Random();
		this.x = (rn.nextInt(4)+1)*200;
		this.y = WOLF_START;
		this.balloon = new Balloon();
		this.isShot = false;
	}
	

	public void move(){
		this.y -=10;
	}

	// public void throw(){
	// 	// new Rock(this.
	// }



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

}
