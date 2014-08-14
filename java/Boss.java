public class Boss extends Enemy
{
   public Boss()
   {
      super("The Massive Prisoner", 50, 3);
   }
   
   public void setWeaponBoss(Item w)
   {
      Weapon ww = (Weapon) w;
      inventory.setWeapon(ww,1);
   }
   
   public void setArmorBoss(Item a)
   {
      Armor aa = (Armor) a;
      inventory.setArmor(aa);
   }
}