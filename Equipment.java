
public interface Equipment {
	int getAttackBonus();
	int getArmorBonus();
	int getSpeedBonus();
	
	String printStats();
	
	int getRequiredStrength();
	int getRequiredDex();
	String getName();
}
