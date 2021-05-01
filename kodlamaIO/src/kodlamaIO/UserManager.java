package kodlamaIO;

public class UserManager {
	public void add(User user) {
		System.out.println("User added! : " + user.getName() + " " + user.getLastName());
	}
	
	public void remove(User user) {
		System.out.println("User deleted! : " + user.getName() + " " + user.getLastName());
	}
	
	public void update(User user) {
		System.out.println("User updated! : " + user.getName() + " " + user.getLastName());
	}
}
