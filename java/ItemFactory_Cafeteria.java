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
         return new Weapon_Spoon(level);
      }
      else if(name.equals("health"))
      {
         return new HealthItem_HealthPack(level);
      }
      else if(name.equals("blaster"))
      {
         return new Weapon_Blaster(level);
      }
      else if(name.equals("knife"))
      {
         return new Weapon_Knife(level);
      }
     
       return new FightItem_FragGrenade(level);
      
   }
   
   public Item getBossWeapon(int level)
   {
      return new Weapon_Knife(level);
   }
   
   public Item getBossArmor(int level)
   {
      return new Armor_LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new FightItem_FragGrenade(level);
   }
}