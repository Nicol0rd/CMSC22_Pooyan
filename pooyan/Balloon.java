package pooyan;

public class Balloon {
	private Wolf wolf = null;
	private boolean isHit = false;
	public Balloon() {
		System.out.println("A balloon has been created.");
	}
	public void carry(Wolf wolf) {
		this.wolf = wolf;
		System.out.println("This balloon is carrying a wolf!");
	}
	public void pop() {
		this.isHit = true;
		System.out.println("This balloon has popped!");
	}
	public boolean getIsHit() {
		return this.isHit;
	}
}
