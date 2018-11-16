
public class TestAppliance {
	public static void main(String args[]) {
		Appliance Array[] = {
		 new Appliance(5,"Grey", "New York", 100),
		 new Appliance(7,"Black", "California", 102),
		 new Appliance(10,"Red", "Virginia", 104)};
				
		 for (int index=0; index<Array.length; index++) {
			 Array[index].print();
			 System.out.println(Array[index]);
			 }
		 
		
		    
	}
}
	
