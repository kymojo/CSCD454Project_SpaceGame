/**
 * The arena class responsible for handling combat. Places fighters
 * into the arena upon creation and finishes combat when the player
 * dies, flees, or defeats all the enemies.
 *
 * Note: Compiler warning "CombatArena.java uses unchecked or unsafe operations."
 *
 * @author  Kyle Johnson
 */

import java.util.ArrayList;

public class CombatArena {

   private static CombatArena arena = new CombatArena();
   private static Fightable player = null;
   private static ArrayList<Fightable> enemies = new ArrayList(1);
   
   /**
    * Private constructor to preserve singleton
    */
   private CombatArena() {}
   
   /**
    * SINGLETON getInstance() method
    *
    * @return     the static single instance of CombatArena
    */
   public static CombatArena getInstance() {
   
      return arena;
   }
   
   /**
    * Adds a new fighter to the arena. If it is an enemy, add it to
    * the ArrayList of enemies. If it is a player, fill the player
    * slot with the fighter.
    * 
    * @param   fighter   the fighter to add to the arena
    */
   public static void addCombatant(Fightable fighter) {
   
      if (fighter instanceof Enemy)
         enemies.add(fighter);
      else
         player = fighter;
   }
   
   /**
    * Removes a fighter from the arena. If it is an enemy, check
    * the ArrayList of enemies and remove it. If it is a player,
    * set the player slot to null.
    * 
    * @param   fighter   the fighter to add to the arena
    */
   public static void removeCombatant(Fightable fighter) {
   
      if (fighter instanceof Enemy)
         enemies.remove(enemies.indexOf(fighter));
      else
         player = null;
      
   }
   
   /**
    * Returns the ArrayList of fighters in the arena
    * 
    * @return     the list of fighters
    */
   public static ArrayList listCombatants() {
   
      return enemies;
   }
   
   /**
    * Tick the timers to determine which fighter's turn it is. Player
    * character gets priority over enemies if timers hit 0 at the same
    * time. If the player or all the enemies die, end combat and return
    * to navigation interface.
    */
   public static void combatSteps() {
      
      int done = checkVictory();
      
      while( done == 0 ) {
         
         done = checkVictory();
         if (done == 0)
            player.clockTick();
         
         for (Fightable e : enemies) {
         
            done = checkVictory();
            if (done == 1)
               break;
            else
               e.clockTick();
         }
         
         // FOR TESTING PURPOSES ONLY
/*D*///  System.out.println("Combat!!!");
/*D*///  done = 1;
      }
   }
   
   /**
    * A helpful method for calculating whether combat is over.
    * If the player slot is null, the player is considered to be
    * dead and victory is given to the enemy. If the enemy list
    * is empty, the victory is given to the player. When either
    * condition is met, the value of done is set to 1.
    *
    * @return     the value of done (0 is not done, 1 is done)
    */
   private static int checkVictory() {
   
      int done = 0;
      
      if (player == null) {
         System.out.println("The player is dead!\nThe enemy has won the battle!");
         done = 1;
      }
         
      if (enemies.isEmpty()) {
         System.out.println("The enemy is dead!\nThe player has won the battle!");
         done = 1;
      }
      
      return done;
   }

   /**
    * @return     number of enemies in the arena
    */
   public static int countEnemies() {
      return enemies.size();
   }

   /**
    * A simple method that iterates through the list of enemies
    * and prints their names and position in the list.
    */
   public static void listEnemies() {
   
      int i = 1;
      for (Fightable e : enemies) {
         
         System.out.println(i + ": " + e.getName() );
         i++;
      }
   }
   
   /**
    * 
    * 
    * @param   index    the index of the desired enemy
    * @return           the enemey at the given index
    */
   public static Fightable getEnemy(int index) {
   
/*D*/ // check for index out of bounds
      return enemies.get(index-1);
/*D*/ // if out of bounds, return null and handle it in calling method
   }
   
   /**
    * @return     player
    */
   public static Fightable getPlayer() {
      
      return player;
   }
}