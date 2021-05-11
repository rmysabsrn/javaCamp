package day3homework;

public class UserManager {
    public void logIn(User user) {
    	System.out.println(user.getEmail() + " isimli user sisteme giriþ yaptý.");
    }
    public void logOut(User user) {
    	System.out.println(user.getEmail() + " isimli user sistemden çýkýþ yaptý.");
    }
}
