

public class GameMaster 
{

	
	
   public static void main(String[] args) 
   {
	   //Hallway hallway;
	   //Hero value
	   
	   //Test_Hallway();
	   Test_Menu();
   
   
   
   }
   
   public static void StartGame()
   {
	   
   }
   
   public static void ResetGame()
   {
   
   }
   
   public static void Test_Hallway()
   {
	   String type = "Armory";
	   int floor = 1;
			      
	   Hallway hallway = new Hallway(type,floor);
	   
	   System.out.println(hallway.Test_theHallway());
	   
   }
   
   public static void Test_Menu()
   {
	   Menu menu=new Menu();
	   
	   menu.StartMenu();
	   
	   
   }
}