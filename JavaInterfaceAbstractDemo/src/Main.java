
import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "Sefa", "Ergin", LocalDate.of(1999, 11, 03), "11111111111" );
		customerManager.save(customer);
	}

}

//TC Kimlik numaras� ve t�m bilgiler do�ru yaz�l�rsa veritaban�na kay�t ediliyor. 