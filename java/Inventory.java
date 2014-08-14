/**
 * The class responsible for fighter inventory management.
 *
 * @author  Kyle Johnson
 */

import java.util.ArrayList;

public class Inventory {

   private Fightable fighter;
   private Weapon[] weapons = new Weapon[2];
   private Armor armor = null;
   private ArrayList<Usable> items = new ArrayList(0);
//--------------------------------------------------------------------------   
   /**
    * Constructor for Inventory
    * 
    * @param fighter the fighter this inventory is attached to 
    */
   public Inventory(Fightable fighter) {
   
      this.fighter = fighter;
   }
//--------------------------------------------------------------------------   
   /**
    * General get method for equipped weapon.
    * 
    * @return        current weapon
    */
   public Weapon getWeapon() {
   
      // Check for null weapon??
      return weapons[0];
   }
//--------------------------------------------------------------------------   
   /**
    * @return        attack damage for current weapon
    */
   public int weaponAttack() {
   
      return weapons[0].attack();
   }
//--------------------------------------------------------------------------   
   /**
    * @return        attack time for current weapon
    */
   public int weaponAttackTime() {
   
      return weapons[0].getAttackTime();
   }
//--------------------------------------------------------------------------   
   /**
    * Exchange current weapon for secondary weapon. If only one weapon,
    * display error message and return failure value.
    * 
    * @return        0 success, 1 failure
    */
   public int swapWeapon() {
   
      if (weapons[1] != null) {
         Weapon temp = weapons[0];
         weapons[0] = weapons[1];
         weapons[1] = temp;
         System.out.println(weapons[0].getName()+" swapped for "+weapons[1].getName());
         return 0;
      } else
         return 1;
   }
//--------------------------------------------------------------------------   
   /**
    * General set method for weapon slot.
    * 
    * @param   w     The new weapon
    * @param   slot  The weapon slot to set the new weapon in (1 or 2)
    * @return        weapon exchanged
    */
   public Weapon setWeapon(Weapon w, int slot) {
   
      Weapon dump = weapons[slot-1];
      weapons[slot-1] = w;     
      return dump;
   }
   
   public String weaponMessage() {
      return weapons[0].getMessage();
   }
//--------------------------------------------------------------------------   
   /**
    * General get method for armor slot.
    * 
    * @param   armor The new armor
    * @return        armor exchanged
    */
   public Armor getArmor() {
   
      return armor;
   }
//--------------------------------------------------------------------------   
   /**
    * @return        reduced damage from current armor
    */
   public int armorDamage(int dmg) {
      if (armor == null)
         return dmg;
      return armor.damageReduce(dmg);
   }
//--------------------------------------------------------------------------   
   /**
    * General set method for armor slot.
    * 
    * @param   armor The new armor
    * @return        armor exchanged
    */
   public Armor setArmor(Armor a) {
   
      Armor dump = this.armor;
      this.armor = a;
      
      return dump;
   }
//--------------------------------------------------------------------------   
   public void setItem(Usable it) {
      int index = hasItem(it);
      if (index == -1)
         items.add(it);
      else
         items.get(index).addUses(it.getUses());
   }
//--------------------------------------------------------------------------   
   public int hasItem(Usable it) {
   
      int i = 0;
      for (Usable u : items) {
         if ( it.getClass().equals(u.getClass()) )
            return i;
         i++;
      }
      return -1;
   }
//--------------------------------------------------------------------------   
   public void dropItem(Usable it) {
      items.remove(items.indexOf(it));
   }
//--------------------------------------------------------------------------   
   public int itemCount() {
   
      return items.size();
   }
//--------------------------------------------------------------------------   
   public void itemListPrint() {
   
      int i = 1;
      for (Usable use : items) {
         
         System.out.println(" "+i + ": " + use );
         i++;
      }
   }
//--------------------------------------------------------------------------   
   public int useItem(int index, Fightable target) {
      Usable it = items.get(index-1);
      System.out.println("[ . . . ]   " + fighter.getName() + it.getMessage());
      it.use(target);
      if (it.getUses() == 0)
         dropItem(it);
      return it.getTime();
   }
//--------------------------------------------------------------------------   
}