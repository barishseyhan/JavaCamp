package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer baris = new IndividualCustomer();
		baris.customerNumber = "12345";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();
		//customerManager.add(baris);
		//customerManager.add(hepsiBurada);
		//customerManager.add(abc);
		Customer[] customers = {baris, abc, hepsiBurada};
		customerManager.addMultiple(customers);
	}

}
