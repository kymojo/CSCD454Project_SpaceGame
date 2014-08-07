public class DockingBayItemFactory extends ItemFactory
{
   public DockingBayItemFactory()
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
         return new FragGrenade(level);
      }
      else if(name.equals("lasersword"))
      {
         return new LaserSword(level);
      }
      else if(name.equals("apple"))
      {
         return new Apple(level);
      }
      else if(name.equals("blaset"))
      {
         return new Blaster(level);
      }
      
      return new HealthPack(level);
      
   }
   
   public  Item getBossWeapon(int level)
   {
      return new LaserSword(level);
   }
   
   public  Item getBossArmor(int level)
   {
      return new LightArmor(level);
   }

   public  Item getBossItem(int level)
   {
      return new HealthPack(level);
   }
}