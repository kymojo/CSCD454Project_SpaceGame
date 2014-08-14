public class ItemFactory_GuardsQuarters extends ItemFactory
{
   public ItemFactory_GuardsQuarters()
   {
      this.items.add("blaster");
      this.items.add("armor");
      this.items.add("grenade");
      this.items.add("LaserSword");
      this.items.add("spoon");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("blaster"))
      {
         return new Weapon_LaserRifle(level);
      }
      else if(name.equals("armor"))
      {
         return new Armor_HeavyArmor(level);
      }
      else if(name.equals("grenade"))
      {
         return new FightItem_FragGrenade(level);
      }
      else if(name.equals("LaserSword"))
      {
         return new Weapon_LaserSword(level);
      }
      
      return new Weapon_Spoon(level);
      
   }
   
   public Item getBossWeapon(int level)
   {
      return new Weapon_LaserSword(level);
   }
   
   public Item getBossArmor(int level)
   {
      return new Armor_HeavyArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new HealthItem_Apple(level);
   }

}