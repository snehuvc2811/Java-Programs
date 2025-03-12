package day2;

import java.util.Date;

public class DateProgram {

	public static void main(String[] args) {
	 Date d1=new Date();
	 Date d2=new Date(d1.getTime()+(1000*60*60*24*4));
	 System.out.println(d2);
	
	 System.out.println(d1);
	 String format1=d1.toString();
	 String month= format1.substring(4, 7);
	 System.out.println(month);
	 String Date= format1.substring(8, 10);
	 System.out.println(Date);
	 String year=format1.substring(format1.length()-4);
	 System.out.println(year);
	 
	 String format2=Date.concat("-").concat(month).concat("-").concat(year);
	 System.out.println(format2);
	 
	 String format3=Date.concat("/").concat(month).concat("/").concat(year);
	 System.out.println(format3);
	}

}
