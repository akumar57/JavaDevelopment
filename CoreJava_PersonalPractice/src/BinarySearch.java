
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,6,9,12,15,99,67};
		int key = 12;
		int arrlength = arr.length-1;
		binarySearch(arr,0,key,arrlength);
	}

	private static void binarySearch(int[] arr, int start, int key, int length) 
		{
	int midValue = (start+length)/2;
	while(start<=length)
	{
		if(arr[midValue]<key)
		{
			start = midValue +1;
		}
		else if(arr[midValue] == key) {			
			System.out.println("Element is found at index :"+midValue);
			break;
		} else {
			
			length = midValue -1;
			
		}
		midValue = (start + length)/2;
	}
		if(start>length)
		{
			System.out.println("Elmnt is not found");
		}
		}

}
