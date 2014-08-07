public abstract class Usable extends Item
{
   
   protected int useTime;
   
   protected int uses;
   
   public abstract int use();
   
   public int getTime()
   {
      return useTime;   
   }
}