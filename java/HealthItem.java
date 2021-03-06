public abstract class HealthItem extends Usable
{
   protected int healthRes;
   
   public int doItem()
   {
      return healthRes;
   }
   
   public String toString() {
   
      String result = name + " (+" + healthRes + "hp)";
      if (uses > 1)
         result += " x" + uses;
      return result;
   }
   
}