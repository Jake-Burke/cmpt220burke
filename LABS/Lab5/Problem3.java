import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students=input.nextInt();
		int[]grades=new int[students];								//array that asks for amount of students
		String[]names=new String[students];
		
		for(int i=0;i<students;i++) {								//loops to get names and grades
			System.out.print("Enter the students name: ");
			String name=input.next();
			
			System.out.print("Enter the students grade: ");
			int grade=input.nextInt();
			
			names[i]=name;
			grades[i]=grade;
			
		}
		
		for (int i = grades.length - 1; i > 0; i--) {				//sorts from least to greatest
			int max = grades[0];									//sets the max and index to 0
			int index = 0;
			
			for (int j = 1; j <= i; j++) {							//finds the largest and decreases by 1
				if (max < grades[j]) {
					max = grades[j];
					index = j;
				}
			}
			grades[index] = grades[i];								//runs each time puts the next largest number 
			grades[i] = max;
			String loopName = names[index];
			names[index] = names[i];
			names[i] = loopName;
		}
		for(int i=0; i<grades.length; i++)							//prints the sorted array
			System.out.println(names[i] + " : " + grades[i]);
	}
	public static int[] switchGrade(int[] array) {					//method that switches the grade
		int[] grade = new int[array.length];
		for (int i = 0, j = grade.length - 1; i < array.length; i++, j--) {
			grade[j] = array[i];
		}
		return grade;
	}
	public static String[] switchName(String[] array) {				//method that switches the name
		String[] name = new String[array.length];
		for (int i = 0, j = name.length - 1; i < array.length; i++, j--) {
			name[j] = array[i];	
		}
		return name;
	}
}
