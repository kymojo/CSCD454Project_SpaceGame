import java.util.*;

public class GameMaster 
{
   
	
	
   public static void main(String[] args) 
   {
      StartGame();
      
      
      
	   //Test_Hallway();
	   //Test_Menu();
      //Test_RandomHallwayTracker();
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
   
   public static void StartGame()
   {
      Hallway hallway;                                            //Main Hallway that will be used
      int floor=0;                                                  //Floor tracker
      RandomHallwayTracker HWTracker = new RandomHallwayTracker();//Hallway tracker
      Character player;                                           ///This is the players character.
      Boss boss;                                                  //Boss
      Menu menu=new Menu();                                       //Menu instance
      //FightHelper fightHelper = new FightHelper();                //FightHelper for combat
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
            boss = new Boss();
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
               String bHWone="***ERROR***";
               String bHWtwo="***ERROR***";
               
               if(HWchoice==1)
               {
                  HWtype = FirstHW;
                  bHWone = SecondHW;
                  bHWtwo = ThirdHW;
               }
               else if(HWchoice==2)
               {
                  HWtype = SecondHW;
                  bHWone = FirstHW;
                  bHWtwo = ThirdHW;
               }
               else if(HWchoice==3)
               {
                  HWtype = ThirdHW;
                  bHWone = SecondHW;
                  bHWtwo = FirstHW;
               }
            
               hallway = new Hallway(HWtype,floor);
               Hallway bossHWone  = new Hallway(bHWone,floor);
               Hallway bossHWtwo  = new Hallway(bHWtwo,floor);
            
               //Items for boss applied
               Random rand = new Random();
               int  n = rand.nextInt(2);
               
               if(n==0)
               {
                  boss.setWeaponBoss(bossHWone.getBossWeaponCertainRoom());
                  boss.setArmorBoss(bossHWone.getBossArmorCertainRoom());
               }
               else if(n==1)
               {
                  boss.setWeaponBoss(bossHWtwo.getBossWeaponCertainRoom());
                  boss.setArmorBoss(bossHWtwo.getBossArmorCertainRoom());
               }
               //
               
               hallway.getHallwayDescription();
               
               menu.pressEnterContinue();
               
               //Room
               boolean flag =true;
               int roomNum  =1;
               Item[] tempItemList; 
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
                     boolean flagy = true;
                     if(hallway.hasItemCertainRoom(roomNum))
                     {
                         //hallway.whatsInACertainRoom(roomNum);
                         do{
                            tempItemList = hallway.getItemListCertainRoom(roomNum);
                            int index=menu.collectItemsText(tempItemList);
                            
                            if(index+1==tempItemList.length+1)
                            {
                              //no items picked up
                              flagy = false;
                            }
                            else if(index==-1)
                            {
                              flagy = false;
                            }
                            else
                            {
                              player.giveItem(hallway.getItemCertainRoom(roomNum,index)); // GETTING ITEMS
                            }
                         }while(flagy);
                     }
                  }
                  
                  if(CombatOutcome==1)
                  {
                     //Victory
                     boolean flagyy = true;
                     if(hallway.hasItemCertainRoom(roomNum))
                     {
                         //hallway.whatsInACertainRoom(roomNum);
                         do{
                            tempItemList = hallway.getItemListCertainRoom(roomNum);
                            int index=menu.collectItemsText(tempItemList);
                            
                            if(index+1==tempItemList.length+1)
                            {
                              //no items picked up
                              flagyy = false;
                            }
                            else if(index==-1)
                            {
                              flagyy = false;
                            }
                            else
                            {
                              player.giveItem(hallway.getItemCertainRoom(roomNum,index)); // GETTING ITEMS
                            }
                         }while(flagyy);
                     }
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
            
            }while(floor<3);
            floor++;
            
            //Boss Fight
            if(floor==4)
            {
               //Boss FIght
               //System.out.println("********Boss Fight");
               int CombatOutcome = -1;
               menu.bossText();
               
               CombatArena.addCombatant(player);
               CombatArena.addCombatant(boss);
                CombatOutcome = CombatArena.combatSteps();
                
               if(CombatOutcome==1)
               {
                  //Victory
                  menu.winText();
               }
               else if(CombatOutcome==2)
               {
                  //Died
                  menu.diedText();
               }
               else if(CombatOutcome==3)
               {
                  //Flee
                  menu.fleeDiedText();
                  menu.diedText();
               }
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
}