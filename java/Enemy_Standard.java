/**
 * A generic, concrete Enemy for testing purposes.
 *
 * @author  Kyle Johnson
 */

public class Enemy_Standard extends Enemy {

   public Enemy_Standard() {
      super("Standard Enemy", 10, 5);
      inventory.setWeapon(new Weapon_Basic(), 1);
   }
}