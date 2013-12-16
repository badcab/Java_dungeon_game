
public interface Player {
	/**
	 * 
	 * @return
	 */
	int getHP();
	
	/**
	 * 
	 * @return
	 */
	int getMagicHP();
	
	/**
	 * 
	 * @return
	 */
	void takeDamage(int i);
	
	/**
	 * 
	 * @return
	 */
	boolean is_alive();
	
	/**
	 * 
	 * @return
	 */
	boolean changeShield(Shield s);
	
	/**
	 * 
	 * @return
	 */
	boolean changeWeapon(Weapon w);
	
	/**
	 * 
	 * @return
	 */
	boolean changeArmor(Armor a);
	
	/**
	 * 
	 * @return
	 */
	boolean changeHelm(Helm h);
	
	/**
	 * 
	 * @return
	 */
	boolean useMagic();
	
	/**
	 * 
	 * @return
	 */
	boolean atemptAttack(Player p);
	
	/**
	 * 
	 * @return
	 */
	int calculateDamage();
	
	/**
	 * 
	 * @return
	 */
	boolean isHuman();
	
	/**
	 * 
	 * @return
	 */
	String getName();
	
	/**
	 * 
	 * @return
	 */
	int getArmorMod();
	
	/**
	 * 
	 * @return
	 */
	int getAttackMod();
	
	/**
	 * 
	 * @return
	 */
	String getStats();
}
