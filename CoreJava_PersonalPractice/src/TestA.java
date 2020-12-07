
public class TestA {


		public long a = 10;
		private int c = 30;
		public void methodPublic()
		{
			PrivateMethod();
		}
		
		protected void methodProtected()
		{
			PrivateMethod();
		}
		
		 void methodDefault()
		{
			PrivateMethod();
		}
		
		
		private void PrivateMethod() {
          System.out.println("Hello..this is private method");			
		}

}
