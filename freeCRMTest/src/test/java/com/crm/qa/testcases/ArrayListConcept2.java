package com.crm.qa.testcases;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept2{
	
	 public static void main(String[] args) {
		 
		 ArrayListConcept e1 = new ArrayListConcept("Anand",24,"ECE");
		 ArrayListConcept e2 = new ArrayListConcept("Mac",26,"CS");
		 ArrayListConcept e3 = new ArrayListConcept("Robert",27,"Civil");

		ArrayList<ArrayListConcept> ar1 = new ArrayList<ArrayListConcept>();

		ar1.add(e1);
		ar1.add(e2);
		ar1.add(e3);
		//iterator will be used to iterate 
		Iterator<ArrayListConcept> it= ar1.iterator();		
		while (it.hasNext())		
		{
			ArrayListConcept emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		}
	
}



 class ArrayListConcept {
		
	String name;
	int age;
	String dept;
	
	ArrayListConcept(String nameVar, int ageVar, String deptVar)
		{
			this.name=nameVar;
			this.age=ageVar;
	        this.dept=deptVar;	
		}

//	

}

 