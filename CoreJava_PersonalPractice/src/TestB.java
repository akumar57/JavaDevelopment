
public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TestA().methodPublic();
		new TestA().methodDefault();
		new TestA().methodProtected();
		System.out.println("Value of long=="+new TestA().a);
	}
	private void PrivateMethod() {
        System.out.println("Hello..this is private method");			
		}
	
	public void PublicMethod() {
        System.out.println("Hello..this is public method");			
		}
	
	protected void ProtectedMethod() {
        System.out.println("Hello..this is protected method");			
		}
	
	

}
