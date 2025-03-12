package day2;
class Encapprogram
{
	private String emailid="abc@gmail.com";

	public String getEmailid()
	{
		return emailid;
	}

	public void setEmailid(String emailid) 
	{
		this.emailid = emailid;
	}
	
	
}
public class EncapsulationProgram {

	public static void main(String[] args) {
	Encapprogram ep=new Encapprogram();
	ep.setEmailid("snehaabc@gmail.com");
	System.out.println(ep.getEmailid());

	}

}
