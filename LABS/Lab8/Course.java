import java.util.ArrayList;

public class Course {
	private String courseName;												//data fields
	private ArrayList<String> students = new ArrayList<String>();			//array list
	
	public Course(String courseName) {										
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {							//add Student
		students.add(student);
	}

	public String getCourseName() {										//get Course
		return courseName;
	}

	public ArrayList<String> getStudents() {							//get Students
		return students;
	}

	public int getNumberOfStudents() {									//get number of students
		return students.size();
	}
	
	public void dropStudent(String student) {							//drop student
		students.remove(student);
	}

}


