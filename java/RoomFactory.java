import java.util.*;

public class RoomFactory
{
   public Room makeRoom(String type)
   {
      Room room = null;
      
      if(type.equals("Armory"))
      {
    	  room = new Armory();
      }
      else if(type.equals("Infirmary"))
      {
    	  room = new Infirmary();
      }
      else if(type.equals("Cafeteria"))
      {
    	  room = new Cafeteria();
      }
      else if(type.equals("Bathroom"))
      {
    	  room = new Bathroom();
      }
      else if(type.equals("GuardsQuarters"))
      {
    	  room = new GuardsQuarters();
      }
      else if(type.equals("HighSecurityCells"))
      {
    	  room = new HighSecurityCells();
      }
      else if(type.equals("CargoHold"))
      {
    	  room = new CargoHold();
      }
      else if(type.equals("Bridge"))
      {
    	  room = new Bridge();
      }
      else if(type.equals("DockingBay"))
      {
    	  room = new DockingBay();
      }
      else if(type.equals("BossRoom"))
      {
    	  room = new BossRoom();
      }
      
      return room;
   }
}