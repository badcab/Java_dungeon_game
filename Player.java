public interface Player {
	/**
	 * 
	 * @return health point for Player
	 */
	int getHP();
	
	/**
	 * 
	 * @return magic point for Player
	 */
	int getMagicHP();
	
	/**
	 * 
	 * @param health points to be removed from Player
	 */
	void takeDamage(int i);
	
	/**
	 * 
	 * @return are health point is greater than 0
	 */
	boolean is_alive();
	
	/**
	 * 
	 * @return did shield change succeed 
	 * @param Shield object Player will attempt to use
	 */
	boolean changeShield(Shield s);
	
	/**
	 * 
	 * @return did weapon change succeed
	 * @param Weapon object Player will attempt to use
	 */
	boolean changeWeapon(Weapon w);
	
	/**
	 * 
	 * @return did armor change succeed
	 * @param Armor object Player will attempt to use
	 */
	boolean changeArmor(Armor a);
	
	/**
	 * 
	 * @return did helm change succeed
	 * @param Helm object Player will attempt to use
	 */
	boolean changeHelm(Helm h);
	
	/**
	 * 
	 * @return did magic cast succeed
	 */
	boolean useMagic();
	
	/**
	 * 
	 * @return was attack successful
	 * @param Player to be attacked
	 */
	boolean atemptAttack(Player p);
	
	/**
	 * 
	 * @return damage delt to a Player from an attack
	 */
	int calculateDamage();
	
	/**
	 * 
	 * @return is the Player human controlled
	 */
	boolean isHuman();
	
	/**
	 * 
	 * @return name of Player
	 */
	String getName();
	
	/**
	 * 
	 * @return armor modifyer including all equipment and natural ability sumed up
	 */
	int getArmorMod();
	
	/**
	 * 
	 * @return attack modifyer including all equipment and natural ability sumed up
	 */
	int getAttackMod();
	
	/**
	 * 
	 * @return human readable stats on the Player
	 */
	String getStats();
}
