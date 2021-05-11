package day3homework;

public class StudentManager {
  public void joinCourse(Student student) {
	  System.out.println(student.getFirstName() + student.getLastName() + " isimli öğrenci kayıt oldu" ); 
  } 
  
  public void deleteCourse(Student student) {
	  System.out.println(student.getFirstName() + student.getLastName() + " isimli kullanıcının kaydı silidi");
  }
}
