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
         return new Apple(level);
      }
      else if(name.equals("laserRifle"))
      {
         return new LaserRifle(level);
      }
      else if(name.equals("plasma"))
      {
         return new PlasmaRifle(level);
      }
      else if(name.equals("grenade"))
      {
         return new FragGrenade(level);
      }
      
       return new LightArmor(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new LaserRifle(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return new LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new Apple(level);
   }
}