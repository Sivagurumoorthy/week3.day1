package week3.day1;

public class AndroidPhone extends SmartPhone  {
	public void takevideo() {
		// TODO Auto-generated method stub
		System.out.println("takevideo");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AndroidPhone zen = new AndroidPhone();
		SmartPhone phone = new SmartPhone();
		Mobile met = new Mobile();
		zen.takevideo();
		phone.accesswhatsapp();
		met.Method();
		
	}

}
