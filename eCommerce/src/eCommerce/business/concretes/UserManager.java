package eCommerce.business.concretes;

import eCommerce.business.abstracts.UserService;
import eCommerce.core.abstracts.CheckService;
import eCommerce.core.abstracts.RegistrationService;
import eCommerce.core.concretes.CheckManager;
import eCommerce.core.concretes.GoogleRegisterManagerAdapter;
import eCommerce.dataAccess.abstracts.UserDao;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private CheckService checkService;
	private RegistrationService registrationService;
	private UserDao userDao;

	public UserManager(CheckService checkService, UserDao userDao) {
		super();
		this.checkService = checkService;
		this.userDao = userDao;
	}

	public UserManager(CheckService checkService, UserDao userDao, RegistrationService registrationService) {
		super();
		this.checkService = checkService;
		this.userDao = userDao;
	}

	public UserManager(CheckManager checkManager, HibernateUserDao hibernateUserDao,
			GoogleRegisterManagerAdapter googleRegisterManagerAdapter) {

	}

	@Override
	public void signUp(User user) {
		if (checkService.checkFirstName(user.getFirstName()) & checkService.checkLastName(user.getLastName())

				& checkService.checkEmail(user.getEmail())

				& checkService.checkPassword(user.getPassword())) {
			userDao.add(user);

			System.out.println(user.getFirstName() + " Your membership has been completed.");
			System.out.println("A confirm email has been sent. " + user.getEmail());

		}

	}

	@Override
	public void signUpWithGoogle(User user) {
		System.out.println("Your membership has been comleted with your Email address " + user.getEmail());

	}

	@Override
	public void signIn(String email, String password) {
		for (int i = 0; i < userDao.getAll().size(); i++) {
			if (userDao.getAll().get(i).getEmail().equals(email)
					&& userDao.getAll().get(i).getPassword().equals(password)) {

				System.out.println("Successful login");
			return;
			}
		}

		System.out.println("E-mail or password is incorrect");

	}
}
