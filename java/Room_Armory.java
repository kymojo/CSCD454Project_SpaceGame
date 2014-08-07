import java.util.*;

public class Room_Armory extends Room
{
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
	   //make factory for this type of room
      //make random set of items for this room 0-3
      
      Item[] newItems = new Item[3];
      
      ItemFactory_Armory factory = new ItemFactory_Armory();
      
      Random rand = new Random();
      int  n = rand.nextInt(3);
      
      for(int i=0;i<n;i++)
      {
         newItems[i] = factory.makeItem(this.floor);
      }
      
      this.ItemList = newItems;
   }
   
   @Override
   public void MakeEnemies()
   {
	   
   }
}