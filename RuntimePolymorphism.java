package day2;
class Polymorphism
{
	void login()
	{
		System.out.println("Login with mobile no");
	}
}

public class RuntimePolymorphism extends Polymorphism {

	void login()
	{
		System.out.println("Login with emailid");
	}
	public static void main(String[] args) {
		
	//RuntimePolymorphism rp=new RuntimePolymorphism();
		Polymorphism p=new Polymorphism();
		p.login();
		//rp.login();
	}

}
