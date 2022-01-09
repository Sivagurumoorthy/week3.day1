package week3.day1;

public class Bankinfo {
	
	public void saving() {
		System.out.println(" SAVING INTREST RATE - 4.0%");

	}
	public void fixed() {
	   System.out.println(" FIXED INTREST RATE - 5.0%");

	}
public void deposit() {
	System.out.println(" DEPOSIT INTREST RATE - 4.0%");

}
	public static void main(String[] args) {
		
		Bankinfo ban = new Bankinfo();
		ban.saving();
		ban.fixed();
		ban.deposit();
		
	}

}
