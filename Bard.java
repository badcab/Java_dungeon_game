
public class Bard extends Hero {

	Bard(){
		this.DEX = 15 + this.r.nextInt(5);
		this.HP = 15 + this.r.nextInt(10);
		this.MagicHP = 15 + this.r.nextInt(5);
		this.STR = 10 + this.r.nextInt(5);
		
		this.a = new Armor(2,4);
		this.h = new Helm(2,3);
		this.s = new Shield(3,2);
		this.w = new Weapon(2,4);
	}
	
	@Override
	public boolean useMagic() {
		if(this.MagicHP > 0){
			this.MagicHP--;
			this.DEX++;
			this.MagicHP++;
			this.STR++;
			return true;
		}
		return false;
	}
}
