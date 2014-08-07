import java.util.*;

public class RoomFactory
{
   public Room makeRoom(String type)
   {
      Room room = null;
      
      if(type.equals("Armory"))
      {
    	  room = new Room_Armory();
      }
      else if(type.equals("Infirmary"))
      {
    	  room = new Room_Infirmary();
      }
      else if(type.equals("Cafeteria"))
      {
    	  room = new Room_Cafeteria();
      }
      else if(type.equals("Bathroom"))
      {
    	  room = new Room_Bathroom();
      }
      else if(type.equals("GuardsQuarters"))
      {
    	  room = new Room_GuardsQuarters();
      }
      else if(type.equals("HighSecurityCells"))
      {
    	  room = new Room_HighSecurityCells();
      }
      else if(type.equals("CargoHold"))
      {
    	  room = new Room_CargoHold();
      }
      else if(type.equals("Bridge"))
      {
    	  room = new Room_Bridge();
      }
      else if(type.equals("DockingBay"))
      {
    	  room = new Room_DockingBay();
      }
      else if(type.equals("Boss"))
      {
    	  room = new Room_Boss();
      }
      
      return room;
   }
}