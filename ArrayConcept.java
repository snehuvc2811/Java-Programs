package day2;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int[] rollno=new int[4];
		rollno[0]= 10;
		rollno[1]= 11;
		rollno[2]= 12;
		rollno[3]= 13;
		
		for(int i=0; i<=rollno.length-1;i++)
		{
			System.out.println(rollno[i]);
		}
		
		String[] name= new String[3];
		name[0]="Sneha";
		name[1]="Ram";
		name[2]="Vicky";
		
		for(int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}

	}

}
