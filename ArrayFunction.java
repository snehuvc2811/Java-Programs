package day2;

import java.util.Arrays;

public class ArrayFunction {

	public static void main(String[] args) {
		int age[]=new int[5];
		age[0]=22;
		age[1]=44;
		age[2]=56;
		age[3]=20;
		age[4]=63;
		
		Arrays.sort(age);
		System.out.println(Arrays.toString(age));
		Arrays.sort(age);
		
		String []name= new String[4];
		
			name[0]= "Sneha";
			name[1]= "Vikas";
			name[2]= "Avyay";
			name[3]= "Pushpa";
			Arrays.sort(name);
			System.out.println(Arrays.toString(name));
		}
	}


