package week1.day1;

public class Mobile {
	public void makeCall() {
		System.out.println("Make Call");
	}
	public void sendMsg() {
		System.out.println("Send Message");
	}
	public static void main(String[] args) {
		Mobile mymobile=new Mobile();
		mymobile.makeCall();
		mymobile.sendMsg();
	}

}
