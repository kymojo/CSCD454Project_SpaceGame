public class Weapon_HeavyBlaster extends Weapon
{
   public Weapon_HeavyBlaster(int level)
   {
      name = "Heavy Blaster";
      message = " fires a heavy blaster at ";
      damage = 5 + (level * 3);
      accuracy = .6;
      attackTime = 7;
      weaponDescription("A more powerful version of the standard issue blaster pistol.");

   }
}