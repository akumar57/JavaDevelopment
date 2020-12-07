public class parameterizedConstructor {

	parameterizedConstructor(int i,String j)  //parameterized constructor created
	{
		
		int id = i;
		String name = j;		
		display(id,name);
		
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		String j = "Anand";
		
		parameterizedConstructor s1 = new parameterizedConstructor(i, j);
					s1.display(i, j);
					
	}

		public  void display(int i, String j)
		{	
			System.out.println(i+" "+ j);			
		}
	
}
/*
class Student4{  
    int id;  
    String name;  
    //creating a parameterized constructor  
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    //creating objects and passing values  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan");  
    //calling method to display the values of object  
    s1.display();  
    s2.display();  
   }  
}  
*/