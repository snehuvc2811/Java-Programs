package day2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IterationProgram {

	public static void main(String[] args) {
		Collection c= new ArrayList();
		c.add("Ramesh");
		c.add(75);
		c.add("Ramesh");
		c.add(52.55);
		System.out.println(c);
		c.remove("Ramesh");
		Iterator i2=c.iterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		
		

	}

}
