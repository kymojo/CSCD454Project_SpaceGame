public class GuardQuarterItemFactory extends ItemFactory
{
   public GuardQuarterItemFactory()
   {
      this.items.add("blaster");
      this.items.add("armor");
      this.items.add("grenade");
      this.items.add("apple");
      this.items.add("spoon");
   }
   
   public Item makeItem(int level)
   {
      int index = getIndex();
      String name = this.items.get(index);
      if(name.equals("blaster"))
      {
         return new Blaster(level);
      }
      else if(name.equals("armor"))
      {
         return new LightArmor(level);
      }
      else if(name.equals("grenade"))
      {
         return new FragGrenade(level);
      }
      else if(name.equals("apple"))
      {
         return new Apple(level);
      }
      
      return new Spoon(level);
      
   }
   
   public Item getBossWeapon(int level)
   {
      return new Spoon(level);
   }
   
   public Item getBossArmor(int level)
   {
      return LightArmor(level);
   }
   
   public Item getBossItem(int level)
   {
      return new Apple(level);
   }

}