package eCommerce.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	private List<User> userList = new ArrayList<User>();
	
	public HibernateUserDao(List<User> userList) {
		super();
	
	}


	public HibernateUserDao() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void add(User user) {
		userList.add(user);
		System.out.println("Kullanýcý eklendi : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userList;
	}

	

}
