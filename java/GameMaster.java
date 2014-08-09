

public class GameMaster 
{

	
	
   public static void main(String[] args) 
   {
	   //Hallway hallway;
	   //Hero value
	   
	   Test_Hallway();
	   //Test_Menu();
   
   
   
   }
   
   public static void StartGame()
   {
	   //Play Menus
      //Start game in a place where you can see 3 rooms and there types
      //when you go into the rooms you see the rooms description only this one time
      //next room enemy or items third room is enemy or items
      //leave the 3 rooms go to the next floor
      //next floor things get harder same stuff
      //next floor things get harder same stuff
      //next floor boss
      //win / lose game
      //start over
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