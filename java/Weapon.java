/**
 * An abstract weapon class extensible to concrete Weapons.
 *
 * @author  Kyle Johnson
 */
 
import java.util.Random;

public abstract class Weapon extends Item{

   
   protected int damage;
   protected double accuracy;
   protected int attackTime;
   
   /**
    * The attack method for a weapon. It uses the accuracy value
    * to check if the attack connects. If it does, the weapon deals
    * damage equal to the weapon's damage stat. Else, a -1 is returned
    * to signify that the attack missed;.
    *
    * @return  return damage to be dealt.
    */
   public int attack() {
      
      Random random = new Random();
      
      if (accuracy > random.nextDouble())
         return this.damage;
      else
         return -1;
   }
   
   /**
    *
    */
   public int getAttackTime() {
      return this.attackTime;
   }
   
   public void weaponDescription(String descrip) {
      description = (descrip + "\n DMG - " + damage + "\n SPD - "
                     + attackTime + "\n ACC - " + (accuracy*100) + "%");
   }
}