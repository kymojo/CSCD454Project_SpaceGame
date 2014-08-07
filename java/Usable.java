public abstract class Usable extends Item
{
   
   protected int useTime;
   protected int uses;
   protected String stats;
 
   public void use(Fightable target) {
   
      if (uses != -1) //-1 means infinite
         uses--;
      int result = doItem();
      if (this instanceof HealthItem)
         target.heal(result);
      if (this instanceof FightItem) {
         if (result == 0)
            System.out.println("[ MISS! ]   " + name + " missed!");
         else
            target.defend(result);
      }
   }
   
   public abstract int doItem();
   
   public int getTime()
   {
      return useTime;   
   }
   
   public int getUses() {
      return uses;
   }
   
   public void addUses(int add) {
      uses += add;
   }
}