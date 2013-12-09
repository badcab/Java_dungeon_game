
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

}
