package day1;

 class Yoga
{
	void stretch()
	{
		System.out.println("Do Stretching");
	}
	
}
class Zumba extends Yoga
{
	void stretch()
	{
		System.out.println("Dont do Stretching");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		Zumba z=new Zumba();
		z.stretch();
		
	
	}

}
