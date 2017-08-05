
public class MyRect implements Comparable<MyRect>
{
   private double width, height;
   
   public MyRect(double width, double height)
   {
	   this.setWidth(width); 
	   this.setHeight(height);
   }

   public double getWidth()
   {
	   return this.width;
   }
   
   public double getHeight()
   {
	   return this.height;
   }
   
   public void setWidth(double width)
   {
	   this.width = width;
   }
   
   public void setHeight(double height)
   {
	   this.height = height;
   }
   
   public double getArea()
   {
	   return (this.getWidth() * this.getHeight());
   }
	  
   @Override
   public int compareTo(MyRect mr)
   {
	   if(this.getArea() > (mr.getArea()))
		   return 1;
	   else if (this.getArea() < (mr.getArea()))
		   return -1;
	   else
		   return 0;
   }
	
   @Override
	public String toString()
	{
	     return ("A rectangle with width = "+ width +
			   " and height = "+ height +
			   " Area =  "+ getArea())+"\n";
	}
}



   
	 
	 