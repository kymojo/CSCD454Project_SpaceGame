/**
 * A timer responsible for ordering combat turns for fighters
 * in the combat arena.
 *
 * @author  Kyle Johnson
 */

public class CombatTimer {

   private Fightable fighter;
   private int clock;
   
   /**
    * Creator method for CombatTimer. Takes a fighter instance
    * and the clock is initialized to that fighter's speed.
    * 
    * @param   arena   the player character
    * @param   enemies  an array of enemies to fight
    */
   public CombatTimer (Fightable fighter) {

      this.fighter = fighter;
      clock = fighter.getSpeed();
   }
   
   /**
    * Counts the clock down by one step. If the clock strikes 0, the
    * corresponding fighter enters its combat method.
    */
   public void tick() {
   
      clock--;
      
      if (clock == 0) {
         System.out.println("[ . . . ]   "+fighter.getName()+"'s turn!");
         clock = fighter.combat();
      }
      
/*D*/// if (clock < 0) {
/*D*///    System.out.println(fighter.getName()+"'s timer fell below zero.");
/*D*///    System.out.println("Removing "+fighter.getName()+" from the arena...");
/*D*///    CombatArena.removeCombatant(fighter);
/*D*/// }
   }
   
}