package main;

import java.awt.EventQueue;
import java.util.ArrayList;

import logic.*;
import logic.Route.MyEnum;
import logic.Route.Tarih;
import logic.Vehicle.yakit;
import ui.*;

public class Presenter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Admin admin1 = new  Admin("admin","admin"); 
		Company a = new Company("A", "Asifre"); 
		Company b = new Company("B", "Bsifre"); 
		Company c = new Company("C", "Csifre");
		Company d = new Company("D", "Dsifre");
		Company e = new Company("E", "Esifre");
		Company f = new Company("F", "Fsifre"); 
		
		
		ArrayList<Company> companyList = new ArrayList<Company>();  
		
		companyList.add(a);
		companyList.add(b);
		companyList.add(c); 
		companyList.add(d);
		companyList.add(e);
		companyList.add(f);
		a.busEkle(yakit.BENZIN, 20, 1);
		a.busEkle(yakit.BENZIN, 15, 2);
		a.busEkle(yakit.BENZIN, 15, 15);
		b.busEkle(yakit.BENZIN, 15, 3);
		b.busEkle(yakit.BENZIN, 20, 4);
		c.busEkle(yakit.BENZIN, 20, 1);
		c.airplaneEkle(yakit.GAZ, 30, 5);
		c.airplaneEkle(yakit.GAZ, 30, 6);
		d.trainEkle(yakit.ELEKTRIK, 25, 7);
		d.trainEkle(yakit.ELEKTRIK, 25, 8); 
		d.trainEkle(yakit.ELEKTRIK, 25, 9);
		f.airplaneEkle(yakit.GAZ, 30, 10);
		f.airplaneEkle(yakit.GAZ, 30, 11);
		a.seferList.add(new Route(MyEnum.Karayolu1,a.busList.get(0),Tarih.DORT_ARALIK)); 
		a.busList.get(0).using=true;
		
		a.seferList.add(new Route(MyEnum.Karayolu1,a.busList.get(1),Tarih.DORT_ARALIK));
		a.busList.get(1).using=true;
		
		b.seferList.add(new Route(MyEnum.Karayolu1,b.busList.get(0),Tarih.DORT_ARALIK));
		b.busList.get(1).using=true;
		
		b.seferList.add(new Route(MyEnum.Karayolu2,b.busList.get(1),Tarih.DORT_ARALIK));
		b.busList.get(1).using=true;
		
		c.seferList.add(new Route(MyEnum.Karayolu2,c.busList.get(0),Tarih.DORT_ARALIK));
		c.busList.get(0).using=true;
		
		c.seferList.add(new Route(MyEnum.Havayolu1,c.airplaneList.get(0),Tarih.DORT_ARALIK));
		c.airplaneList.get(0).using=true;
		
		c.seferList.add(new Route(MyEnum.Havayolu1,c.airplaneList.get(1),Tarih.DORT_ARALIK));
		c.airplaneList.get(1).using=true; 
		
		d.seferList.add(new Route(MyEnum.Demiryolu1,d.trainList.get(0),Tarih.DORT_ARALIK));
		d.trainList.get(0).using=true;
		
		d.seferList.add(new Route(MyEnum.Demiryolu2,d.trainList.get(1),Tarih.DORT_ARALIK));
		d.trainList.get(1).using=true;
		
		d.seferList.add(new Route(MyEnum.Demiryolu2,d.trainList.get(2),Tarih.DORT_ARALIK));
		d.trainList.get(2).using=true;
		
		f.seferList.add(new Route(MyEnum.Havayolu2,f.airplaneList.get(0),Tarih.DORT_ARALIK));
		f.airplaneList.get(0).using=true;
		
		f.seferList.add(new Route(MyEnum.Havayolu2,f.airplaneList.get(1),Tarih.DORT_ARALIK));
		f.airplaneList.get(1).using=true;
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui(admin1,companyList);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace(); 
				}
			} 
		});
		
		
	}

}
