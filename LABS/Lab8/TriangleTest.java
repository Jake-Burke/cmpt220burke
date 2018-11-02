
public class TriangleTest {
	 public static void main(String[] args) {
 
         Triangle test = new Triangle(1,1,1,"Red", true);
               
         System.out.println("The Area of Triangle " +test.getArea());			//Display Area         
         System.out.println("The Perimeter of Triangle " +test.getPerimeter());	//Display Perimeter    
         System.out.println("The color of the Triangle is " +test.getColor());	//Display Color
         System.out.println("Is the triangle filled in? " +test.isFilled());		//Display if filled
     }
}
