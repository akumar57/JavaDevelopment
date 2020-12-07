import pack.defaultAccessModifier1;

  public class defaultAccessModifier2 {
	public static void main (String args[])
	{
		
		 defaultAccessModifier1 a = new defaultAccessModifier1();
		 
		 a.msg();
		 
		 // msg method is accessible only because it is set to public. in defaultAccessModifier1.java class. if it isset to default it will be invisible
				
	}

	protected class abc{
		
		void display() 
	       { 
	           System.out.println("Hello World!"); 
	       } 
		
	}
	
	
}