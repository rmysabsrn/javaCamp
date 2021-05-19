package eCommerce.core.concretes;

import eCommerce.GoogleRegisterManager;
import eCommerce.core.abstracts.RegistrationService;

public class GoogleRegisterManagerAdapter implements RegistrationService{

	GoogleRegisterManager googleRegisterManager = new GoogleRegisterManager();
 
	@Override
	public void registerToSystem() {
		googleRegisterManager.register();
		
	}
	
}
