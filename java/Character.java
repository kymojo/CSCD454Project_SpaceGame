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
      
      System.out.print("[ ? ? ? ]   Input player name:\n > ");
      name = userInput.nextLine();
      
      healthMax = 30;
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
      
      System.out.println("\n[ ARENA ]");
      System.out.println(" 0: " + name + " " + this.getHP());
      CombatArena.listEnemies();
      
      System.out.println("\n[ ? ? ? ]   Player Action:\n 1. Use Weapon\n 2. Swap Weapon\n 3. Use Item\n 4. Flee");
      
      while(choice == 0) {
      
         choice = getUserInt(4);
      
         switch (choice) {
            case 1:
                     int enemy = 1;
                     int enemyCount = CombatArena.countEnemies();
                     if (enemyCount > 1) {
                        System.out.println("[ ? ? ? ]   Choose an enemy: ");
                        CombatArena.listEnemies();
                        do {
                           enemy = getUserInt(enemyCount);
                        } while (CombatArena.getEnemy(enemy) == null);
                     }
                     attack(CombatArena.getEnemy(enemy));
                     time = inventory.weaponAttackTime();
                     break;
            case 2:
                     if (inventory.swapWeapon() == 1) {
                         System.out.println("[ ! ! ! ]   No secondary weapon!");
                         choice = 0;
                     }
                        else
                           time = speed;
                     break;
            case 3:
                     // Item Stuff
                     int itemCount = inventory.itemCount();
                     if (itemCount == 0) {
                        System.out.println("[ ! ! ! ]   No items!");
                        choice = 0;
                        break;
                     }
                     System.out.println("[ ? ? ? ]   Choose an item: ");
                     inventory.itemListPrint();
                     System.out.println(" " + (itemCount+1) + ": Forget it.");
                     int iGet = getUserInt(itemCount+1);
                     if (iGet == itemCount+1)
                        choice = 0;
                     else
                        time = inventory.useItem(iGet);
                    
                     
                     // time = characterTime
                     break;
            case 4:
/*D*/                System.out.println("[ ! ! ! ]   Unable to escape!");
/*D*/                choice = 0;
                     // Flee
                     // Take penalty
                     // Exit arena
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
   private int getUserInt(int range) {
      
      Integer choice = null;
      
      do {
         try {
            System.out.print(" > ");
            int cmd = userInput.nextInt();
            if (cmd < 1 || cmd > range)
               System.out.println("[ ! ! ! ]   Invalid number entered.");
            else
               choice = cmd;
         } catch (InputMismatchException E) {
            System.out.println("[ ! ! ! ]   Please enter a number.");
            userInput.next();
         }
      } while (choice == null);
      
      return (int) choice;
   }
}
