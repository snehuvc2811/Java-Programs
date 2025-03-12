package day2;

public class AverageOfNumInArrays {

	public static void main(String[] args) {
		int[] age=new int[5];
		age[0]=10;
		age[1]=15;
		age[2]=11;
		age[3]=13;
		age[4]=16;
		
		int sum=0;
		double average=0;
        for(int i=0; i<age.length; i++)
        {
        	sum= sum+age[i];
        }
        System.out.println(sum);
        average=sum/age.length;
        System.out.println(average);
	}

}
