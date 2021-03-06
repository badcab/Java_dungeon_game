import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Michael Spear
 *
 */
public class Game {
	
	private Player hero;
	private Player enemy;
	Random r = new Random();
	
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
			if(p1.isHuman()){
				int action = 0;
				while(action < 1 || action > 3){
					System.out.println(p1.getName() + " what would you like to do?");
					System.out.println("1) Attack");
					System.out.println("2) Use Magic");
					System.out.println("3) Look for better Equipment");
					
					try{
						action = sc.nextInt();
					}catch(InputMismatchException e1){
						sc = new Scanner(System.in);
					}
					
					if(action < 1 || action > 3){
						System.out.println("Try again");
					}
				}
				
				if(action == 1){ 
					if(p1.atemptAttack(p2)){
						int damage = p1.calculateDamage();
						p2.takeDamage(damage); 
						System.out.println(this.attackSuccessfulVerbage(p1.getName(), p2.getName(), damage));
					} else { 
						System.out.println(this.attackFailVerbage(p1.getName(), p2.getName()));
					}
				}
				
				if(action == 2){
					if(p1.useMagic()){
						System.out.println("Yeah! You did whatever your magic spell does");
					} else {
						System.out.println("Oh no! You don't have enough magicHP so you wasted a turn");
					}
				}
				
				if(action == 3){ 
					Equipment E_new = null; 
					String type = "";
					int random_select = r.nextInt(3);
					
					if(random_select == 0){
						E_new = new Armor();
						type = "Armor";
					}
					if(random_select == 1){
						E_new = new Helm();
						type = "Helm";
					}
					if(random_select == 2){
						E_new = new Shield();
						type = "Shield";
					}
					if(random_select == 3){
						E_new = new Weapon();
						type = "Weapon";
					}
					
					System.out.println("You Spot a new " + type + " just laying around for no aparent reason");
					System.out.println(E_new.getStats());
					System.out.println("Would you like to try and use this item");
					System.out.println("1) Yes");
					System.out.println("2) No");
					
					int option = 0;
					try{
						option = sc.nextInt();
					} catch (InputMismatchException e1){
						//do nothing
					}
					
					if(option == 1){
						boolean equipment_change = false;
						
						if(random_select == 0){
							equipment_change = p1.changeArmor((Armor) E_new);
						}
						if(random_select == 1){
							equipment_change = p1.changeHelm((Helm) E_new);
						}
						if(random_select == 2){
							equipment_change = p1.changeShield((Shield) E_new);
						}
						if(random_select == 3){
							equipment_change = p1.changeWeapon((Weapon) E_new);
						}
						
						if(equipment_change){
							System.out.println("You are now using " + E_new.getName());
						} else {
							System.out.println("You can't use this, keeping the old stuff");
						}
					} else {
						System.out.println("Well you wasted a turn looking around");
					}
				}
				
			} else {
				if(p1.atemptAttack(p2)){
					int damage = p1.calculateDamage();
					p2.takeDamage(damage); 
					System.out.println(this.attackSuccessfulVerbage(p1.getName(), p2.getName(), damage));
				} else { 
					System.out.println(this.attackFailVerbage(p1.getName(), p2.getName()));
				}
			}
			
			this.statsVerbage(p1, p2);
			
			tmp = p1;
			p1 = p2;
			p2 = tmp;
		} 
		if(this.hero.is_alive()){
			this.hero.takeDamage( this.hero.getHP() / 2 * -1 ); 
		}
	}
	
	/**
	 * this function used to display text when attack worked
	 * @param attacker_name name of the attacker
	 * @param defender_name name of the defender
	 * @param damage amount of damage the attacker delt the defender
	 * @return
	 */
	private String attackSuccessfulVerbage(String attacker_name, String defender_name, int damage){
		ArrayList<String> verb = new ArrayList<String>();
		verb.add("cut into");
		verb.add("slashed");
		verb.add("mutalated");
		verb.add("hit");
		verb.add("fucked up");
		verb.add("hurt");
		verb.add("damaged");
		return attacker_name + " " + verb.get(r.nextInt(verb.size())) + " " + defender_name + " for " + Integer.toString(damage);
	}
	
	/**
	 * this function used to display text when attack failed
	 * @param attacker_name name of the attacker
	 * @param defender_name name of the defender
	 * @return
	 */
	private String attackFailVerbage(String attacker_name, String defender_name){
		ArrayList<String> verb = new ArrayList<String>(); 
		verb.add("missed");
		verb.add("couldn't hit");
		verb.add("sort of messed on while attacking");
		return attacker_name + " " + verb.get(r.nextInt(verb.size())) + " " + defender_name;
	}
	
	/**
	 * this function show stats after each round
	 * @param p1 player one
	 * @param p2 player two
	 * @return a string reperenting the status of both players
	 */
	private String statsVerbage(Player p1, Player p2){
		return p1.getStats() + "\n=========\n" + p2.getStats();
	}
}
