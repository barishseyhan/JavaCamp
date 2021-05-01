package kodlamaIO;

public class Student extends User {
	private String studentNumber;
	private String courseName;
	
	public Student(String studentNumber, String courseName) {
		super();
		this.studentNumber = studentNumber;
		this.courseName = courseName;
	}

	public Student() {
		
	}
	
	public String getStudentNumber() {
		return this.studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
}
