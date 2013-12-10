
public interface Player {
	int getHP();
	int getMagicHP();
	void takeDamage(int i);
	boolean is_alive();
	boolean changeShield(Shield s);
	boolean changeWeapon(Weapon w);
	boolean changeArmor(Armor a);
	boolean changeHelm(Helm h);
	boolean useMagic();
	boolean atemptAttack(Player p);
	int calculateDamage();
	boolean isHuman();
	String getName();
	int getArmorMod();
	int getAttackMod();
	String getStats();
}
