import java.util.*;

public class RandomHallwayTracker
{
   int[] roomsVisited = new int[9];
   
   public String randomHallway()
   {
      String returnString ="***No More Rooms To Pick From***";
      Random rand = new Random();
      int  n=-1;
      
      boolean flag = true;
      do
      {
         flag = false;
         n = rand.nextInt(9)+1;
         
         for(int i=0;i<roomsVisited.length;i++)
         {
            if(roomsVisited[i]==n)
            {
               flag = true;
            }
         }
      }while(flag);
      
      if(n==1)
      {
    	  returnString ="Armory";
        roomsVisited[n-1]=1;
      }
      else if(n==2)
      {
    	  returnString ="Infirmary";
        roomsVisited[n-1]=2;
      }
      else if(n==3)
      {
    	  returnString ="Cafeteria";
        roomsVisited[n-1]=3;
      }
      else if(n==4)
      {
    	  returnString ="Bathroom";
        roomsVisited[n-1]=4;
      }
      else if(n==5)
      {
    	  returnString ="GuardsQuarters";
        roomsVisited[n-1]=5;
      }
      else if(n==6)
      {
    	 returnString ="HighSecurityCells";
        roomsVisited[n-1]=6;
      }
      else if(n==7)
      {
    	  returnString ="CargoHold";
        roomsVisited[n-1]=7;
      }
      else if(n==8)
      {
    	  returnString ="Bridge";
        roomsVisited[n-1]=8;
      }
      else if(n==9)
      {
    	   returnString ="DockingBay";
         roomsVisited[n-1]=9;
      }
      else if(n==-1)
      {
         //nothing.
      }
      
      return returnString;
   }
}