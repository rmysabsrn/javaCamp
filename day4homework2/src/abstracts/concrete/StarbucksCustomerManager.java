package abstracts.concrete;

import abstracts.abstracts.BaseCustomerManager;
import abstracts.abstracts.CustomerCheckServices;
import abstracts.abstracts.CustomerService;
import entities.Customer;

public abstract class StarbucksCustomerManager extends BaseCustomerManager {
    
	
	 CustomerCheckServices customerCheckServices;
    public StarbucksCustomerManager(CustomerCheckServices customerCheckServices) {
    
    	super();
    this.customerCheckServices = customerCheckServices;
		
	}
	
	
	@Override
	public void save(Customer customer) {
	
		if (customerCheckServices.CheckIfRealPerson(customer)) {
		super.save(customer);	
		
		}else {
			System.out.println("Kullanýcý bulunamadý");
		}
		
		
		
		
	}
	
}
