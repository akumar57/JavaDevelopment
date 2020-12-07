class Demo
{
	void show()
	{
		System.out.println("i am in a show method of super class");
	}

}
public class Anonymous_Inner_Class {

	static Demo d = new Demo()
	{	
		void show()
		{
			super.show();
			System.out.println("I am in anonymous inner");
		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d.show();

	}

}
