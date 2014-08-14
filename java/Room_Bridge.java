import java.util.*;

public class Room_Bridge extends Room
{
   protected int Max_Items = 4; // zero included.
   protected int Max_Enemies = 4; //zero Included.
   
	@Override
	public void MakeDescription()
	{
		 this.Description = "*The Bridge*\nThe bridge is the command center for this space prison, only the highest commanders are\n here to over see the prison. I bet there might be a weapon or 2 in here.";
	}
   
   @Override
   public void MakeItems()
   {
      
      ItemFactory_Bridge factory = new ItemFactory_Bridge();
      
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