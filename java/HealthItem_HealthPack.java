public class HealthItem_HealthPack extends HealthItem
{

   public HealthItem_HealthPack(int level)//add amount integer
   {
      this.name = "Health Pack";
      this.message = " uses an health pack!";
      this.healthRes = 25 + ((level / 2) + 1);
      this.uses = -1;
      this.useTime = 10;
   }
}