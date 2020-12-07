package strings;

import pack.defaultAccessModifier1;

public class stringCharAtFunction extends defaultAccessModifier1 {
	
	
	public static void main(String args[])
	{
	//String s = "He     is   a good      boy";
	
	//System.out.println(s.trim());
//	String a = s.trim().replaceAll("\\s{2,}", " ");
//	System.out.println(s.trim().replaceAll("\\s{2,}", " "));
//	
//	char newstring = 0;
//   
//	for (int i = a.length()-1;i>=0;i--)   	 //code to reverse the string
//    {
//		newstring = a.charAt(i);		
//		System.out.print(newstring);
//	}

	 defaultAccessModifier1 x= new defaultAccessModifier1();
		
	 x.msg();  /////////////////////////////////////no constructor was needed	 
	 defaultAccessModifier1.abc y = x.new abc(); //constructor was required ONLY when the class was protected else was not needed
	 
	   y.display();                              //to access non-static inner classes
	   
	   defaultAccessModifier1.xyz z = new xyz();   //to access static inner classes
	   z.display();
	   defaultAccessModifier1.xyz p = new defaultAccessModifier1.xyz(); //alternative to access static inner classes
	   p.display();

}
}
