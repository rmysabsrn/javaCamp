package eCommerce;

import eCommerce.business.concretes.UserManager;
import eCommerce.core.concretes.CheckManager;
import eCommerce.core.concretes.GoogleRegisterManagerAdapter;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Rumeysa", "Baþaran", "rumeysa.basaran@gmail.com", "12346789");
		User user2 = new User(2, "Buse", "Koçak", "busenurkocak@gmail.com", "456486");

		UserManager userManager = new UserManager(new CheckManager(), new HibernateUserDao());
		userManager.signUp(user1);
		System.out.println("****");
		userManager.signUp(user2);
		System.out.println("****");

		UserManager userManager1 = new UserManager(new CheckManager(), new HibernateUserDao(),
				GoogleRegisterManagerAdapter());

		userManager.signIn("rumeysa.basaran@gmail.com", "123456789");
		userManager.signUpWithGoogle(user1);
		System.out.println("****");

		userManager.signIn("busenurkocak@gmail.com", "1234567");
		userManager.signUpWithGoogle(user2);
		
	}

	private static GoogleRegisterManagerAdapter GoogleRegisterManagerAdapter() {
		return null;
	}
}
