package eCommerce.core.abstracts;

public interface CheckService {
  boolean checkFirstName(String firstName);
  boolean checkLastName(String lastName);
  boolean checkEmail(String email);
  boolean checkPassword(String password);
}
