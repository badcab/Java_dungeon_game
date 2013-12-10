import java.util.ArrayList;
import java.util.Random;

/**
 * 
 * @author badcab
 *
 */
public class Armor implements Equipment {

	private int AttackBonus;
	private int ArmorBonus;
	private int SpeedBonus;
	private int RequiredStrength;
	private int RequiredDex;
	private String name;
	
	/**
	 * 
	 */
	Armor(){
		Random r = new Random();
		this.AttackBonus = 0;
		this.ArmorBonus = r.nextInt(20) + 1;
		this.SpeedBonus = 0;
		this.RequiredStrength = (this.AttackBonus + this.ArmorBonus ) / 2;
		this.RequiredDex = this.SpeedBonus / 2; 
		this.setName();
	}
	
	/**
	 * 
	 * @param AttackBonus
	 * @param ArmorBonus
	 */
	Armor(int AttackBonus, int ArmorBonus){
		this.AttackBonus = AttackBonus;
		this.ArmorBonus = ArmorBonus;
		this.SpeedBonus = 0;
		this.RequiredStrength = 0;
		this.RequiredDex = 0; 
		this.setName();
	}
	
	/**
	 * 
	 */
	private void setName(){
		ArrayList<String> name_1 = new ArrayList<String>();
		ArrayList<String> name_2 = new ArrayList<String>();
		ArrayList<String> name_3 = new ArrayList<String>();
		name_1.add("Stylish");
		name_1.add("Rusted");
		name_1.add("Shiney");
		name_1.add("Golden");
		name_1.add("Denon");
		
		name_2.add("Chain Mail");
		name_2.add("Brest Plate");
		name_2.add("Armor");
		name_2.add("Robe");
		
		name_3.add("of Sorcery");
		name_3.add("of Protection");
		name_3.add("of Please Don't kill me");
		name_3.add("of Power");
		
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
