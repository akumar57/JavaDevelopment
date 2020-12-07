
public class Static_Nested {

	private static void outerMethod()
	{
		System.out.println("Inside outerMethod");
	}
	static class Inner
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("This is concept of static nested class..Inside inner static class//!!");
      outerMethod();
      
	}
	}

}
