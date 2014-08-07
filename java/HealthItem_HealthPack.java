public class HealthItem_HealthPack extends HealthItem
{
   public HealthItem_HealthPack(int level)//add amount integer
   {
      healthRes = 25 + ((level / 2) + 1);
      useTime = 5;
   }
   
   public int getTime()
   {
      return useTime;
   }
   
   
}