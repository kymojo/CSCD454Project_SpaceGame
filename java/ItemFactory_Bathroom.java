public class ItemFactory_Bathroom extends ItemFactory
{
   public ItemFactory_Bathroom()
   {
      this.items.add("apple");
      this.items.add("armor");
      this.items.add("spoon");
      this.items.add("health");
      this.items.add("blaster");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("apple"))
      {
         return new Apple(level);
      }
      else if(name.equals("armor"))
      {
         return new LightArmor(level);
      }
      else if(name.equals("spoon"))
      {
         return new Spoon(level);
      }
      else if(name.equals("blaster"))
      {
         return new Blaster(level);
      }
      
      return new HealthPack(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new Blaster(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return new LightArmor(level);
   }
   
   public  Item getBossItem(int level)
   {
      return new HealthPack(level);
   }

}