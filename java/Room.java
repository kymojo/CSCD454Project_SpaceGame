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
   
   public Item getItem(int index)
   {
      Item item = this.ItemList[index];
      this.ItemList[index] = null;
      
      Item[] tempItemList = new Item[this.ItemList.length-1];
      
      int j=0;
      for(int i=0;i<this.ItemList.length;i++)
      {
         if(this.ItemList[i]!=null)
         {
            tempItemList[j]=this.ItemList[i];   // YOUR ARE HERE
         }
      }
      
      this.ItemList = tempItemList;
      return item;
   }
   
   public void setEnemyList(Enemy[] EnemyList)
   {
      this.EnemyList = EnemyList;
   }
   
   public void clearEnemyList()
   {
      this.EnemyList = new Enemy[0];
   }
   
   public Enemy[] getEnemyList()
   {
      return this.EnemyList;
   }
   
   public boolean hasEnemy()
   {
      if(EnemyList.length>0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public boolean hasItem()
   {
      if(ItemList.length>0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }
   
   public void whatsInRoom(int x)
   {
      System.out.println("*Room: "+x+"*");
      System.out.print("-Items: ");
      for(int j=0;j<ItemList.length;j++)
      {
         if(j!=0)
         {
            System.out.print(", ");
         }
         System.out.print(ItemList[j].getName());
      }
      System.out.println();
      System.out.print("-Enemies: ");
      for(int j=0;j<EnemyList.length;j++)
      {
         if(j!=0)
         {
            System.out.print(", ");
         }
         System.out.print(EnemyList[j].getName());
      }
      System.out.println();

   }
}