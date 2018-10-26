import java.util.Arrays;

public class Course {
	private String courseName;
	private String[] students = new String[30];										//setting up variables
	private int numberOfStudents;
	private String[] increaseArray = Arrays.copyOf(students, students.length+5);	//array that increases
	
	public Course(String courseName) {						
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {							//method that adds studnets and add 5 more once reaches 5
		if(getNumberOfStudents()>=5)
        {
             for (int i = 0; i < students.length; i++)
             {
                  increaseArray[i] = students[i];
             }
              students = increaseArray;
        }
         
        students[numberOfStudents] = student;
        numberOfStudents++;
      }
	

	public String getCourseName() {								//method to get the course name
		return courseName;
	}

	public String[] getStudents() {								//method to get the students
		return students;
	}

	public int getNumberOfStudents() {							//method to get the number of students
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {					//method to drop a student
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
	public void Clear() {									//clears the students from a course
		while(numberOfStudents !=0){
			numberOfStudents --;
		}
	}

}

