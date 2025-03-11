package day1;
class One	
{
	public One()
	{
		System.out.println("A is executed");
	}
}

class Two extends One
{
	public Two()
	{
		super();
		System.out.println("B is executed");
	}
}

public class SuperNonParameterized {

	public static void main(String[] args) {
		Two T=new Two();
		//One O=new One();

	}

}
