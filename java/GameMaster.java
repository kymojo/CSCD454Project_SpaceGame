

public class GameMaster 
{
   
	
	
   public static void main(String[] args) 
   {
      StartGame();
      
      
      
	   //Test_Hallway();
	   //Test_Menu();
      //Test_RandomHallwayTracker();
   }
   
   public static void StartGame()
   {
      Hallway hallway;                                            //Main Hallway that will be used
      int floor=0;                                                  //Floor tracker
      RandomHallwayTracker HWTracker = new RandomHallwayTracker();//Hallway tracker
      Character player;                                           //This is the players character.
      Menu menu=new Menu();                                       //Menu instance
      FightHelper fightHelper = new FightHelper();                //FightHelper for combat
      CombatArena arena = CombatArena.getInstance();              //Arena Instance
      
      menu.intro();
      
      int choice;
      do
      {
         
         choice=menu.mainMenu();
         
         if(choice==1)
         {
            //Start Game
            player = new Character();
            
            menu.startGameIntro();
            
            //Hallway
            do
            {
               floor++;
               String FirstHW  = HWTracker.randomHallway();
               String SecondHW = HWTracker.randomHallway();
               String ThirdHW  = HWTracker.randomHallway();
               
               menu.hallwayChoice(floor,FirstHW,SecondHW,ThirdHW);
               
               int HWchoice=menu.pickHallway();
               String HWtype="***ERROR***";
               
               if(HWchoice==1)
               {
                  HWtype = FirstHW;
               }
               else if(HWchoice==2)
               {
                  HWtype = SecondHW;
               }
               else if(HWchoice==3)
               {
                  HWtype = ThirdHW;
               }
            
               hallway = new Hallway(HWtype,floor);
            
               hallway.getHallwayDescription();
               
               menu.pressEnterContinue();
               
               //Room
               boolean flag =true;
               int roomNum  =1; 
               while(flag&&roomNum<4)
               {
                  hallway.whatsInACertainRoom(roomNum);
                  menu.pressEnterContinue();
                  int CombatOutcome = -1;
                  Enemy[] tempEnemyList = hallway.getEnemyListCertainRoom(roomNum);
                  
                  if(hallway.hasEnemyCertainRoom(roomNum))
                  {
                     //Combat
                     CombatArena.addCombatant(player);
                     for(int i=0;i<tempEnemyList.length;i++)
                     {
                        CombatArena.addCombatant(tempEnemyList[i]);
                     }
                     CombatOutcome=CombatArena.combatSteps();
                  }
                  else
                  {
                     //Skip Combat
                     //Collect Room Items
                     
                     //check if there is items in the room.
                     
                     //collect items
                  }
                  
                  
                  if(CombatOutcome==1)
                  {
                     //Victory
                     //Collect Room Items
                  }
                  else if(CombatOutcome==2)
                  {
                     //Died
                     menu.diedText();
                     flag=false;
                     floor=99;
                  }
                  else if(CombatOutcome==3)
                  {
                     //Flee
                     //Don't get to collect items and move to the next floor
                     roomNum=4;
                     flag=false;
                  }
                  
                  
                  
                  
                  //******
                  //Iteration
                  roomNum++;
               }
            
            }while(floor<5);
            
            if(floor==4)
            {
               //Boss FIght
               System.out.println("Boss Fight");
            }
         }
         else if(choice==2)
         {
            //Credits then back to main menu
            menu.credits();
            
         }
         else if(choice==3)
         {
            //Quit
         }
      }while(choice!=3&&choice!=1);
   }
   
   public static void ResetGame()
   {
      //Reset all things 
      //Go thru menu again.
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
	   
	   //menu.StartMenu();
   }
   
   public static void Test_RandomHallwayTracker()
   {
      RandomHallwayTracker HWTracker = new RandomHallwayTracker();
      
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
      System.out.println(HWTracker.randomHallway());
   }
}