import java.util.ArrayList;
import java.util.Random;


public class Enemy implements Player {

	protected int HP;
	protected int STR;
	protected int DEX;
	protected int MagicHP;
	protected String Name;
	Shield s;
	Weapon w;
	Armor a;
	Helm h;
	
	Enemy(Hero h){		
		this.s = new Shield((int)h.s.getAttackBonus() *3 / 4,(int)h.s.getArmorBonus() *3 / 4);//add overide to set states for this
		this.w = new Weapon((int)h.w.getAttackBonus() *3 / 4,(int)h.w.getArmorBonus() *3 / 4);
		this.a = new Armor((int)h.a.getAttackBonus() *3 / 4,(int)h.a.getArmorBonus() *3 / 4);
		this.h = new Helm((int)h.h.getAttackBonus() *3 / 4,(int)h.h.getArmorBonus() *3 / 4);
		this.STR = h.STR * 3 / 4;
		this.DEX = h.DEX * 3 / 4;
		this.HP = 20;
		this.MagicHP = 0;
		this.setName();

	}
	
	private void setName(){
		ArrayList<String> name_1 = new ArrayList<String>();
		ArrayList<String> name_2 = new ArrayList<String>();
		name_1.add("Diablo");
		name_1.add("Carivorius");
		name_1.add("Hell Spawn");
		name_1.add("Draconion");
		name_1.add("Slasher");
		name_1.add("Dark One");
		name_1.add("Frost Bite");
		name_1.add("Sinister");
		name_1.add("Frozen Shade");
		name_1.add("Scorpian");
		name_1.add("Archaball");
		name_1.add("Charizard");
		name_1.add("Rex");
		
		name_2.add("of the damed");
		name_2.add("the betrayer");
		name_2.add("Lord of Terror");
		name_2.add("Bin Laden");
		name_2.add("the Wicked");
		name_2.add("the sometimes inapropriate");
		name_2.add("demon spawn of hell");
		name_2.add("the canabal");
		name_2.add("soul eater");
		name_2.add("People Magazine's person of the year 2006");
		name_2.add("hater of kittens");
		name_2.add("the vegitarian");
		name_2.add("who does something bad");
		name_2.add("wow coding drunk is awsome");
		name_2.add("I can't do it at work but on personal projects it is great");
		name_2.add("and some more text");
		
		Random r = new Random();
		this.Name = name_1.get(r.nextInt(name_1.size())) + " " + name_2.get(r.nextInt(name_2.size()));
	}
	
	@Override
	public int getHP() { 
		return this.HP;
	}

	@Override
	public int getMagicHP() { 
		return this.MagicHP;
	}

	@Override
	public void takeDamage(int i) { 
		this.HP -= i;
	}

	@Override
	public boolean is_alive() {
		return this.HP > 0;
	}

	@Override
	public boolean changeShield(Shield s) {
		if(s.getRequiredDex() > this.DEX || s.getRequiredStrength() > this.STR){
			return false;
		}
		this.s = s;
		return true;
	}

	@Override
	public boolean changeWeapon(Weapon w) {
		if(w.getRequiredDex() > this.DEX || w.getRequiredStrength() > this.STR){
			return false;
		}
		this.w = w;
		return true;
	}

	@Override
	public boolean changeArmor(Armor a) {
		if(a.getRequiredDex() > this.DEX || a.getRequiredStrength() > this.STR){
			return false;
		}
		this.a = a;
		return true;
	}

	@Override
	public boolean changeHelm(Helm h) {
		if(h.getRequiredDex() > this.DEX || h.getRequiredStrength() > this.STR){
			return false;
		}
		this.h = h;
		return true;
	}

	@Override
	public boolean useMagic() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean atemptAttack(Player p) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public int calculateDamage() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public boolean isHuman(){
		return false;
	}
	
	public String getName(){
		return this.Name;
	}

}