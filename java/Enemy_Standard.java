/**
 * A generic, concrete Enemy for testing purposes.
 *
 * @author  Kyle Johnson
 */

public class Enemy_Standard extends Enemy {

   public Enemy_Standard() {
   
      name = "Standard Enemy";
      description = "A generic enemy for testing purposes";
      
      healthMax = 10;
      health = healthMax;
      
      inventory = new Inventory(this);
      inventory.setWeapon(new Weapon_Basic(), 1);
      inventory.setArmor(new Armor_Basic());
      
      speed = 5;
      clock = new CombatTimer(this);
   }
   
   public int combat() {
   
      int time = 0;
      attack(CombatArena.getPlayer());
      //System.out.println("Enemy Combat!");
      time = inventory.getWeapon()/* THIS IS A PROBLEM */.getAttackTime();
      return time;
   }
}