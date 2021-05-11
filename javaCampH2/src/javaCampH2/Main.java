package javaCampH2;

public class Main {

	public static void main(String[] args) {
	
		Course course1= new Course();
		course1.id= 1;
		course1.courseName =  "Yazılım geliştirici yetiştirme kampı : (Java + React)" ;
		course1.teacher= "Engin Demiroğ";

		
		Student student= new Student();
		student.id = 1;
		student.firstName = "Rumeysa ";
		student.lastName = "Başaran ";
		student.coursName = "Yazılım geliştirici yetiştirme kampı : (Java + React)";

		student.setId(1);
		student.setFirstName(" Rumeysa ");
        student.setLastName("Başaran ");
		
		
		
		
		
		CourseManager courseManager = new CourseManager ();
		courseManager.Add(student, course1);
		
	}
	


	
}
