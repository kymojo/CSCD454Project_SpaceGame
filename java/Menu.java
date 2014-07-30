import java.util.*;

public class Menu
{
	Scanner sc = new Scanner(System.in);
	
	//In this method you can test different menus
   public void StartMenu()
   {
	   intro();
	   //mainMenu();
	  
   }
   
   public int mainMenu()
   {
	   int menuSelect = 9999999;
	   
	   do{
	   System.out.println("*** Main Menu ***");
	   System.out.println("1 - Start Game");
	   System.out.println("2 - Quit Game");
	   System.out.print("Selection: ");
	   if(this.sc.hasNextInt())
	   {
		   menuSelect = this.sc.nextInt(); 
	   }
	   else
	   {
		   String clearBuffer = this.sc.next();
	   }
	   System.out.println("");
	   }while(menuSelect!=1 && menuSelect!=2);
	   
	   return menuSelect;
   }
   
   public String heroMenu()
   {
	   String Name = "Nameless";
	   
	   System.out.println("* What is your name? *");
	   System.out.print("Name: ");
	   Name = this.sc.nextLine();
	   
	   System.out.println("");
	   
	   return Name;
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
	   System.out.println("        Escape From That Space Prison!");
	   System.out.println("");
	   System.out.println("");
   }
}