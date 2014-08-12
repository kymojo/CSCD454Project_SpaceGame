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