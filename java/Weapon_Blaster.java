public class Weapon_Blaster extends Weapon
{
   public Weapon_Blaster(int level)
   {
      name = "Blaster";
      description = "A standard issue blaster pistol.";
      message = " fires a blaster at ";
      damage = (level / 3) + 1;
      accuracy = .7 * ((level / 3) + 1);
      attackTime = 5;
   }
}