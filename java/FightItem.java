import java.util.Random;

public abstract class FightItem extends Usable
{
   protected double damage;
   protected double acuracy;
   
   public double use()
   {
      uses--;
      Random myRand = new Random();
      double num = myRand.nextDouble();
      if(num > acuracy)
      {
         return damage;
      }
      return -1;
   }
}