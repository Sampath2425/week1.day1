package week1.day1;

public class TwoWheeler {
	
	//variables
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 12345678;
	boolean isPunctured = false;
	String bikeName = "harley davidson";
	double runningKM = 50000.56;
	
/*	public void ride() {
		int regNumber = 2425;
		
		System.out.println("Ride the Bike");
		
	}
	
	public void applyBreak() {
		
		System.out.println("Apply the Break");
		ride();
	}*/
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoWheeler tw = new TwoWheeler();
//		tw.ride();
//		tw.applyBreak();
		
		System.out.println(tw.noOfWheels);
		System.out.println(tw.bikeName);
		System.out.println(tw.noOfMirrors);
		System.out.println(tw.chassisNumber);
		System.out.println(tw.isPunctured);
		System.out.println(tw.runningKM);

	}

}
