import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		hs.add("l");
		hs.add(2);
		hs.add("2");
		hs.add(true);
		hs.add("abcds");
		
		System.out.println(hs);
		
		

		TreeSet hs1 = new TreeSet();
		hs1.add(5);
		hs1.add(2);
		hs1.add(2);
		hs1.add(5);
		hs1.add(6);
		
		System.out.println(hs1);
	}

}
