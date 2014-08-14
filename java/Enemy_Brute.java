/**
 * This enemy is huge and deals a lot of damage per
 * hit, but isn't very fast.
 *
 * @author  Kyle Johnson
 */

public class Enemy_Brute extends Enemy {

   public Enemy_Brute() {
   
      super("Prison Brute", 20, 5);
      inventory.setWeapon(new Weapon_Knife(1), 1);
   }
}