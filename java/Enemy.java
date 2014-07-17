/**
 * An abstract class for extension of concrete Enemies.
 *
 * @author  Kyle Johnson
 */

public abstract class Enemy extends Fightable {

   protected String description;
   
   public abstract int combat();
}