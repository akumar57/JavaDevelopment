package pack;

public class defaultAccessModifier1 {
	
	 public  static void main(String args[])   
	 {
		 
		 defaultAccessModifier1 a = new  defaultAccessModifier1();
		 
		 test1 t = a.new test1(); ////very important..!!!1 Logic for accessing nested class and it's methods..
		 a.new abc();  // this will call constructor which will run display method..hence x.display is not required 
//		 x.display();
		 a.msg();
		 
		 t.msg();
		
	  }
  public void msg()
  {System.out.println("Hello");} 
  
  protected class abc {
		
		public abc() {
		// TODO Auto-generated constructor stub
			display();
	}

		public void display() 
	    { 
	        System.out.println("This is a message printed from the protected class!"); 
	    } 
	 	
	  }
  
  public static class xyz {
		
		public void display() 
	    { 
	        System.out.println("this is a static class within a nested class!"); 
	    } 
	 	
	  }

  public class test1 extends defaultAccessModifier1
  {
 	 
 	 public void msg()
 	 {
 		 
 		 System.out.println("Hello guys..!!"); 
 	 } 
 	 
// 	void display() 
//    { 
//        System.out.println("Hello World!"); 
//    } 
 	
 
  }

}