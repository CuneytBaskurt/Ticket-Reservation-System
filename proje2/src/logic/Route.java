package logic;

public class Route {
	
	public Tarih tarih ;
	public Vehicle arac;
	public MyEnum guzergah;
	
	public enum MyEnum {
		Demiryolu1("Demiryolu: Istanbul - Kocaeli - Bilecik - Eskisehir - Ankara - Eskisehir- Bilecik - Kocaeli - Istanbul"),
	    Demiryolu2("Demiryolu: Istanbul - Kocaeli - Bilecik - Eskisehir - Konya - Eskisehir - Bilecik - Kocaeli - Istanbul"),
	    Karayolu1("Karayolu: Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul - Kocaeli - Ankara - Kocaeli - Istanbul"),
	    Karayolu2("Karayolu: Istanbul - Kocaeli - Eskisehir - Konya - Eskisehir - Kocaeli - IStanbul"),
	    Havayolu1("Havayolu: Istanbul - Konya - Istanbul"),
	    Havayolu2("Havayolu: Istanbul - Ankara - Istanbul");
	    private final String stringValue;

	    MyEnum(String stringValue) {
	        this.stringValue = stringValue;
	    }

	    public String getStringValue() {
	        return stringValue;
	    }
	}
	
	
	
	public enum Tarih {
	    DORT_ARALIK("4 Aralık"),
	    BES_ARALIK("5 Aralık"),
	    ALTI_ARALIK("6 Aralık"),
	    YEDI_ARALIK("7 Aralık"),
	    SEKIZ_ARALIK("8 Aralık"),
	    DOKUZ_ARALIK("9 Aralık"),
	    ON_ARALIK("10 Aralık");

	    private String label;

	    Tarih(String label) {
	        this.label = label;
	    }

	    public String getLabel() {
	        return label;
	    }
	}
	
	
	public Route(MyEnum guzergah,Vehicle arac,Tarih gun){
		
		this.arac = arac;
		this.guzergah = guzergah;
		this.tarih = gun;
		
		
	} 
}
