//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class functionOverridingExample{  
public static void main(String args[]){  
SBI s=new SBI();  
ICICI i=new ICICI();  
AXIS a=new AXIS();
int[] arr1 = {0,1,2,3,4,5};
System.out.println("array Initialization"+arr1); //ignore these 2 lines.It is an example of array reference variable printing
System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); 
System.out.println("SBI Rate of Interest: "+s.rule1());  
System.out.println("ICICI Rate of Interest: "+i.rule2());   ///This depicts function overriding
System.out.println("AXIS Rate of Interest: "+a.rule1());
}  
}  
 class Banksssssss{  
 int getRateOfInterest(){return 0;}  
  String rule1()
{
	return ("this is generic rule 1 for all banks");	
}

String rule2()
{
	return ("this is generic rule 2 for all banks");
}

}  
class SBI extends Banksssssss{  
int getRateOfInterest(){return 8;}  
}  
  
class ICICI extends Banksssssss{  
int getRateOfInterest(){return 7;} 

String rule2(){
	
	return("This is rule2 specific to ICICI bank"); ///This depicts function overriding as this child class has overridden the actual method
}
}  
class AXIS extends Banksssssss{  
int getRateOfInterest(){return 9;} 
}  
//Test class to create objects and call the methods
