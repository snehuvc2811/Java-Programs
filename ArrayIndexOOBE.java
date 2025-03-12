package day2;

public class ArrayIndexOOBE {

	public static void main(String[] args) {
		int[] rollno = new int[3];
		rollno[0]= 10;
		rollno[1]= 11;
		rollno[2]= 12;
		
		try
		{
			for(int i=0; i<=rollno.length; i++)
			{
				System.out.println(rollno[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		}
		
	}


