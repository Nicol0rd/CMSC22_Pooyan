package pooyan;

public class Arrow extends Sprite{
	private final int BULLET_SPEED = 5;
	public Arrow(int x, int y, String filename) {
		super(x,y,filename);
	}

	public void move(){
		setX(BULLET_SPEED);
		if(x > 1120){
			this.setThisAppear(false);
		}
	}
}
