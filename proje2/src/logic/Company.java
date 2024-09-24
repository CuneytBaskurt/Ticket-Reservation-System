package logic;

import java.util.ArrayList;

import logic.Vehicle.yakit;

public class Company extends User implements IProfitable{

	
	public ArrayList<Bus> busList = new ArrayList<Bus>();	
	public ArrayList<Train> trainList = new ArrayList<Train>();	
	public ArrayList<Airplane> airplaneList = new ArrayList<Airplane>();	
	public ArrayList<Route> seferList = new ArrayList<Route>();   
	
	
	public Company(String kullaniciAdi, String sifre) {
		super(kullaniciAdi, sifre);
		
		// TODO Auto-generated constructor stub
		
		
		
		
		   
	}
	
	
	
	public void busEkle(yakit yakittipi,int kapasite,int id) {
		
		busList.add(new Bus(yakittipi,kapasite,id));
			
	}
	
	public void trainEkle(yakit yakittipi,int kapasite,int id) {
		
		trainList.add(new Train(id));
			
	}
	
	public void airplaneEkle(yakit yakittipi,int kapasite,int id) {
		
		airplaneList.add(new Airplane(id));
			
	}
	
	

	
	
	
	@Override
	public String toString() {
		
		return kullaniciAdi; 
	}
	@Override
	public boolean girisYap(String kullaniciAdi, String sifre) {
		// TODO Auto-generated method stub
		return super.girisYap(kullaniciAdi, sifre); 
	}
	
    public  Company(Company other) {
    	super(other);
        this.kullaniciAdi = other.kullaniciAdi;
        this.sifre = other.sifre;
    }

    public Company() {

    }
}
