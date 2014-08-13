import java.util.*;

public class Room_GuardsQuarters extends Room
{
	
   protected int Max_Items = 4; // zero included.
   protected int Max_Enemies = 4; //zero Included.
   
	@Override
	public void MakeDescription()
	{
		 this.Description = "*Guard's Quarters*\nThis place was once the sleeping, living, and eating area for the guards. Now" +
		 		" it is all ripped apart and mangled. You feel this is one of the first places that the prisoners would have gone to.";
	}
   
   @Override
   public void MakeItems()
   {
      
      ItemFactory_GuardsQuarters factory = new ItemFactory_GuardsQuarters();
      
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