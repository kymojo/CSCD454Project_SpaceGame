public class PlasmaRifle extends Weapon
{
   

   public PlasmaRiffle(int level)
   {
      name = "Plasma Rifle";
      description = "A strange alien weapon that seems to fire pure energy.";
      damage = 2 * level;
      accuracy = .7 * ((level / 2) + 1);
      attackTime = 5;
   }
}