package pooyan;

public class MeatSlab extends Sprite{
	private final int BULLET_SPEED = 5;
	private final int DROP_RATE_1 =
	public MeatSlab(int x, int y, String filename) {
		super(x,y,filename);
	}

	public void move(){
		setX(BULLET_SPEED);
		if(x > 555){
			this.setThisAppear(false);
		}
	}
}
