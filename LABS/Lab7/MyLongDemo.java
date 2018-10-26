
public class MyLongDemo {
	   public static void main(String[] args) {
	        MyLong long1 = new MyLong(12);													//setting up nunbers to be tested
	        MyLong long2 = new MyLong(23);
	        MyLong long3 = new MyLong(100);
	        MyLong long4 = new MyLong(99);

	        System.out.printf("%d is prime: %s%n", long1.getValue(), long1.isPrime());
	        System.out.printf("%d is prime: %s%n", long2.getValue(), long2.isPrime());		//testing if is prime
	        System.out.printf("%d is prime: %s%n", long3.getValue(), long3.isPrime());

	        System.out.printf("%d is even: %s%n", long1.getValue(), long1.isEven());
	        System.out.printf("%d is even: %s%n", long2.getValue(),long2.isEven());			//tests if it is even
	        System.out.printf("%d is even: %s%n", long3.getValue(), long3.isEven());

	        System.out.printf("33 is odd: %s%n", MyLong.isOdd(33));							//tests if it is odd
	        
	        System.out.printf("%d equals %d? %s%n", long1.getValue(), long4.getValue(), long1.equals(long4));	//adds up values to compare to 99
	        System.out.printf("%d%n", MyLong.parseLong(new char[] {'1', '2', '9'}));
	        
	        System.out.printf("%d%n", MyLong.parseLong("566"));					
	    }
	}

