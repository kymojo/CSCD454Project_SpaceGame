public class ItemFactory_Cafeteria extends ItemFactory
{
   public ItemFactory_Cafeteria()
   {
      this.items.add("spoon");
      this.items.add("health");
      this.items.add("blaster");
      this.items.add("armor");
      this.items.add("knife");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("spoon"))
      {
         return new Spoon(level);
      }
      else if(name.equals("health"))
      {
         return new HealthPack(level);
      }
      else if(name.equals("blaster"))
      {
         return new Blaster(level);
      }
      else if(name.equals("knife"))
      {
         return new Knife(level);
      }
     
       return new FragGrenade(level);
      
   }
   
   public Item getBossWeapon(int level)
   {
      return new Knife(level);
   }
   
   public Item getBossArmor(int level)
   {
      return new LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new FragGrenade(level);
   }
}