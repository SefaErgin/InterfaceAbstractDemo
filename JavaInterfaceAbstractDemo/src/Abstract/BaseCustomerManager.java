package Abstract;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veritaban?na Kay?t Edildi:  " + customer.getFirstName());
		
	}

}
