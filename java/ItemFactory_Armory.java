public class ItemFactory_Armory extends ItemFactory
{
   public ItemFactory_Armory()
   {
      this.items.add("apple");
      this.items.add("laserRifle");
      this.items.add("plasma");
      this.items.add("armor");
      this.items.add("grenade");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("apple"))
      {
         return new HealthItem_Apple(level);
      }
      else if(name.equals("laserRifle"))
      {
         return new Weapon_LaserRifle(level);
      }
      else if(name.equals("plasma"))
      {
         return new Weapon_PlasmaRifle(level);
      }
      else if(name.equals("grenade"))
      {
         return new FightItem_FragGrenade(level);
      }
      
       return new Armor_LightArmor(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new Weapon_LaserRifle(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return new Armor_LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new HealthItem_Apple(level);
   }
}