
public class MethodOverloading {

	
	public long area(int a, int b)
	{
		long ar = a*b;
		System.out.println(ar);
       return ar;
	}
	
	public float area(float b)
	{
		float ar = b*b*b;
		System.out.println(ar);

		return ar;
	}
	
	public int area(int b)
	{
		int ar = b*b*b;
		System.out.println(ar);

		return ar;
	}
	public double area(double b)
	{
		double ar = b*b;
		System.out.println(ar);
		return ar;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading a = new MethodOverloading();
      a.area(3,4);
      a.area(4);
	}

}