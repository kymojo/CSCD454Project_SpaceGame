public class Weapon_LaserRifle extends Weapon
{

   public Weapon_LaserRifle(int level)
   {
      name = "Laser Rifle";
      message = " fires a laser rifle at ";
      damage = 2 * level;
      accuracy = .8 * ((level / 2) + 1);
      attackTime = 5;
      weaponDescription("A advanced weapon using pure light");
   }
}