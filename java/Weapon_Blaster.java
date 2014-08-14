public class Weapon_Blaster extends Weapon
{
   public Weapon_Blaster(int level)
   {
      name = "Blaster";
      damage = 3 + (level * 2);
      accuracy = .7;
      attackTime = 5;
      weaponDescription("A standard issue blaster pistol.");
      message = " fires a blaster at ";
   }
}