
public class CallByValueMethod {

	
	int val = 150;
	int operation(int val)
	{
		val = val/10;
		return val;
	}
	
	public static void main(String[] args) {
		
		CallByValueMethod a = new CallByValueMethod();
		System.out.println("Before operation value of variable val is " + a.val);
		System.out.println("Before operation value of variable val is " + a.operation(10));


	}
	
	

}
