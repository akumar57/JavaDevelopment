
public class fnctionOverriding2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 axisBank b = new axisBank();
			b.interestRate();
			b.rule2();
			
			ICICIBank i = new ICICIBank();
			
			i.interestRate();
			i.rule2();
	}
	
	 void interestRate()
	{
		 System.out.println("this is a general interest rate for all banks");	
	}
	
	void rule2()
	{
		System.out.println("this is rule2");
	}
		 	 
	}
	

class axisBank extends fnctionOverriding2 {
	
	
	public void interestRate()
	{
	 System.out.println("this is a specific interest rate for axis bank");	
	}
	
	
}


class ICICIBank extends fnctionOverriding2 {
	
	

}
	
	
	

