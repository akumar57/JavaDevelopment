interface Pet{
  public void test();
}
class InterfaceImplementationExample implements Pet{
public void test()
   {
     System.out.println("Interface Method Implemented");
  }
   public static void main(String args[]){
     Pet p = new InterfaceImplementationExample();
     p.test();
  }
	     
}