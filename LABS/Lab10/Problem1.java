
public class Problem1 {
	
	public abstract class Super {
	    public void run() {
	        printMessage();
	    }
	    abstract void printMessage ();
	}

	public class Sub1 extends Super {
	    @Override
	    void printMessage() {
	        System.out.println("This is the first subclass");
	    }
	}

	public class Sub2 extends Super {
	    @Override
	    void printMessage () {
	        System.out.println("This is the second subclass");
	    }
	}
		

}


