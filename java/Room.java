public class Room
{
   protected Item[] ItemList;
   protected Enemy[] EnemyList;
   protected String Description;
   protected String Type;
   protected int floor;


   public void MakeDescription()
   {
	   this.Description = "Room Description";
	   
   }

   //Make Items for the rooms
   public void MakeItems()
   {
	   
   }
   
   //Make Enemies for the rooms
   public void MakeEnemies()
   {
	   
   }

   public String getDescription()
   {
	   return this.Description;
   }
   
   //Get the type of room
   public String getType()
   {
	   return this.Type;
   }
   
   public void setFloor(int floor)
   {
      this.floor=floor;
   }
   
   public int getFloor()
   {
      return this.floor;
   }
   
   public void setItemList(Item[] ItemList)
   {
      this.ItemList = ItemList;
   }
   
   public Item[] getItemList()
   {
      return this.ItemList;
   }
   
   public void setEnemyList(Enemy[] EnemyList)
   {
      this.EnemyList = EnemyList;
   }
   
   public Enemy[] getEnemyList()
   {
      return this.EnemyList;
   }
   
}