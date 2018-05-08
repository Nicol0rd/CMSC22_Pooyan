
package user;
import java.util.*;
import pooyan.*;
public class Main {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		GameArea gameArea;

		System.out.println("WELCOME TO POOYAN'S WORLD");
		System.out.println("[1] - New Game");
		System.out.println("[0] - Exit");
		choice = sc.nextInt();

			switch(choice){
				case 1:
					gameArea = new GameArea();
					do{
						gameArea.moveMama();
					}while(gameArea.moveMama() != 0);	

					break;
				case 0:
					System.exit(0);
					break;
			}
		
	}

}
