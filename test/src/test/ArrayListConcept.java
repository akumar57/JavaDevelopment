package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ArrayList<Employee> ar = new ArrayList<Employee>();
		Employee e1 = new Employee("Anand",31,"ECE");
	    ar.add(e1);
	    		
//		ar.add("200");
//		ar.add(1, 300);
//		ar.add(1,"Anand");
		System.out.println(ar.get(0));
		System.out.println(ar.size());
		
		//System.out.println(Math.abs(-12)); as math class is a static class therefore it is called directly without instantiating
		

		Iterator<Employee> it = ar.iterator();
		
		while(it.hasNext())
		{
			
			
			System.out.println(it.next());
		}				
		
	}
}
