
public class Barbarion extends Hero {

	Barbarion(){ 
		this.DEX = 5 + this.r.nextInt(5);
		this.HP = 20 + this.r.nextInt(10);
		this.MagicHP = 0 + this.r.nextInt(5);
		this.STR = 25 + this.r.nextInt(15);
		
		this.a = new Armor(4,5);
		this.h = new Helm(2,3);
		this.s = new Shield(3,4);
		this.w = new Weapon(5,6);
	}

	@Override
	public boolean useMagic() {
		if(this.MagicHP > 0){
			this.MagicHP--;
			this.STR++;
			return true;
		}
		return false;
	}
}
