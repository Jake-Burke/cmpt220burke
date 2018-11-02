
    public class Triangle extends GeometricObject {
       double side1 = 1.0;												//3 double data fields set to 1.0
       double side2 = 1.0;
       double side3 = 1.0;
  
       public Triangle() {												//no arg constructor
          super();
           side1 = 0.0;
           side2 = 0.0;
           side3 = 0.0;
       }

      public Triangle(double a, double b, double c, String color, boolean filled) {	//constructor that creates triangle with specified sides
           super(color, filled);
           side1 = a;
           side2 = b;
           side3 = c;
       }
  
       public double getArea(){												//calculates area of triangle
           double sides =(side1+side2+side3)/2;
            double area =sides*(sides-side1)*(sides-side2)*(sides-side3);
            return area;
       }
       
       public double getPerimeter(){										//calculates perimeter
           return (side1 + side2 + side3);
       }
  
     
       public String toString(){        									//method to return string
           return "Triangle: side1 = " + side1 + " side2 = " + side2 +" side3 = " + side3 +" "+super.toString();
       }
   }
