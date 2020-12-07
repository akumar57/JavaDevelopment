package test;

public class Test { 
	   class A {
		  void hello ()
		  {
			  System.out.println("Hi There...!!");
		  }
	  } 
	  static class B { }
	  public static void main(String[] args) { 
	    /*will fail - compilation error, you need an instance of Test to instantiate A*/
	   // A a = new A(); 
		  
		//below step needs to be used if sibling class(i.e A) needs to be instantiated
		 Test t = new Test();
		 A a = t.new A();
		 a.hello();
	    /*will compile successfully, not instance of Test is needed to instantiate B */
	    B b = new B(); 
	  }
	}