package pooyan;
import java.util.Random;
import java.util.ArrayList;
public class MamaPig extends Sprite{
	private int dX,dY;
	private int life;
	private Weapon weapon;
	private int score;
	private boolean isEaten;
	private int killCount;
	private boolean hasMeatSlab;
	private ArrayList<Arrow> arrows;
	private String arrowFilename = "arrow.png";

	public MamaPig(int x, int y, String filename) {
		super(x,y,filename);
		this.arrows = new ArrayList<Arrow>();
		this.life = 3;
		this.score = 0;
		this.isEaten = false;
		this.killCount = 0;
	}
	public void shoot() {
		//edit mu
		arrows.add(new Arrow(x+width+20,y+height/2,arrowFilename));
	}

	public ArrayList<Arrow> getArrows(){
		return this.arrows;
	}
	
	public int getDX(){
		return this.dx;
	}
	public int getDY(){
		return this.dy;
	}
	public void setDX(int dx){
		this.dx = dx;
	}
	
	public void setDY(int dy){
		this.dy = dy;
	}

	public void move(){
		x += this.dx;
		y += this.dy;	
	}






	public int getLife() {
		return this.life;
	}
	public int getScore() {
		return this.score;
	}
	public int getKillCount(){
		return this.getKillCount();
	}
	public void addWeapon(Weapon weapon) {
		System.out.println("A bow and arrow has been added.");
		this.weapon = new MeatSlab();
	}
	void isHit() {
		System.out.println("MamaPig has been hit!");
		this.life--;
	}
	void isEaten() {
		System.out.println("MamaPig was eaten by the wolves!");
		this.life--;
	}
	public boolean getIsEaten() {
		return this.isEaten;
	}
	Weapon getWeapon() {
		return this.weapon;
	}
	public void viewState(){
		System.out.println("Life: "+this.life);
		System.out.println("Number of Wolves left: "+this.killCount);
		System.out.println("Score: "+this.score);
	}
	void revertWeapon(){
		this.weapon = new BowArrow();
	}
}
