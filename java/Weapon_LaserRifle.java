public class Weapon_LaserRifle extends Weapon
{

   public Weapon_LaserRifle(int level)
   {
      name = "Laser Rifle";
      description = "Am advanced weapon using pure light.";
      message = " fires a laser rifle at ";
      damage = 1.5 * level;
      accuracy = .8 * ((level / 2) + 1);
      attackTime = 5;
   }
}