public class ItemFactory_Infirmary extends ItemFactory
{
   public ItemFactory_Infirmary()
   {
      this.items.add("health");
      this.items.add("apple");
      this.items.add("blaster");
      this.items.add("armor");
      this.items.add("spoon");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("health"))
      {
         return new HealthPack(level);
      }
      else if(name.equals("apple"))
      {
         return new Apple(level);
      }
      else if(name.equals("blaster"))
      {
         return new Blaster(level);
      }
      else if(name.equals("armor"))
      {
         return new LightArmor(level);
      }
      
      return new Spoon(level);
      
   }
   
   public abstract Item getBossWeapon(int level)
   {
      return new Blaster(level);
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