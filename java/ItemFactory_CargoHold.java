public class ItemFactory_CargoHold extends ItemFactory
{
   public ItemFactory_CargoHold()
   {
      this.items.add("heavyblaster");
      this.items.add("grenade");
      this.items.add("plasma");
      this.items.add("apple");
      this.items.add("lasersword");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("heavyblasetr"))
      {
         return new Weapon_HeavyBlaster(level);
      }
      else if(name.equals("grenade"))
      {
         return new FightItem_FragGrenade(level);
      }
      else if(name.equals("plasma"))
      {
         return new Weapon_PlasmaRifle(level);
      }
      else if(name.equals("apple"))
      {
         return new HealthItem_Apple(level);
      }
      
      return new Weapon_LaserSword(level);
      
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
      return new FightItem_FragGrenade(level);
   }

}