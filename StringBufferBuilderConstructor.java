package day2;

public class StringBufferBuilderConstructor {

	public static void main(String[] args) {
		//Constructors for StringBuilder
		StringBuffer sb=new StringBuffer();
		System.out.println("Default StringBuffer Constructor Created :" +sb);
		
		StringBuffer sb1=new StringBuffer("Java is a Programming Langauge");
		System.out.println(sb1);
		
		StringBuffer sb2=new StringBuffer(40);
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer(sb1);
		System.out.println(sb3);
		
		//Constructors for StringBuffer
		StringBuilder sbc=new StringBuilder();
		System.out.println("Default StringBuilder Constructor Created :" +sbc);
		
		StringBuilder sbc1=new StringBuilder("Knowledge is important");
		System.out.println(sbc1);
		
		StringBuilder sbc2=new StringBuilder(50);
		System.out.println(sbc2);
		
		StringBuilder sbc3=new StringBuilder(sbc1);
		System.out.println(sbc3);
		
	}

}
