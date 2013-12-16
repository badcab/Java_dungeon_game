
public interface Equipment {
	/**
	 * 
	 * @return
	 */
	int getAttackBonus();
	
	/**
	 * 
	 * @return
	 */
	int getArmorBonus();
	
	/**
	 * 
	 * @return
	 */
	int getSpeedBonus();
	
	/**
	 * 
	 * @return
	 */
	String printStats();
	
	/**
	 * 
	 * @return
	 */
	int getRequiredStrength();
	
	/**
	 * 
	 * @return
	 */
	int getRequiredDex();
	
	/**
	 * 
	 * @return
	 */
	String getName();
	
	/**
	 * 
	 * @return
	 */
	String getStats();
}
