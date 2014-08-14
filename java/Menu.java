import java.util.*;

public class Menu
{
	Scanner sc = new Scanner(System.in);
   String clearBuffer;
	
	//In this method you can test different menus
   public void testMenu()
   {
	   intro();
	   mainMenu();
	   heroMenu();
	   startGameIntro();
   }
   
   public void bossText()
   {
      System.out.println("  As you walk up the stairs to the 4th floor that has all the escape pods");
      System.out.println("you see a massive prisoner with blood soaked cloths, you reconize him from");
      System.out.println("the cell next to yours you two never got alone and how its time to see who");
      System.out.println("is the strongest!!! ITS ON!!!\n");
      
   }
   
   public void winText()
   {
      System.out.println(" You killed the most deadly prisoner! you find 1 last escape pod you run to");
      System.out.println("get inside and then you take off. Your future looks bright and your options");
      System.out.println("are endless! Good Job, for you learned how to ESCAPE FROM SPACE PRISON.");
   }
   
   public void fleeDiedText()
   {
      System.out.println("  You turn on your heels and make a run for the escape pods before the massive");
      System.out.println("prisoner gets to it, right when you get inside and about to close the door a");
      System.out.println("frag granade lands inside the pod and the door shuts and you got shot into space");
      System.out.println("As look at the granade you feel like you should have tried and kill him first...");
   }
   
   public int mainMenu()
   {
	   int menuSelect = 9999999;
      
	   do{
	   System.out.println("*** Main Menu ***");
	   System.out.println("1 - Start Game");
	   System.out.println("2 - Credits");
	   System.out.println("3 - Quit Game");
	   System.out.print("Selection: ");
	   if(this.sc.hasNextInt())
	   {
		   menuSelect = this.sc.nextInt(); 
	   }
	   else
	   {
		   clearBuffer = this.sc.nextLine();
	   }
	   System.out.println(".");
	   }while(menuSelect!=1 && menuSelect!=2 && menuSelect!=3);
	   clearBuffer = this.sc.nextLine();
      
	   return menuSelect;
   }
   
   public void diedText()
   {
      System.out.println("****************");
      System.out.println("**You Have Died*");
      System.out.println("****************");
      System.out.println("*As you gasp for your last breath, you wonder can any one ESCAPE FROM SPACE PRISON?!?!");
   }
   
   public int collectItemsText(Item[] items)
   {
       int index;
       System.out.println("*Do you want to get any items?");
                         
       for(int i=0;i<items.length;i++)
       {
         System.out.println((i+1)+": "+items[i].getName());
       }
       System.out.println(items.length+1+": Quit");
       
         int menuSelect = 9999999;
         boolean flagx = true;
   	   do{
   	   System.out.println("Pick 1-"+(items.length+1));
   	   System.out.print("Selection: ");
   	   if(this.sc.hasNextInt())
   	   {
   		   menuSelect = this.sc.nextInt(); 
   	   }
   	   else
   	   {
   		   clearBuffer = this.sc.nextLine();
   	   }
         
   	   System.out.println(".");
         
         for(int j=0;j<items.length;j++)
         {
            if(j+1==menuSelect)
            {
               flagx=false;
            }
            else if(j+2==menuSelect)
            {
               flagx=false;
               System.out.println("--Back to Rooms--");
            }
         }
         
   	   }while(flagx);
   	   clearBuffer = this.sc.nextLine();
         
   	   return menuSelect-1;
   }
   
   public int pickHallway()
   {
	   int menuSelect = 9999999;
      
	   do{
	   System.out.println("Pick 1, 2 or 3 . . .");
	   System.out.print("Selection: ");
	   if(this.sc.hasNextInt())
	   {
		   menuSelect = this.sc.nextInt(); 
	   }
	   else
	   {
		   clearBuffer = this.sc.nextLine();
	   }
	   System.out.println(".");
	   }while(menuSelect!=1 && menuSelect!=2 && menuSelect!=3);
	   clearBuffer = this.sc.nextLine();
      
	   return menuSelect;
   }
   
   public void pressEnterContinue()
   {
      System.out.println("Press Enter To Continue . . .");
      clearBuffer = this.sc.nextLine();
      
   }
   
   public void hallwayChoice(int floor,String FirstHW,String SecondHW,String ThirdHW)
   {
      System.out.println("*Floor: "+floor);
      System.out.println(" You find your self looking at 3 hallways you can take:");
      System.out.println("-> 1:"+FirstHW);
      System.out.println("-> 2:"+SecondHW);
      System.out.println("-> 3:"+ThirdHW);
   }
   
   public String heroMenu()
   {
	   String Name = "Nameless";
	   
	   System.out.println("* What is your name? *");
	   System.out.print("Name: ");
	   Name = this.sc.nextLine();
	   
	   System.out.println(".");
	   
	   return Name;
   }
   
   public void credits()
   {
      System.out.println("***CREDITS***");
   }
   public void startGameIntro()
   {
	   System.out.println("   _____________________________________________");
	   System.out.println("   /|                                             |\\");
	   System.out.println("  / |             ===================             | \\");
	   System.out.println(" /  |             | | | | | | | | | |             |  \\");
	   System.out.println("|   |             | | | | | | | | |<|             |   |");
	   System.out.println("|   |         ()  | | | | | | | | | |  ()         |   |");
	   System.out.println("|   |         ::  | | | | | | | | | |  ::         |   |");
	   System.out.println("|   |         ::  | | | | | | | | | |  ::         |   |");
	   System.out.println("|   |        [~~] | | | | | | | | | | [~~]        |   |");
	   System.out.println("|   |         --  | | | | | | | | | |  --         |   |");
	   System.out.println("|   |             ++++++++++++++++++|             |   |");
	   System.out.println("|   |             |{}  Cell AC34   <|             |   |");
	   System.out.println("|   |             ++++++++++++++++++|             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | | |             |   |");
	   System.out.println("|   |             | | | | | | | | |<|             |   |");
	   System.out.println("|   |_____________|_|_|_|_|_|_|_|_|_|_____________|   |");
	   System.out.println("|  /                                               \\  |");
	   System.out.println("| /                                                 \\ |");
	   System.out.println("|/                                                lc \\|");
	   System.out.println(".");
	   System.out.println(".");
	   System.out.print("   You have been in cell AC34 for 20 years. Days seem like months and months seem like years, it all blends together\nas you try to");
	   System.out.print("get a grasp on what is real and what is in infront of your eyes. As you sit there, like so many\nyears, in your cell you hear an");
	   System.out.print("EXPLOSION followed by cries of help. You just get to your feet and find that the explosion has\nblown");
	   System.out.print(" a hole right out of your cell, as you peek outside for the first time you see pure chaos. Prisoners running\n around killing, guards");
	   System.out.print(" fending off prisoners and you know that this is your chance, your chance to ESCAPE FROM SPACE PRISON.\nYou know on the 3rd");
	   System.out.print(" floor there are escape pods for the guards to leave if this such an event happened.\nIf you make it in time I bet you can get one");
	   System.out.print(" but along the way you might need to fight off some prisoners. GET MOVING!!!\n.\n.\n");
   }
   
   public void intro()
   {
	   
	   System.out.println("               *     .--.             +");
	   System.out.println("                    / /  `");
	   System.out.println("    +              | |           *");
	   System.out.println("          '         \\ \\__,");
	   System.out.println("      *          +   '--'  *");
	   System.out.println("               +   /\\ ");
	   System.out.println("  +              .'  '.               *");
	   System.out.println("         *      /======\\   +");
	   System.out.println("               ;:.  _   ;");
	   System.out.println("               |:. (_)  |        *");
	   System.out.println("               |:.  _   |");
	   System.out.println("     +         |:. (_)  |          *");
	   System.out.println("               ;:.      ;");
	   System.out.println("             .' \\:.    / `.");
	   System.out.println("            / .-'':._.'`-. \\");
	   System.out.println("            |/    /||\\    \\|");
	   System.out.println("  *               ''''           *   ");
	   System.out.println("        +         ''''     +");
	   System.out.println("");
	   System.out.println("");
	   System.out.println(" _____                          ______                     _____                       ______     _                 ");
	   System.out.println(" |  ___|                         |  ___|                   /  ___|                      | ___ \\   (_)          ");
	   System.out.println(" | |__ ___  ___ __ _ _ __   ___  | |_ _ __ ___  _ __ ___   \\ `--. _ __   __ _  ___ ___  | |_/ / __ _ ___  ___  _ __ ");
	   System.out.println(" |  __/ __|/ __/ _` | '_ \\ / _ \\ |  _| '__/ _ \\| '_ ` _ \\   `--. \\ '_ \\ / _` |/ __/ _ \\ |  __/ '__| / __|/ _ \\| '_ \\ ");
	   System.out.println(" | |__\\__ \\ (_| (_| | |_) |  __/ | | | | | (_) | | | | | | /\\__/ / |_) | (_| | (_|  __/ | |  | |  | \\__ \\ (_) | | | |");
	   System.out.println(" \\____/___/\\___\\__,_| .__/ \\___| \\_| |_|  \\___/|_| |_| |_| \\____/| .__/ \\__,_|\\___\\___| \\_|  |_|  |_|___/\\___/|_| |_|");
	   System.out.println("");
	   System.out.println("");
   }
}