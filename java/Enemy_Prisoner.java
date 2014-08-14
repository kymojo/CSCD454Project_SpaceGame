/**
 * A generic, concrete Enemy for testing purposes.
 *
 * @author  Kyle Johnson
 */

public class Enemy_Prisoner extends Enemy {

   public Enemy_Prisoner() {
   
      super("Prisoner", 10, 5);
      inventory.setWeapon(new Weapon_Basic(), 1);
   }
}