public interface Equipment {
	/**
	 * 
	 * @return the attack bonus for equipment
	 */
	int getAttackBonus();
	
	/**
	 * 
	 * @return the armmor bonus for equipment
	 */
	int getArmorBonus();
	
	/**
	 * 
	 * @return return speed bonus for equipment
	 */
	int getSpeedBonus();
	
	/**
	 * 
	 * @return human readable text about equipment stats
	 */
	String printStats();
	
	/**
	 * 
	 * @return return required strenght needed by player interface to use equipment
	 */
	int getRequiredStrength();
	
	/**
	 * 
	 * @return return required dextarity needed by player interface to use equipment
	 */
	int getRequiredDex();
	
	/**
	 * 
	 * @return name of equipment
	 */
	String getName();
	
	/**
	 * 
	 * @return return non human readable stats on equipment
	 */
	String getStats();
}
