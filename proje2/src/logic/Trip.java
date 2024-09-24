package logic;

public class Trip {
	
	public Vehicle arac;
	public int fiyat;
	
	
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
	
	

}
