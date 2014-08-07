public class FragGrenade extends FightItem
{
   public FragGrenade(int level)
   {
      damage = 10;
      acuracy = .4;
      useTime = 4;
   }
   
   public int getTime()
   {
      return useTime;
   }
   
}