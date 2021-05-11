package abstracts;

import abstracts.abstracts.BaseCustomerManager;
import abstracts.abstracts.CustomerService;
import abstracts.concrete.NeroCustomerManager;
import abstracts.concrete.StarbucksCustomerManager;
import adapters.MernisServiceAdapter;
import entities.Customer;

public class Main {


	public static void main(String[] args) {
		Customer customer = new Customer ();
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()) {
		};
		customerManager.save(new Customer(1, "Rumeysa","Baþaran","2000","123456"));
	
        System.out.println(customerManager);
	}

}
