import java.util.*;

public class EnemyRandomFactory
{
   public Enemy makeEnemy()
   {
      int number_Of_Enemies_Posible = 3; //Change this, if you add a new enemy type.
      
      Random rand = new Random();
      int  n = rand.nextInt(number_Of_Enemies_Posible)+1;
      
      Enemy enemy = null;
      
      if(n==1)
      {
    	   enemy = new Enemy_Prisoner();
      }
      else if(n==2)
      {
         enemy = new Enemy_Shanker();
      }
      else if(n==3)
      {
         enemy = new Enemy_Brute();
      }
    	else
      {
         System.out.println("*** ERROR EnemyFactory ***");
      }
      
      return enemy;
   }
   
}