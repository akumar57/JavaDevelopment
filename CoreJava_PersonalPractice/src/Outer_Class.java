
public class Outer_Class {
  
	private int data = 30; //you can write any protected/private/default
	
	class Inner_Class {
		
		void msg()
		{
			System.out.println("this is an example of accessing private variables from nested inner classes");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer_Class obj = new Outer_Class();
		Outer_Class.Inner_Class obj1 = obj.new Inner_Class();
		
		obj1.msg();
	}

}
