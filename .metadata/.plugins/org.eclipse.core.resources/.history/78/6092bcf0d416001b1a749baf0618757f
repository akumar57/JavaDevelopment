package test;

import java.util.Scanner;

public class deleteElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,element,num = 0,flag = 0;
   Scanner s = new Scanner(System.in);
   System.out.println("enter numnber of array elements");
   n = s.nextInt();
   int ar1[] = new int[n];
   for (int i = 0; i<n; i++)
   {
	   System.out.println("enter "+ i + " array element");
	   ar1[i] = s.nextInt();
   }
   
   System.out.println("Enter the element you want to delete");
   element = s.nextInt();
   
   for(int j=0;j<n;j++)
   {
	   if(element == ar1[j])
	   {
		   flag = 1;
		   num = j;
		   System.out.println("element to be deleted at index==" + num);
		   break;  //2,3,4,
	   }
   }

   if(flag==1)
   {          //k=2;k<4;k++
	   for(int k = num ; k<= n-2; k++) //1,2,3,4,num=2//2,3,4,5,6,7
	   {
		  ar1[k] = ar1[k+1] ;
	   }
	   
	   System.out.println("Elements are===");
	   for (int i = 0; i<n-1; i++)
	   {
		   System.out.println(ar1[i]);
	   }
	   
	   
   }
   else
	   System.out.println("No elements to delete..");
   
   }
   

}
