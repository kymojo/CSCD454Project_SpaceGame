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
//--------------------------------------------------------------------------
   public Fightable(String name, int hp, int spd) {
   
      this.name = name;
      healthMax = hp;
      health = healthMax;
      inventory = new Inventory(this);
      speed = spd;
      clock = new CombatTimer(this);
   }
//--------------------------------------------------------------------------
   /**
    * @return        fighter name
    */
   public String getName() {
      return name;
   }
//--------------------------------------------------------------------------
   public Inventory getInventory() {
      return inventory;
   }
//--------------------------------------------------------------------------
   /**
    * @return        fighter speed
    */
   public int getSpeed() {
      return speed;
   }
//--------------------------------------------------------------------------
   /**
    * @return        String of character's health
    */
   public String getHP() {
      String hpReturn = "["+health+"/"+healthMax+"]";
      return hpReturn;
   }
//--------------------------------------------------------------------------
   /**
    * Uses the primary weapon equipped to attack a given
    * enemy fighter. Calls the enemy's defend method for
    * damage calculation.
    *
    * @param enemy   enemy to attack 
    */
   public void attack(Fightable enemy) {
      
      System.out.println("[ATTACK!]   "+name + inventory.weaponMessage() + enemy.getName() + "!");
      
      int damage = inventory.weaponAttack();
      if (damage == -1)
         System.out.println("[ MISS! ]   Attack missed!");
      else
         enemy.defend(damage);
   }
//--------------------------------------------------------------------------
   /**
    * Defends against enemy damage. If the fighter
    * dies from that damage, remove him from the arena.
    *
    * @param enemy   enemy to attack 
    * @return        returns 1 if fighter dies, else, returns 0
    */
   public void defend(int damage) {
      
      int dmg = inventory.armorDamage(damage);
      health -= dmg;
      System.out.println("[DAMAGE!]   "+name+" takes "+dmg+" damage!!");
      if (health <= 0) {
         System.out.println("[ DEATH ]   "+name+" died!");
         CombatArena.removeCombatant(this);
      }
   }
//--------------------------------------------------------------------------
   /**
    * 
    */
   public void heal(int h) {
      health += h;
      if (health > healthMax) {
         h += (healthMax - health);
         health = healthMax;
      }
      System.out.println("[ HEAL! ]   "+name+" healed " + h + "hp!");
   }
//--------------------------------------------------------------------------
   /**
    * 
    */
   public void healFully() {
      health = healthMax;
   }
//--------------------------------------------------------------------------
   /**
    * 
    */
   public void clockTick() {
      if (health > 0)
         clock.tick();
   }
//--------------------------------------------------------------------------
   /**
    * 
    */
   public abstract int combat();
//--------------------------------------------------------------------------  
}