public class Boss extends Enemy
{
   public Boss() 
   {
   
      name = "The Boss";
      
      healthMax = 10;
      health = healthMax;
      
      inventory = new Inventory(this);
      //inventory.setWeapon(new Weapon_Basic(), 1);
      //inventory.setArmor(new Armor_Basic());
      
      speed = 5;
      clock = new CombatTimer(this);
   }
   public void setWeapon(Weapon w)
   {
      //this.inventory.setWeapon(new w,1);
   }
   public int combat() 
   {
   
      int time = 0;
      
      
      attack(CombatArena.getPlayer());
      time = inventory.getWeapon()/* THIS IS A PROBLEM */.getAttackTime();
      return time;
   }
}