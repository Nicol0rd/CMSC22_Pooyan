package pooyan;
import java.util.Scanner;

public class Elevator {
	private MamaPig mamaPig = null;
	private Weapon meatSlab = null;
	private int height;

	private final static int MAX_HEIGHT = 5;

	private final static int MIN_HEIGHT = 0;
	public Elevator() {
		System.out.println("An elevator is added.");
		this.mamaPig = new MamaPig(); //********************
	}
	public void addMeatSlab() {
		System.out.println("A meatslab has been added!");
	}

	public void moveUp(){
		if(this.height<MAX_HEIGHT){
			this.height++;
			System.out.println("MamaPig moved up!");
		}else System.out.println("Reached highest elevator height");
	}

	public void moveDown(){
		if(this.height>MIN_HEIGHT){
			this.height--;
			System.out.println("MamaPig moved down!");
		}else System.out.println("Reached lowest elevator height");
	}
    public MamaPig getMamaPig(){
        return this.mamaPig;
    }
	public int move() {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("[0] Quit\n[1] Move Up \n[2] Move Down\n[3] Shoot\nChoice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 0:
			System.out.println("Quit");
			break;
		case 1:
			this.moveUp();
			break;
		case 2:
			this.moveDown();
			break;
		case 3:
			System.out.println("MamaPig tried to shoot!");
			break;
		default:
			System.out.println("Wrong move! MamaPig stayed still!");
			break;
		}
		return choice;
	}
}
