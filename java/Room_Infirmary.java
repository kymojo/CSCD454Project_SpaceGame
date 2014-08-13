import java.util.*;

public class Room_Infirmary extends Room
{
   
   protected int Max_Items = 4; // zero included.
   protected int Max_Enemies = 4; //zero Included.
   
	@Override
	public void MakeDescription()
	{
		 this.Description = "*The Infirmary*\n Walking into the room you see rows of beds, as you have been in here before you remember\n" +
		 		"this place to be very clean and orginized as Dr.Zed was head of this facility he was always nice, You hope he made it out\n" +
		 		"in time, because you dont see him here.";
	}
   
   @Override
   public void MakeItems()
   {
      
      ItemFactory_Infirmary factory = new ItemFactory_Infirmary();
      
      Random rand = new Random();
      int  n = rand.nextInt(Max_Items);
      
      Item[] newItems = new Item[n];
      
      for(int i=0;i<n;i++)
      {
         newItems[i] = factory.makeItem(this.floor);
      }
      
      this.ItemList = newItems;
   }
   
   @Override
   public void MakeEnemies()
   {
	   EnemyRandomFactory factory = new EnemyRandomFactory();
      
      Random rand = new Random();
      int n = rand.nextInt(Max_Enemies);
      
      Enemy[] newEnemies = new Enemy[n];
      
      for(int i=0;i<n;i++)
      {
         newEnemies[i] = factory.makeEnemy();
      }
      
      this.EnemyList = newEnemies;
   }

}