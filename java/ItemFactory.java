import java.util.Random;
import java.util.ArrayList;

public abstract class ItemFactory
{

   private int len = 5;
   ArrayList<String> items = new ArrayList(len);
   
   public abstract Item makeItem(int level);
   
   public abstract Item getBossWeapon(int level);
   
   public abstract Item getBossArmor(int level);
   
   public abstract Item getBossItem(int level);
   
   protected int getIndex()
   {
      Random myRand = new Random();
      return myRand.nextInt(len);
   }
   
}
   
   
   //cafeteria, armory, bathroom, Bridge, Cargo Hold, Docking Bay, Guard Quarter, High Security Cells, infirmary
    