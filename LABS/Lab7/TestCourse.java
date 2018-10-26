
public class TestCourse {
	public static void main(String[] args) {
		Course course1 = new Course("Software Development I");							//creates 2 courses
		Course course2 = new Course("Introduction to Programming");
		
		course1.addStudent("Peter Jones");												//adding the students
		course1.addStudent("Brian Smith");
		course1.addStudent("Anne Kennedy");
		
		course1.dropStudent("Anne Kennedy");											//drops a student
		
		course2.addStudent("Peter Jones");		
		course2.addStudent("Steve Smith");
		

		System.out.println("Number of students in " + course1.getCourseName() + " "		//printing the students and what class
				+ course1.getNumberOfStudents());
		String[] students = course1.getStudents();
		for (int i = 0; i < course1.getNumberOfStudents(); i++)
			System.out.print(students[i] + ", ");
		
		System.out.println();
		System.out.print("Number of students in " + course2.getCourseName() + " "
				+ course2.getNumberOfStudents());
		
		
	}

}


