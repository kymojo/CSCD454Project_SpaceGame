public class Weapon_PlasmaRifle extends Weapon
{
   

   public Weapon_PlasmaRifle(int level)
   {
      name = "Plasma Rifle";
      message = " fires a plasma rifle at ";
      damage = 2 * level;
      accuracy = .7 * ((level / 2) + 1);
      attackTime = 5;
      weaponDescription("A strange alien weapon that seems to fire pure energy.");
   }
}