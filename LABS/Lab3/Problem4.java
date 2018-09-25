
public class Problem4 {
	public static void main(String[]args) {		
		int n=15000;													//setting n to 15000
        while(prime(n) == false){										//Calls the prime method, when n==false n--
            n--;
        }            
        System.out.println("The largest prime number before n is: "+n); //printing the output
	}
	
	public static boolean prime(int m){									//method that figures out prime numbers
        int n=m;
        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }

        }   
        return true;
}
}