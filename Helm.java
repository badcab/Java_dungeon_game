import java.util.ArrayList;
import java.util.Random;


public class Helm implements Equipment {
	private int AttackBonus;
	private int ArmorBonus;
	private int SpeedBonus;
	private int RequiredStrength;
	private int RequiredDex;
	private String name;
	
	Helm(){
		Random r = new Random();
		this.AttackBonus = 0;
		this.ArmorBonus = r.nextInt(5) + 1;
		this.SpeedBonus = 0;
		this.RequiredStrength = (this.AttackBonus + this.ArmorBonus ) / 2;
		this.RequiredDex = this.SpeedBonus / 2;
		this.setName();
	}
	
	/**
	 * 
	 * @param AttackBonus attack bonus Helm will have
	 * @param ArmorBonus armor bonus Helm will have
	 */
	Helm(int AttackBonus, int ArmorBonus){
		this.AttackBonus = AttackBonus;
		this.ArmorBonus = ArmorBonus;
		this.SpeedBonus = 0;
		this.RequiredStrength = 0;
		this.RequiredDex = 0; 
		this.setName();
	}
	
	private void setName(){
		ArrayList<String> name_1 = new ArrayList<String>();
		ArrayList<String> name_2 = new ArrayList<String>();
		ArrayList<String> name_3 = new ArrayList<String>();
		name_1.add("Bastard");
		name_1.add("Golden");
		name_1.add("Silver");
		name_1.add("Leather");
		name_1.add("Old");
		
		name_2.add("Crown");
		name_2.add("Hat");
		name_2.add("Helmet");
		name_2.add("Helm");
		
		name_3.add("of Sorcery");
		name_3.add("of Bad Choices");
		name_3.add("of Regret");
		name_3.add("of Bad Spelling");
		
		Random r = new Random();
		this.name = name_1.get(r.nextInt(name_1.size())) + " " + name_2.get(r.nextInt(name_2.size()))+ " " + name_3.get(r.nextInt(name_3.size()));
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

	@Override
	public String getName() {
		return this.name;
	}
	
	@Override
	public String getStats() {
		return this.name + " +" + this.ArmorBonus + " Armor and +" + this.AttackBonus + " Attack"; 
	}

}
