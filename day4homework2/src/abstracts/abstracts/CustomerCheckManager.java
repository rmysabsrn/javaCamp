package abstracts.abstracts;

import entities.Customer;

public class CustomerCheckManager implements CustomerCheckServices {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	
	
	}

}
