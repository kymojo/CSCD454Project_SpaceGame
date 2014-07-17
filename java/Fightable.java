/**
 * An abstract class for fighters for arena combat.
 * Also is a super class for the base character class.
 *
 * @author  Kyle Johnson
 */

public abstract class Fightable {

   protected int healthMax;
   protected int health;
   protected int speed;
   protected String name;
   protected Inventory inventory;
   //private Status status[];
   protected CombatTimer clock;
   
   /**
    * @return        fighter name
    */
   public String getName() {
      return name;
   }
   
   /**
    * @return        fighter speed
    */
   public int getSpeed() {
      return speed;
   }
   
   /**
    * Uses the primary weapon equipped to attack a given
    * enemy fighter. Calls the enemy's defend method for
    * damage calculation.
    *
    * @param enemy   enemy to attack 
    */
   public void attack(Fightable enemy) {
      
      System.out.println(name + " attacks " + enemy.getName() + "!");
      
      int damage = inventory.getWeapon()/* USE A FACADE */.attack();
      if (damage == -1)
         System.out.println("Attack missed!");
      else
         enemy.defend(damage);
   }
   
   /**
    * Defends against enemy damage. If the fighter
    * dies from that damage, remove him from the arena.
    *
    * @param enemy   enemy to attack 
    * @return        returns 1 if fighter dies, else, returns 0
    */
   public void defend(int damage) {
      
      int dmg = inventory.getArmor()/* USE A FACADE */.damageReduce(damage);
      health -= dmg;
      System.out.println(name+" takes "+dmg+" damage!!");
      if (health <= 0) {
         System.out.println(name+" died!");
         CombatArena.removeCombatant(this);
      }
   }
   
   /**
    * 
    */
   public void clockTick() {
      clock.tick();
   }
   
   /**
    * 
    */
   public abstract int combat();
   
   
}