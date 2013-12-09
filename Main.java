import java.util.Scanner;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ask what type of player they want to be
		//ask what there name is
		
		Hero h = new Bard();
		//hero type should be selectable
		
		
		Enemy e = new Enemy(h);
		
		
		while(h.is_alive()){
			Game g = new Game(h,e);
			g.play();
			if(h.is_alive()){
				System.out.println("Would you like to play again");
			}
		}
		
		
		//once done ask if they want to play again, make a new enemy
		 

	}

}
