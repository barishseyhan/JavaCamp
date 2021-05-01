package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//müþteri ekleme kodlarý
		System.out.println("Müþteri eklendi.");
		
		//Somut sýnýftan gidilmez. Soyut sýnýftan hangi sýnýfýn geliþine göre iþlem yapýlýr
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
