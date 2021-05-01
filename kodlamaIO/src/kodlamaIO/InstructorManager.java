package kodlamaIO;

public class InstructorManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Instructor added! : " + user.getName() + " " + user.getLastName());
	}
	
	@Override
	public void remove(User user) {
		System.out.println("Instructor deleted! : " + user.getName() + " " + user.getLastName());
	}
	
	@Override
	public void update(User user) {
		System.out.println("Instructor updated! : " + user.getName() + " " + user.getLastName());
	}
	
	public void courseList(String[] courses) {
		for(String course : courses) {
			System.out.println(course);
		}
	}
	
}
