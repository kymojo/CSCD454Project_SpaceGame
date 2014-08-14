public class Hallway
{
   protected Room[] theHallway;
	protected int floor;
	protected String type;
	protected RoomFactory factory;
   
   
   public Hallway(String type, int floor)
   {
      this.floor = floor;
      this.type = type;
      this.factory = new RoomFactory();
      this.theHallway = CreateHallway();
   }
   
   public Room[] CreateHallway()
   {
	   Room[] hallway = new Room[3];
	   
	   for(int i=0;i<3;i++)
	   {
		   hallway[i] = CreateRoom();
	   }
	   
	   return hallway;
   }
   
   public Room CreateRoom()
   {
	   Room room;
	   
	   room = this.factory.makeRoom(this.type);
	   
      room.setFloor(this.floor);
	   room.MakeDescription();
      room.MakeItems();
	   room.MakeEnemies();
      
	   return room;
   }
   
   public void getHallwayDescription()
   {
      System.out.println(this.theHallway[0].getDescription());
   }
   
   public Enemy[] getEnemyListCertainRoom(int x)
   {
      return this.theHallway[x-1].getEnemyList();
   }
   
   public void clearEnemyListCertainRoom(int x)
   {
      this.theHallway[x-1].clearEnemyList();
   }

   public void whatsInACertainRoom(int x)
   {
      this.theHallway[x-1].whatsInRoom(x);
   }
   
   public boolean hasEnemyCertainRoom(int x)
   {
      return this.theHallway[x-1].hasEnemy();
   }
   
   public boolean hasItemCertainRoom(int x)
   {
      return this.theHallway[x-1].hasItem();
   }
   
   public Item getItemCertainRoom(int x,int index)
   {
      return this.theHallway[x-1].getItem(index);
   }
   
   public Item[] getItemListCertainRoom(int x)
   {
      return this.theHallway[x-1].getItemList();
   }
   
   public String Test_theHallway()
   {
	   String StringReturn = "";
	   
	   for(int i=0;i<3;i++)
	   {
		   StringReturn= StringReturn + this.theHallway[i].getDescription() + "\n";
         
         Item[] testItems = this.theHallway[i].getItemList();
         
         StringReturn+= "^ITEMS\n";
         for(int j=0;j<testItems.length;j++)
         {
            StringReturn = StringReturn + testItems[j].getName()+"\n";
            StringReturn = StringReturn + "*" +testItems[j].getDescription()+"\n";
         }
         
         Enemy[] testEnemies = this.theHallway[i].getEnemyList();
         
         StringReturn+= "^ENEMIES\n";
         for(int e=0;e<testEnemies.length;e++)
         {
            StringReturn = StringReturn + testEnemies[e].getName()+"\n";
         }
         
         StringReturn+="\n";
	   }
      
	   
	   return StringReturn;
   }


}