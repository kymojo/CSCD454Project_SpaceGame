/**
 * A generic, basic weapon for testing purposes.
 *
 * @author  Kyle Johnson
 */

public class Weapon_Basic extends Weapon {
   
   public Weapon_Basic() {
      name = "Basic Weapon";
      description = "A generic weapon.";
      message = " fires a basic weapon at ";
      damage = 5;
      accuracy = .8;
      attackTime = 5;
   }
}