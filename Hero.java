import java.util.Random;


public abstract class Hero implements Player {

	protected int HP;
	protected int STR;
	protected int DEX;
	protected int MagicHP;
	Shield s;
	Weapon w;
	Armor a;
	Helm h;
	protected String Name;
	Random r = new Random();
	
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
	public boolean isHuman(){
		return true;
	}
	
	public String getName(){
		return this.Name;
	}
	
	public void setName(String Name){
		this.Name = Name;
	}
	
	@Override
	public int getArmorMod(){
		return this.w.getArmorBonus()
			+ this.h.getArmorBonus()
			+ this.a.getArmorBonus()
			+ this.s.getArmorBonus()
			+ this.DEX;
	}
	
	@Override
	public int getAttackMod(){
		return this.w.getAttackBonus()
			+ this.h.getAttackBonus()
			+ this.a.getAttackBonus()
			+ this.s.getAttackBonus()
			+ this.STR;
	}
	
	@Override
	public boolean atemptAttack(Player p) {
		return this.getAttackMod() + r.nextInt(20) > p.getArmorMod();
	}
	
	@Override
	public int calculateDamage() {
		return this.r.nextInt(this.STR + this.r.nextInt(this.STR));
	}
	
	@Override
	public String getStats(){
		String result = "Name\t: " + this.Name + '\n';
		result += "Armor\t: " + this.a.getName() + '\n';
		result += "\t Attack Bonus:" + this.a.getAttackBonus() + '\n';
		result += "\t Armor Bonus:" + this.a.getArmorBonus() + '\n';
		result += "Helm\t: " + this.h.getName() + '\n';
		result += "\t Attack Bonus:" + this.h.getAttackBonus() + '\n';
		result += "\t Armor Bonus:" + this.h.getArmorBonus() + '\n';
		result += "Shield\t: " + this.s.getName() + '\n';
		result += "\t Attack Bonus:" + this.s.getAttackBonus() + '\n';
		result += "\t Armor Bonus:" + this.s.getArmorBonus() + '\n';
		result += "Weapon\t: " + this.w.getName() + '\n';
		result += "\t Attack Bonus:" + this.w.getAttackBonus() + '\n';
		result += "\t Armor Bonus:" + this.w.getArmorBonus() + '\n';
		result += "STR: " + this.STR + " | DEX: " + this.DEX + '\n';
		result += "HP: " + this.HP + " | Magic: " + this.MagicHP + '\n';
		return result;
	}
}
