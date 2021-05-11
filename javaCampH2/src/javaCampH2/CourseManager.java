package javaCampH2;

public class CourseManager {
   public static void Add(Student student, Course course1) {
	   System.out.println(student.getFirstName() + student.getLastName() + student.getCoursName() + " Kursuna kaydoldu. ");
   }
   public static void Remove() {
	   System.out.println("Öðrenci kurstan çýkarýldý");
	  
}
   public static void Update() {
	   System.out.println("Güncellendi");
}
}