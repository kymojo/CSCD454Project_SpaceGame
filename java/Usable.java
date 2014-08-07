public abstract class Usable extends Item
{
   public abstract int use();
     
   protected int useTime;
   
   protected int uses;
   
   public int getTime()
   {
      return useTime;   
   }
}