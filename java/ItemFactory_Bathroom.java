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
         return new HealthItem_Apple(level);
      }
      else if(name.equals("armor"))
      {
         return new Armor_LightArmor(level);
      }
      else if(name.equals("spoon"))
      {
         return new Weapon_Spoon(level);
      }
      else if(name.equals("blaster"))
      {
         return new Weapon_Blaster(level);
      }
      
      return new HealthItem_HealthPack(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new Weapon_Blaster(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return new Armor_LightArmor(level);
   }
   
   public  Item getBossItem(int level)
   {
      return new HealthItem_HealthPack(level);
   }

}