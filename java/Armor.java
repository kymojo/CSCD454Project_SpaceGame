/**
 * An abstract armor class extensible to concrete Armor.
 *
 * @author  Kyle Johnson
 */

public abstract class Armor extends Item{

   protected double defModifier;
   
   /**
    * 
    *
    * @param   damage   damage to be reduced
    * @return           return damage to be dealt.
    */
   public int damageReduce(double damage) {
      
      double dmg = damage;
      damage *= defModifier;
      return (int) Math.round(dmg);
   }
}