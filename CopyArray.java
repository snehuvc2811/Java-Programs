package day2;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		int stuid1[]=new int[4];
		stuid1[0]=25;
		stuid1[1]=46;
		stuid1[2]=48;
		stuid1[3]=56;
		
        int stuid2[]=new int[stuid1.length];
        
        for(int i=0; i<stuid1.length; i++)
        {
        	stuid2[i]=stuid1[i];
        }
        System.out.println("Input Array:-->"+Arrays.toString(stuid1));
        System.out.println("Input Array:-->"+Arrays.toString(stuid2));
	}

}
