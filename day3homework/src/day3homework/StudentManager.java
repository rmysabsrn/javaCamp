package day3homework;

public class StudentManager {
  public void joinCourse(Student student) {
	  System.out.println(student.getFirstName() + student.getLastName() + " isimli ��renci kay�t oldu" ); 
  } 
  
  public void deleteCourse(Student student) {
	  System.out.println(student.getFirstName() + student.getLastName() + " isimli kullan�c�n�n kayd� silidi");
  }
}
