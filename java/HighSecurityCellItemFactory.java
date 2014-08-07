public class HighSecurityCellItemFactory extends ItemFactory
{
   public HighSecurityCellItemFactory()
   {
      this.items.add("apple");
      this.items.add("spoon");
      this.items.add("knife");
      this.items.add("blaster");
      this.items.add("health");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("apple"))
      {
         return new Apple(level);
      }
      else if(name.equals("spoon"))
      {
         return new Spoon(level);
      }
      else if(name.equals("knife"))
      {
         return new Knife(level);
      }
      else if(name.equals("blaster"))
      {
         return new Blaster(level);
      }
      
      return new HealthPack(level);
      
   }
   
   public abstract Item getBossWeapon(int level)
   {
      return new Knife(level);
   }
   
   public abstract Item getBossArmor(int level)
   {
      return LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new HealthPack(level);
   }

}