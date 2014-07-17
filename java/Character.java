/**
 * The player character class. The Character class contains
 * all of the information regarding the player's hero.
 *
 * @author  Kyle Johnson
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Character extends Fightable {

   Scanner userInput = new Scanner(System.in);
   
   /**
    * Basic character constructor.
    */
   public Character() {
      
      System.out.println("Input player name: ");
      name = userInput.nextLine();
      
      healthMax = 10;
      health = healthMax;
      
      inventory = new Inventory(this);
      inventory.setWeapon(new Weapon_Basic(), 1);
      inventory.setArmor(new Armor_Basic());
      
      speed = 3;
      clock = new CombatTimer(this);
   }

   /**
    * Prompts the player to choose a combat option between:
    * 1. Use Weapon  -- Attack the enemy with the currently equipped weapon
    * 2. Swap Weapon -- Exchange current weapon with secondary weapon
    * 3. Use Item    -- Allows the player to choose an item to use
    * 4. Flee        -- Player runs away and forfeits the battle
    *
    * @return        time to wait after choice
    */
   public int combat() {
   
      int time = 0;
      int choice = 0;
      
      System.out.println("[Menu]\n1. Use Weapon\n2. Swap Weapon\n3. Use Item\n4. Flee");
      
      while(choice == 0) {
      
         choice = getUserInt();
      
         switch (choice) {
            case 1:
                     int enemy = 1;
                     if (CombatArena.countEnemies() > 1) {
                        System.out.println("Choose an enemy:");
                        CombatArena.listEnemies();
                        do {
                           enemy = getUserInt();
                        } while (CombatArena.getEnemy(enemy) != null);
                     }
                     else {
                        attack(CombatArena.getEnemy(enemy));
                        time = inventory.getWeapon()/* USE A FACADE */.getAttackTime();
                     }
                     break;
            case 2:
                     if (inventory.swapWeapon() == 1) {
                         System.out.println("No secondary weapon!");
                         choice = -1;
                     }
                        else
                           time = speed;
                     break;
            case 3:
/*D*/                System.out.println("No items!");
/*D*/                choice = -1;
                     // Item Stuff
                     // time = characterTime
                     break;
            case 4:
/*D*/                System.out.println("Unable to escape!");
/*D*/                choice = -1;
                     // Flee
                     // Take penalty
                     // Exit arena
                     break;
            default:
                     if (choice != -1)
                        System.out.println("Invalid command issued.");
                     choice = 0;
                     break;
         }
      }
      return time;
   }
   
   /**
    * Prompts the user for an integer.
    *
    * @return     the inputted integer
    */
   private int getUserInt() {
      
      Integer choice = null;
      
      do {
         try {
            int cmd = userInput.nextInt();
            choice = cmd;
         } catch (InputMismatchException E) {
            System.out.println("Please enter a number.");
         }
      } while (choice == null);
      
      return (int) choice;
   }
}