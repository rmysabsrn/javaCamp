package day3homework;

public class InstructorManager {
  public void logIn(Instructor instructor) {
	  System.out.println(instructor.getEmail() + instructor.getPassword() + "Kursa giriþ yaptý");
  }
  public void logOut(Instructor instructor) {
	  System.out.println(instructor.getEmail() + instructor.getPassword() + "Kurstan çýkýþ yaptý");
  
  }
  
  public void addCourse(User user) {
	  System.out.println("Kurs eklendi: " + user.getCourses());
  }
  public void deleteCourse(User user) {
	  System.out.println("Kurs silindi " + user.getCourses());
	  }
  public void addAssignment(User user) {
	  System.out.println(user.getCourses() + "na ödev eklendi");
	  }
}
