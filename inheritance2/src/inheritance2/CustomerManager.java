package inheritance2;

public class CustomerManager {
	public void add(Logger logger) {
		//m��teri ekleme kodlar�
		System.out.println("M��teri eklendi.");
		
		//Somut s�n�ftan gidilmez. Soyut s�n�ftan hangi s�n�f�n geli�ine g�re i�lem yap�l�r
		//DatabaseLogger logger = new DatabaseLogger();
		logger.log();
	}
}
