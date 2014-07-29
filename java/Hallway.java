public class Hallway
{
	Room[] theHallway;
	int floor;
	String type;
	RoomFactory factory;
   
   
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
	   
	   room.MakeDescription();
	   
	   return room;
   }

   public String Test_theHallway()
   {
	   String StringReturn = "";
	   
	   for(int i=0;i<3;i++)
	   {
		   StringReturn= StringReturn + this.theHallway[i].getDescription();
	   }
	   
	   return StringReturn;
   }


}