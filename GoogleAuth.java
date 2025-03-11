package day1;

class Google{
	
	void login()
	{
		System.out.println("Login with Email id");
	}
}
class Microsoft extends Google{
	
	void login()
	{
		super.login();
		System.out.println("Login with Mobile No");
		
	}
	
}
public class GoogleAuth {

	public static void main(String[] args) {
		Microsoft m=new Microsoft();
		m.login();
		
	}

}
