import java.util.ArrayList;
import java.util.Random;


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
		while(this.hero.is_alive() && this.enemy.is_alive()){
			//this is the main game loop
			if(p1.isHuman()){
				//if hero then ask if they want to attack or use magic
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
			
			//do a print out of the current stats of each Player
			
			
			
			tmp = p1;
			p1 = p2;
			p2 = tmp;
		}//end while loop
		
		if(this.hero.is_alive()){
			//make random stuff happen to level up the hero
			//make some equipment that the person can use, show them the stats
			//ask if they want to wear it and make the change if they do
			//do a basic heal and magic restore
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
		return "Eventually I will put the stats in here";
	}
	
	
}
