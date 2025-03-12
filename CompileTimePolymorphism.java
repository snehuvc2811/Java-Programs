package day2;

public class CompileTimePolymorphism {

	void Login(String emailid)
	{
		System.out.println("Login with email id: " +emailid);
	}
	
	void Login(long mobno)
	{
		System.out.println("Login with mobno: " +mobno);
	}
	public static void main(String[] args) {
		
		CompileTimePolymorphism ctm=new CompileTimePolymorphism();
		ctm.Login("abc.1@gmail.com");
		ctm.Login(9985412687l);
		
		
	}

}
