/**
 * The enemy moves fast and attacks fast. Not very
 * durable, but can pack a punch if not taken care
 * of quickly.
 *
 * @author  Kyle Johnson
 */

public class Enemy_Shanker extends Enemy {

   public Enemy_Shanker() {
   
      super("Shanker", 5, 2);
      inventory.setWeapon(new Weapon_Knife(1), 1);
   }
}