import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class Game {
	
	private Player hero;
	private Player enemy;
	
	Game(Player h, Player e){ 
		this.hero = h;
		this.enemy = e;
	}
	
	public void play(){
		Player p1 = this.hero;
		Player p2 = this.enemy;
		Player tmp;
		
		Scanner sc = new Scanner(System.in);
		
		while(this.hero.is_alive() && this.enemy.is_alive()){
			//this is the main game loop
			if(p1.isHuman()){
				//if hero then ask if they want to attack or use magic
				
				int action = 0;
				while(action < 1 || action > 3){
					System.out.println(p1.getName() + " what would you like to do?");
					System.out.println("1) Attack");
					System.out.println("2) Use Magic");
					System.out.println("3) Look for better Equipment");
					action = sc.nextInt();
					if(action < 1 || action > 3){
						System.out.println("Try again");
					}
				}
				
				if(action == 1){
					//attack
					if(p1.atemptAttack(p2)){
						int damage = p1.calculateDamage();
						p2.takeDamage(damage); 
						System.out.println(this.attackSuccessfulVerbage(p1.getName(), p2.getName(), damage));
					} else {
						//attack failed
						System.out.println(this.attackFailVerbage(p1.getName(), p2.getName()));
					}
				}
				
				if(action == 2){
					//use magic
				}
				
				if(action == 3){
					//look for better equipment
				}
				
			} else {
				if(p1.atemptAttack(p2)){
					int damage = p1.calculateDamage();
					p2.takeDamage(damage); 
					System.out.println(this.attackSuccessfulVerbage(p1.getName(), p2.getName(), damage));
				} else {
					//attack failed
					System.out.println(this.attackFailVerbage(p1.getName(), p2.getName()));
				}
			}
			
			this.statsVerbage(p1, p2);
			
			
			
			tmp = p1;
			p1 = p2;
			p2 = tmp;
		}//end while loop
		if(this.hero.is_alive()){
			this.hero.takeDamage( this.hero.getHP() / 2 * -1 );//should restore hp
			//magic will never increase
		}
	}
	
	private String attackSuccessfulVerbage(String attacker_name, String defender_name, int damage){
		ArrayList<String> verb = new ArrayList<String>();
		Random r = new Random();
		verb.add("cut into");
		verb.add("slashed");
		verb.add("mutalated");
		verb.add("hit");
		verb.add("fucked up");
		verb.add("hurt");
		verb.add("damaged");
		return attacker_name + " " + verb.get(r.nextInt(verb.size())) + " " + defender_name + " for " + Integer.toString(damage);
	}
	
	private String attackFailVerbage(String attacker_name, String defender_name){
		ArrayList<String> verb = new ArrayList<String>();
		Random r = new Random();
		verb.add("missed");
		verb.add("couldn't hit");
		verb.add("sort of messed on while attacking");
		return attacker_name + " " + verb.get(r.nextInt(verb.size())) + " " + defender_name;
	}
	
	private String statsVerbage(Player p1, Player p2){
		return p1.getStats() + "\n=========\n" + p2.getStats();
	}
	
	
}
