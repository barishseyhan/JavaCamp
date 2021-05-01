package kodlamaIO;

public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Student added! : " + user.getName() + " " + user.getLastName());
	}
	
	@Override
	public void remove(User user) {
		System.out.println("Studen deleted! : " + user.getName() + " " + user.getLastName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Student updated! : " + user.getName() + " " + user.getLastName());
	}
	
	public void courseAdd(Student student) {
		System.out.println("Course added! : " + student.getName() + " " + student.getLastName() + ", " + student.getCourseName() + " kursuna kayıt oldu.");
	}
}
