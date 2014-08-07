public class LaserSword extends Weapon
{
   public LaserSword(int level)
   {
      name = "Laser Sword";
      description = "Am prototype beam weapon made of burning light.";
      damage = 2 * level;//the amount of damage a weapon does can definitely change, wasn't sure how we want to affect that
      accuracy = .3 * level;
      if(accuracy > 1.0)
      {
         accuracy = 1.0;
      }
      attackTime = 5;
   }
}