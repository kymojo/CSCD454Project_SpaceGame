public abstract class Item 
{
   protected String name;
   protected String description;
   protected String message;
   
   public String getName()
   {
		return this.name;
   }
   
   public String getMessage() {
      return this.message;
   }
   
   public String getDescription() {
		return this.description;
   }
}