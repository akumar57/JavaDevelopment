
 class outer 
{

	void outerMethod()
	{
		System.out.println("this is inside outer Method");
		
		class Inner //this is my method local inner class
		{
			void innerMethod()
			{
				System.out.println("inside Inner method");
			}
			
		}
		
		Inner y = new Inner();
		y.innerMethod(); //calling inner class method
	}
}
	public class Method_Local_Inner
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         outer x = new outer();
         x.outerMethod();  //calling outer class method
         
	}
	}

