package kodlamaIO;

public class Instructor extends User {
	private String[] courses;
	
	public Instructor() {
		
	}
	
	public Instructor(String[] courses) {
		super();
		this.courses = courses;
	}
	
	public String[] getCourses() {
		return this.courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	
}
