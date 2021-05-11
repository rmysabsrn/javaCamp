package adapters;

import java.rmi.RemoteException;

import abstracts.abstracts.CustomerCheckServices;
import entities.Customer;
import mernisServiceReferance.KPSPublicSoap;
import mernisServiceReferance.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckServices {

@Override
public boolean CheckIfRealPerson(Customer customer) {
KPSPublicSoapProxy kPSPublicSoapProxy  = new KPSPublicSoapProxy();
boolean result = false;

result = kPSPublicSoapProxy.TCKimlikNoDogrula(customer.getNationalityId(),
		customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth());

return result;
}
}


	
