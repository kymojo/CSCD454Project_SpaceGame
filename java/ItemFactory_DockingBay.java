public class ItemFactory_DockingBay extends ItemFactory
{
   public ItemFactory_DockingBay()
   {
      this.items.add("grenade");
      this.items.add("lasersword");
      this.items.add("apple");
      this.items.add("blaster");
      this.items.add("health");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("grenade"))
      {
         return new FightItem_FragGrenade(level);
      }
      else if(name.equals("lasersword"))
      {
         return new Weapon_LaserSword(level);
      }
      else if(name.equals("apple"))
      {
         return new HealthItem_Apple(level);
      }
      else if(name.equals("blaset"))
      {
         return new Weapon_Blaster(level);
      }
      
      return new HealthItem_HealthPack(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new Weapon_LaserSword(level);
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