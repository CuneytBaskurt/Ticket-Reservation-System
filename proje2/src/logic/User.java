package logic;

public abstract class User implements ILoginable{
	
    public String kullaniciAdi;
    public String sifre;

    // Constructor
    public User(String kullaniciAdi, String sifre) {
        this.kullaniciAdi = kullaniciAdi;
        this.sifre = sifre;
    }
    public User(Company other) {
    	
        this.kullaniciAdi = other.kullaniciAdi;
        this.sifre = other.sifre;
    }
    public User() {

    }
    
    public boolean girisYap(String kullaniciAdi, String sifre) {
 
        if (this.getKullaniciAdi().equals(kullaniciAdi) && this.sifre.equals(sifre)) {
            return true; 
        } else {
            return false;
        }

    }

	public String getKullaniciAdi() {
		return kullaniciAdi; 
	}


    
}