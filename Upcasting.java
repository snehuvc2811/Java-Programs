package day2;

import java.util.ArrayList;
import java.util.Collection;

public class Upcasting {

	public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add("Ram");
	c1.add(56.80);
	c1.add(65000);
	c1.add('v');
	System.out.println(c1);
	
	Collection c2=new ArrayList();
	c2.add(true);
	c2.add("Sneha");
	c2.add(6);
	c2.addAll(c1);
	System.out.println(c2);
	
	Collection<Integer> c3=new ArrayList<Integer>();
	c3.add(54);
	c3.add(78);
	c3.add(5896);
	System.out.println(c3);
	
	Collection<Character> c4=new ArrayList<Character>();
	c4.add('v');
	c4.add('b');
	c4.add('m');
	System.out.println(c4);
	
	Collection<Double> c5=new ArrayList<Double>();
	c5.add(2.356);
	c5.add(56.58);
	c5.add(12.12);
	System.out.println(c5);
	
	Collection<Float> c6=new ArrayList<Float>();
	c6.add(2.55556f);
	c6.add(45.2222f);
	c6.add(15.7878f);
	System.out.println(c6);
	
	Collection<Long> c7=new ArrayList<Long>();
	c7.add(5545454545l);
	c7.add(45124444l);
	c7.add(5566565656l);
	System.out.println(c7);
	
	Collection<String> c8=new ArrayList<String>();
	c8.add("Sneha");
	c8.add("Vikas");
	c8.add("Avyay");
	System.out.println(c8);
	
	boolean b1=c2.isEmpty();
	System.out.println(b1);
	
	c2.remove("Sneha");
	System.out.println(c2);
	
	c2.removeAll(c1);
	System.out.println("After removing " +c2);
	
	boolean b2= c3.contains(101);
	System.out.println(b2);
	
	boolean b3=c4.containsAll(c3);
	System.out.println(b3);
	
	c1.addAll(c2);
	System.out.println(c1);
	
	Collection<Integer> c9=new ArrayList<Integer>();
	c9.add(54);
	c9.add(78);
	c9.add(5896);
	System.out.println(c9);
	c3.addAll(c9);
	System.out.println(c3);
		
	}

}
