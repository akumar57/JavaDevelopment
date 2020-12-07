
class functionOverloading {

	public static void main(String[] args) {
		// this Will explain how function overloading takes place
		
		int a = 3;
        int b = 5;
        int c = 7;
        operation(a,b,c);
        
        operation (a,b);
	}	
	public static void operation(int a,int b)             
    {  	
    	System.out.println("multiplication is happening for 2 variables "+a*b);	
    }
	
	
public static void operation(int a,int b,int c)           
    
    {
	int d = a+b+c;
	System.out.println("addition is happening for 3 variables "+d);

    }
	
	
	

}
