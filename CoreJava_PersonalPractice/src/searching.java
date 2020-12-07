import java.util.Scanner;

public class searching {

	public static void main(String[] args) {

		String [] str = {"abc","def","ghi"};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to be searched");
		String searchValue = sc.next();
		
		String res = linearing(str,searchValue);
	}

	public static String linearing(String[] str, String x) {
		
		
		int arrLength = str.length;
		
		for(int i = 0 ;i< arrLength - 1 ; i++)
		{
			if(str[i].equals(x))
			{
				
			}
		}
		return x;
		
	}

}
