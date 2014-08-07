public class Weapon_HeavyBlaster extends Weapon
{
   public Weapon_HeavyBlaster(int level)
   {
      name = "Heavy Blaster";
      description = "A more powerful version of the standard issue blaster pistol.";
      damage = level;
      accuracy = .7 * (level);
      attackTime = 7;
   }
}