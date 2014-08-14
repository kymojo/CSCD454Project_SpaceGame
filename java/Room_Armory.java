import java.util.*;

public class Room_Armory extends Room
{
   protected int Max_Items = 4; // zero included.
   protected int Max_Enemies = 4; //zero Included.
   
	@Override
	public void MakeDescription()
	{
		 this.Description = "*The Armory*\nThe Armoy is the first place guard would go when things got hairy.\n" +
       "By the looks of the place it has been raided by the guards, but you just mind find something here.";
	}
   
   @Override
   public void MakeItems()
   {
      
      ItemFactory_Armory factory = new ItemFactory_Armory();
      
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