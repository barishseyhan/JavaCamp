package kodlamaIO;

public class Main {

	public static void main(String[] args) {
		String[] courses = {"C#", "Java"};
		
		User user1 = new User();
		user1.setId(1);
		user1.setName("Barış");
		user1.setLastName("Seyhan");
		user1.setPassword("12345");
		user1.setAddress("Bursa");
		
		UserManager userManager = new UserManager();
		userManager.add(user1);
		userManager.remove(user1);
		userManager.update(user1);
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("Barış");
		student1.setLastName("Seyhan");
		student1.setStudentNumber("999");
		student1.setCourseName("Java");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.courseAdd(student1);
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setCourses(courses);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.courseList(courses);
		
		
		
	}

}
