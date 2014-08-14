/**
 * An abstract class for extension of concrete Enemies.
 *
 * @author  Kyle Johnson
 */

public abstract class Enemy extends Fightable {
   
   
   public Enemy(String name, int hp, int spd) {
      super(name, hp, spd);
   }
//--------------------------------------------------------------------------
   public int combat() {
   
      int time = 0;
      
      attack(CombatArena.getPlayer());
      time = inventory.weaponAttackTime();
      return time;
   }
//--------------------------------------------------------------------------
}