import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

	/**
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What type of Hero would you like to be?");
		System.out.println("1) Barbarion");
		System.out.println("2) Bard");
		
		int player_type = 0;

		while(player_type != 1 && player_type != 2){
			try{
				player_type = sc.nextInt();
			}catch(InputMismatchException e1){
				sc = new Scanner(System.in);
			}
			
			if(player_type != 1 && player_type != 2){
				System.out.println("That is not a valid choice, try again...");
			}
		}
		Hero h = null;
		
		if(player_type == 1){
			h = new Barbarion();
			System.out.println("You have chosen Barbarion, What is you Name?");
		}
		
		if(player_type == 2){
			h = new Bard();
			System.out.println("You have chosen Bard, What is you Name?");
		}
		
		String name = "";
		while(name.length() < 1){
			name = sc.next();
		}
		
		h.setName(name);
		System.out.println("Your Name is " + name);
		boolean done = false;
		
		while(!done){
			Enemy e = new Enemy(h);
			
			System.out.println("PrePare Yourself " + h.getName() + " You are about to battle " + e.getName());
			
			while(h.is_alive()){
				Game g = new Game(h,e);
				g.play();
				if(h.is_alive()){
					
					int quit = 0;
					System.out.println("Would you like to play again");
					System.out.println("1) Yes");
					System.out.println("2) No");
					while(quit != 1 && quit != 2){
						
						try{
							quit = sc.nextInt();
						}catch(InputMismatchException e1){
							sc = new Scanner(System.in);
						}catch(NoSuchElementException e2){
							sc = new Scanner(System.in);
						}
						
						if(quit != 1 && quit != 2){
							System.out.println("Try again");
						} else {
							break;
						}
					}
					if(quit == 1){
						done = true;
					}
				} else {
					done = true;
				}
			}
		}
		
		System.out.println("Good Game, Come back again soon");
	}
}
