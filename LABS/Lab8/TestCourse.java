import java.util.ArrayList;

public class TestCourse {
	public static void main(String[] args) {
		Course c1 = new Course("Software Development");					//new course
		
		c1.addStudent("John");											//adding students
		c1.addStudent("Mary");
		c1.addStudent("Paul");
		
		ArrayList<String> students = c1.getStudents();					//display students
		for (String student : students)
			System.out.println(student);
		
		System.out.println();
		
		c1.dropStudent("Paul");											//drop student and display
		students = c1.getStudents();
		for (String student : students)
			System.out.println(student);

	}

}

