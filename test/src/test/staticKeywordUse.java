package test;

public class staticKeywordUse {
	
	
	 int rollno;
	 String className;
	static String  collegeName = "JSS";
	
	
	public staticKeywordUse(int i, String s) {

	}

	  void displayDetails(int r, String s)
	{	
		int rollno = r;
		String className = s;
		System.out.println(rollno+ " "+ " "+className+ " " + collegeName);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticKeywordUse s1 = new staticKeywordUse(7,"ABC");

		s1.displayDetails(7,"Abc");
		
	}

}
