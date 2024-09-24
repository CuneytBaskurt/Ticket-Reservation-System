package logic;

public class Admin extends User {

	public Admin(String kullaniciAdi, String sifre) {
		super(kullaniciAdi, sifre);
		
	}
	
	public int hizmetBedeli = 1000; 
	 
    @Override
    public boolean girisYap(String kullaniciAdi, String sifre) {
        return super.girisYap(kullaniciAdi, sifre); 
    }
 
}
