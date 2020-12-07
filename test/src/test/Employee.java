package test;

 class Employee {

	
	String name;
	int age;
	String domain;
	
	
	Employee(String a,int b,String c) {
			
		this.name = a;
		this.age = b;
		this.domain=c;	
		
	}
	int A()
	{
		
		 int a = 5;
		return a;
	}
	
	void B()
	{
		int x = Employee.this.A();
		System.out.println(x);  //method-1
		
		Employee e = new Employee(domain, x, domain);
		e.A();                 //method-2
	}
}
