public class ItemFactory_Bridge extends ItemFactory
{
   public ItemFactory_Bridge()
   {
      this.items.add("grenade");
      this.items.add("blaster");
      this.items.add("plasma");
      this.items.add("laser");
      this.items.add("apple");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("grenade"))
      {
         return new FragGrenade(level);
      }
      else if(name.equals("blaster"))
      {
         return new Blaster(level);
      }
      else if(name.equals("laser"))
      {
         return new LaserRifle(level);
      }
      else if(name.equals("apple"))
      {
         return new Apple(level);
      }
      
      return new PlasmaRifle(level);
     
   }
   
   public  Item getBossWeapon(int level)
   {
      return new PlasmaRifle(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return new LightArmor(level);
   }
   
   public  Item getBossItem(int level)
   {
      return new FragGrenade(level);
   }

}