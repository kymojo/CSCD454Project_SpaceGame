public class Blaster extends Weapon
{
   public Blaster(int level)
   {
      name = "Blaster";
      description = "A standard issue blaster pistol.";
      damage = (level / 3) + 1;
      accuracy = .7 * ((level / 3) + 1);
      attackTime = 5;
   }
}