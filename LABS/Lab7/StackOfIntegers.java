
public class StackOfIntegers {
	private int[] elements;									//setting up variables
	private int size;
	
	public StackOfIntegers() {								//creating a method with an array of 10
		elements = new int[10]; 
	}
	
	public StackOfIntegers(int size) {			
		elements = new int[size];
	}
	
	public boolean empty() {			
		return size == 0;
	}
	
	public int peek() {							//method to peek
		if (!empty())
			return elements[size - 1];
		return -1;
	}
	
	public void push(int value) {				//method to push
		if (size != elements.length) {
			elements[size] = value;
			size++;
		}
	}
	
	public int pop() {							//method to pop
		if (!empty()) {
			size--;
			return elements[size];
		}
		return -1;
	}
	
	public int getSize() {					//method to get the size
		return size;
	}
}

