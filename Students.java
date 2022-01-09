package week3.day1;

public class Students {

	public void getStudentDetails(int id)
	{
		System.out.println("Details of "+id);
	}
	public void getStudentDetails(int id, String name) {	
		System.out.println("Details of "+id+" "+ name);
	}
	
	public void getStudentDetails(String name, long phonenumber) {	
		System.out.println("Details of "+name+"  "+  phonenumber);
	}

		public static void main(String[] args) {
			
			Students Student = new Students();
			
			Student.getStudentDetails(007);
			Student.getStudentDetails(007,"SHIV");
			Student.getStudentDetails("gurusmart123@gmail.com", 770432193);
			
			
			
			
			
	}
		

	}

