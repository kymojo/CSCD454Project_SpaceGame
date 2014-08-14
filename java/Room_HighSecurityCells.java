import java.util.*;

public class Room_HighSecurityCells extends Room
{
   
   protected int Max_Items = 4; // zero included.
   protected int Max_Enemies = 4; //zero Included.
   
	@Override
	public void MakeDescription()
	{
		 this.Description = "*High Security Cells*\nYou are a criminal, but never as bad as some of the people in this place.\n" +
		 		"You see that most of the cells are open and that can only mean that you need to get to the 3rd floor and get to the\n" +
		 		"escape pods even faster!";
	}
   
   @Override
   public void MakeItems()
   {
      
      ItemFactory_HighSecurityCell factory = new ItemFactory_HighSecurityCell();
      
      Random rand = new Random();
      int  n = rand.nextInt(Max_Items);
      
      Item[] newItems = new Item[n];
      
      for(int i=0;i<n;i++)
      {
         newItems[i] = factory.makeItem(this.floor);
      }
      
      this.ItemList = newItems;
      this.bossWeapon = factory.getBossWeapon(this.floor);
      this.bossArmor  = factory.getBossArmor(this.floor);
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