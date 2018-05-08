package pooyan;

public class Home {
	private Elevator elevator;
	private Ladder[] ladders;
	
	public Home() {
		this.elevator = new Elevator();
		Ladder[] ladders = new Ladder[4];
		for(int i = 0; i < 4; ++i) {
			this.addLadders(ladders[i], (i+1)*25); //***************
		}
	}
	private void addLadders(Ladder ladder, int height) {//***************
		ladder = new Ladder(height);
	}

	public int moveMama(){
		return this.elevator.move();
	}

	public Elevator getElevator(){
		return this.elevator;
	}
}
