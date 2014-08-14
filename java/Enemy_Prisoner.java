/**
 * The prisoner is the basic enemy found in the prison. These
 * guys are almost identical to the starting player, but with
 * less health.
 *
 * @author  Kyle Johnson
 */

public class Enemy_Prisoner extends Enemy {

   public Enemy_Prisoner() {
   
      super("Prisoner", 10, 3);
      inventory.setWeapon(new Weapon_Blaster(1), 1);
   }
}