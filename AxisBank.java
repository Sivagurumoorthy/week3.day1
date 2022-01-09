package week3.day1;

public class AxisBank extends Bankinfo {
	
	public void deposit() {
		System.out.println("AXIS BANK");
		System.out.println("DEPOSIT INTREST VALUE - 7.0%");
		
	}

	public static void main(String[] args) {
		
		AxisBank axis = new AxisBank();
		axis.deposit();
		axis.fixed();
		axis.saving();
	
	}

}
