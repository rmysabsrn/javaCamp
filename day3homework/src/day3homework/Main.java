package day3homework;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setFirstName("Rumeysa");
		student.setLastName("Başaran");
		student.setEmail("rumeysa.basaran@gmail.com");
		student.setPassword("******");
		student.setCourses("Java + React Kampı");
	
		
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setEmail("engindemiroğ@gmail.com");
		instructor.setPassword("*****");
		instructor.setCourses("Java + React Kampı");

		
		UserManager userManager = new UserManager();
		userManager.logIn(student);
       
        
        StudentManager studentManager = new StudentManager();
        studentManager.joinCourse(student);
        
        userManager.logOut(student);
        
        System.out.println("------------");
        
        UserManager userManager2= new UserManager();
        
        userManager2.logIn(instructor);

        
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(instructor);
        instructorManager.addAssignment(instructor);
        
        
        userManager2.logOut(instructor);
	}
	

}
