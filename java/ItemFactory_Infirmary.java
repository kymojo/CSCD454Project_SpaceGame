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
         return new HealthItem_HealthPack(level);
      }
      else if(name.equals("apple"))
      {
         return new HealthItem_Apple(level);
      }
      else if(name.equals("blaster"))
      {
         return new Weapon_Blaster(level);
      }
      else if(name.equals("armor"))
      {
         return new Armor_LightArmor(level);
      }
      
      return new Weapon_Spoon(level);
      
   }
   
   public Item getBossWeapon(int level)
   {
      return new Weapon_Blaster(level);
   }
   
   public Item getBossArmor(int level)
   {
      return new Armor_LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new HealthItem_HealthPack(level);
   }

}