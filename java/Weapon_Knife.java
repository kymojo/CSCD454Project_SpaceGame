public class Weapon_Knife extends Weapon
{
   public Weapon_Knife(int level)
   {
      name = "Knife";
      damage = level * 2;
      accuracy = .8;
      attackTime = 2;
      weaponDescription("A simple kitchen knife.");
      message = " thrusts a knife at ";
   }
}