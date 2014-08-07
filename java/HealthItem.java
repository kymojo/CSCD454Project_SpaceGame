public abstract class HealthItem extends Usable
{
   protected int healthRes;
   
   public int use()
   {
      uses--;
      return healthRes;
      
   }
   
}