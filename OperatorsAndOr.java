package day1;

public class OperatorsAndOr {

	public static void main(String[] args) {
	
		int a=20;
		int b=50;
		int c=90;
		int d=34;
		double money=25.25;
		double Note=100.50;
		
		if(a==b && a>b)
		{
			System.out.println(1);
		}
		else if(c==d || c<d)
		{
			System.out.println(2);
		}
		else if(!(money<50.00 && Note>10.00))
		{
			System.out.println("3");
		}
		else if(!(money==80.00 || Note==60.00))
		{
			System.out.println("4");
		}
		else 
		{
			System.out.println(5);
		}

	}

}
