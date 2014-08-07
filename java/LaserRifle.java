public class LaserRifle extends Weapons
{

   public LaserRifle(int level)
   {
      name = "Laser Rifle";
      description = "Am advanced weapon using pure light.";
      damage = 1.5 * level;
      accuracy = .8 * ((level / 2) + 1);
      attackTime = 5;
   }
}