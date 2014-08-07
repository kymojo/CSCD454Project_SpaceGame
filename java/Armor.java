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
   public int damageReduce(int damage) {
      
      double dmg = damage;
      damage *= defModifier;
      return (int) Math.round(dmg);
   }
   
   /**
    * General get method for armor name.
    * 
    * @return        armor name
    */
   public String getName() {
      return name;
   }
}