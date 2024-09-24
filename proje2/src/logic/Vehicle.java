package logic;



public abstract class Vehicle {
	
	
	public enum yakit{
		
		BENZIN,
		MOTORIN,
		ELEKTRIK,
		GAZ
		
	}
	
	public int aracID;
	public yakit yakittipi;
	public int kapasite; 
	public boolean using = false;
		
	
	
	public float CalculateFuelCost() {
		
		return 0;
	}
	
	
	

	
	

}
