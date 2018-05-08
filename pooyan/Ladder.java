package pooyan;

public class Ladder extends Sprite {
	private Wolf wolf = null;
	private boolean isOccupied = false;
	private int height;
	private int width;
	public Ladder(int x, int y, String filename) {
		super(x,y,filename);
		this.width = 350;
	}
	void occupy(Wolf wolf) {
		if(this.isOccupied == false) {
			this.wolf = wolf;
			this.isOccupied = true;
		}
		else{
			System.out.println("A wolf is on the ladder!");
		}
	}

	int getHeight(){ //***************
		return this.height;
	}
}
