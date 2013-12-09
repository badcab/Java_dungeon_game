import java.util.Random;


public class Helm implements Equipment {
	private int AttackBonus;
	private int ArmorBonus;
	private int SpeedBonus;
	private int RequiredStrength;
	private int RequiredDex;
	
	Helm(){
		Random r = new Random();
		this.AttackBonus = 0;
		this.ArmorBonus = r.nextInt(5) + 1;
		this.SpeedBonus = 0;
		this.RequiredStrength = (this.AttackBonus + this.ArmorBonus ) / 2;
		this.RequiredDex = this.SpeedBonus / 2; 
	}
	
	Helm(int AttackBonus, int ArmorBonus){
		this.AttackBonus = AttackBonus;
		this.ArmorBonus = ArmorBonus;
		this.SpeedBonus = 0;
		this.RequiredStrength = 0;
		this.RequiredDex = 0; 
	}
	
	@Override
	public int getAttackBonus() { 
		return this.AttackBonus;
	}

	@Override
	public int getArmorBonus() { 
		return this.ArmorBonus;
	}

	@Override
	public int getSpeedBonus() { 
		return this.SpeedBonus;
	}

	@Override
	public String printStats() {
		StringBuilder sb = new StringBuilder();
		sb.append("AttackBonus : \t" + this.AttackBonus + " \n");
		sb.append("ArmorBonus : \t" + this.ArmorBonus + " \n");
		sb.append("SpeedBonus : \t" + this.SpeedBonus + " \n");
		sb.append("RequiredStrength : \t" + this.RequiredStrength + " \n");
		sb.append("RequiredDex : \t" + this.RequiredDex + " \n");

		return sb.toString();
	}

	@Override
	public int getRequiredStrength() { 
		return this.RequiredStrength;
	}

	@Override
	public int getRequiredDex() { 
		return this.RequiredDex;
	}

}
