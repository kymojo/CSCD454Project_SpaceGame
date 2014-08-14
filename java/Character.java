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
//--------------------------------------------------------------------------
   /**
    * Basic character constructor.
    */
   public Character() {
      
      super(null, 30, 3);
      name = getPlayerName();
      inventory.setWeapon(new Weapon_Blaster(1), 1);
   }
//--------------------------------------------------------------------------
   public String getPlayerName() {
   
      System.out.print("[ ? ? ? ]   Input player name:\n > ");
      return userInput.nextLine();
   }
//--------------------------------------------------------------------------
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
      System.out.println(" 0: " + name + " " + getHP());
      CombatArena.listEnemies();
      
      System.out.println("\n[ ? ? ? ]   Player Action: "
                       + "\n 1. Use " + inventory.weaponName()
                       + "\n 2. Swap Weapon"
                       + "\n 3. Use Item"
                       + "\n 4. Flee");
      
      while(choice == 0) {
      
         choice = getUserInt(4);
      
         switch (choice) {
            case 1:
                     time = combatUseWeapon();
                     break;
            case 2:
                     time = combatSwapWeapon();
                     break;
            case 3:
                     time = combatUseItem();
                     break;
            case 4:
                     time = combatFlee();
                     break;
         }
         
         if (time == -1)
            choice = 0;
      }
      return time;
   }
//--------------------------------------------------------------------------
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
//--------------------------------------------------------------------------
   public int combatUseWeapon() {
   
      int enemy = 1;
      int enemyCount = CombatArena.countEnemies();
                     
      if (enemyCount > 1) {
         System.out.println("[ ? ? ? ]   Choose an enemy: ");
         CombatArena.listEnemies();
         enemy = getUserInt(enemyCount);
      }
      attack(CombatArena.getEnemy(enemy));
      return inventory.weaponAttackTime();
   }
//--------------------------------------------------------------------------
   public int combatSwapWeapon() {
   
      if (inventory.swapWeapon() == 1) {
         System.out.println("[ ! ! ! ]   No secondary weapon!");
         return -1;
      }
      System.out.println(name + " is now weilding " + inventory.weaponName());
      return speed;
   }
//--------------------------------------------------------------------------
   public int combatUseItem() {
   
      int itemCount = inventory.itemCount();
      int enemyCount = CombatArena.countEnemies();
      
      if (itemCount == 0) {
         System.out.println("[ ! ! ! ]   No items!");
         return -1;
      }
      
      System.out.println("[ ? ? ? ]   Choose an item: ");
      inventory.itemListPrint();
      System.out.println(" " + (itemCount+1) + ": Forget it.");
      
      int itemGet = getUserInt(itemCount+1);
      if (itemGet == itemCount+1)
         return -1;
         
      System.out.println("[ ? ? ? ]   Choose a target: ");
      CombatArena.listEnemies();
      System.out.println(" " + (enemyCount+1) + ": " + name + " " + getHP() );
      
      int enemyGet = getUserInt(enemyCount+1);
      Fightable target = CombatArena.getEnemy(enemyGet);
      return inventory.useItem(itemGet, target);
   }
//--------------------------------------------------------------------------
   public int combatFlee() {
   
      System.out.println("[ ? ? ? ]   Fleeing combat will result in forfeiting the hallway.");
      System.out.println("            Are you sure you want to flee?");
      System.out.println(" 1. Yes\n 2. No");
      int choice = getUserInt(2);
      if (choice == 1) {
         CombatArena.flee();
         return speed;
      }
      return -1;
   }
//--------------------------------------------------------------------------
   public Item giveItem(Item item) {
      
      if (item instanceof Armor)
         return inventory.setArmor( (Armor) item);
         
      if (item instanceof Usable) {
         inventory.setItem( (Usable) item);
         return null;
      }
      
      if (item instanceof Weapon) {
         if (!inventory.hasSecondaryWeapon()) {
            inventory.setWeapon( (Weapon) item, 2);
            return null;
         } else {
            System.out.println("Which weapon to give up?");
            System.out.println(inventory.weaponList() + "\n3. Forget it"); 
            int choice = getUserInt(3);
            switch (choice) {
               case 1: return inventory.setWeapon( (Weapon) item, 1);
               case 2: return inventory.setWeapon( (Weapon) item, 2);
            }
         }
      }
      return item;
   }
//--------------------------------------------------------------------------
}
