public class FightItem_FragGrenade extends FightItem
{
   public FightItem_FragGrenade(int level)
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