public class HealthItem_Apple extends HealthItem
{
   
   public HealthItem_Apple(int level)
   {
      this.name = "Apple";
      this.description = "An Item that will heal you some.";
      this.message = " eats an apple!";
      this.healthRes = 2;
      this.uses = 1;
      this.useTime = 1;
   }
}