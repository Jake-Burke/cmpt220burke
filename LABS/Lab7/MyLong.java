
public class MyLong {
	private long Value;								//long data field

    public MyLong(long value){						//constructor
        Value = value;
    }

    public long getValue(){							//method to get value
        return Value;
    }

    public boolean isEven(){						//method to check isEven
        return (Value % 2)== 0;
    }

    public boolean isOdd() {						//method to check isOdd
        return (Value % 2)== 1;
    }

    public boolean isPrime(){						//method to check isPrime
        if (Value == 1 || Value == 2){
            return true;
        }
        else {
            for (int i = 2; i < Value; i++){
                if (i % Value == 0) return false;
            }
        }
        return true;
    }

    public static boolean isEven(int myLong){		//static method
        return (myLong % 2) == 0;
    }

    public static boolean isOdd(int myLong){		//static
        return (myLong % 2) == 1;
    }

    public static boolean isPrime(int myLong){		//static
        if (myLong == 1 || myLong == 2) {
            return true;
        }
        else {
            for (int i = 2; i < myLong; i++){
                if (i % myLong == 0) return false;
            }
        }
        return true;
    }    

    public static boolean isEven(MyLong myInt){
        return myInt.isEven();
    }

    public static boolean isOdd(MyLong myInt){
        return myInt.isOdd();
    }

    public static boolean isPrime(MyLong myInt){
        return myInt.isPrime();
    }

    public boolean equals(long isLong){					//method to check if equal	
        if (isLong == Value) 
            return true;
        return false;
    }

    public boolean equals(MyLong myLong){			//method to check if equal	
        if (myLong.Value == this.Value) 
            return true;
        return false;
    }

    public static long parseLong(char[] values){			//converts array of numbers to a value						
        int sum = 0;
        for (char i : values){
            sum += Character.getNumericValue(i);
        }
        return sum;
    }

    public static long parseLong(String value){			//parses the long to a string value
        return Long.parseLong(value);
    }
}
