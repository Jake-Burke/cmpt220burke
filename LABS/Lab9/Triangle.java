
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
       public Triangle(double side1, double side2, double side3) 			//exception that throws if it violates the rule
    			throws IllegalTriangleException {
    			if ( side1 + side3 <= side2 || side1 + side2 <= side3 || side2 + side3 <= side1) 
    				throw new IllegalTriangleException(side1, side2, side3);
    			this.side1 = side1;
    			this.side2 = side2;
    			this.side3 = side3;
    		}
      
       public double getSide1() {										//gets side1
   			return side1;
   	}


   		public double getSide2() {										//gets side2
   			return side2;
   		}


   		public double getSide3() {										//gets side3
   			return side3;
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
