package javaCampH2;

public class Main {

	public static void main(String[] args) {
	
		Course course1= new Course();
		course1.id= 1;
		course1.courseName =  "Yaz�l�m geli�tirici yeti�tirme kamp� : (Java + React)" ;
		course1.teacher= "Engin Demiro�";

		
		Student student= new Student();
		student.id = 1;
		student.firstName = "Rumeysa ";
		student.lastName = "Ba�aran ";
		student.coursName = "Yaz�l�m geli�tirici yeti�tirme kamp� : (Java + React)";

		student.setId(1);
		student.setFirstName(" Rumeysa ");
        student.setLastName("Ba�aran ");
		
		
		
		
		
		CourseManager courseManager = new CourseManager ();
		courseManager.Add(student, course1);
		
	}
	


	
}
