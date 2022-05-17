package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 153;
		int sum = input;
		int start = 0;
		
		while(sum>0) {
			int rem = sum%10;
			start = start + (rem*rem*rem);
			sum = sum/10;
		}
        System.out.println(start);
        if(start == input) {
        	System.out.println(" Is Armstrong Number");
        	
        }
        else
        	System.out.println(" Is Not Armsrong Number");

	}

}
