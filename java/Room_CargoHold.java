import java.util.*;

public class Room_CargoHold extends Room
{
   
   protected int Max_Items = 4; // zero included.
   protected int Max_Enemies = 4; //zero Included.
   
	@Override
	public void MakeDescription()
	{
		 this.Description = "*The Cargo Hold*\nAs you make your way inside you find a huge room with smaller ships" +
		 		" for transporting prisoners, but unfortunately they are all destroyed. Scavage what you can here and" +
		 		"move on.";
	}
   
   @Override
   public void MakeItems()
   {
      
      ItemFactory_CargoHold factory = new ItemFactory_CargoHold();
      
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