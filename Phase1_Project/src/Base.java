import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String flag = "1";
		while(flag.contains("1"))
		{
		System.out.println("*****************************************************");
		System.out.println("Welcome to LockedMe Portal...What would you like to do ?");
		System.out.println("*****************************************************");
		System.out.println("Enter: \n 1- To Retrieve the file name in Ascending Order \n 2- To Add the specified file Name \n 3- To Delete the specified file  \n 4- To Search the specified file Name \n 5- To exit the application");
		String a = sc.next();
		
		 performOperation(a);
		System.out.println("Do you want to continue ? Enter 1 to continue..or enter anything else to exit");
		flag = sc.next();
		}
		System.out.println("Thank you..Exiting now...!!");
	}
	

		private static void performOperation(String a) throws IOException {
			Scanner s = new Scanner(System.in);
			try
			{
		switch(a)
		{
			case "1":
				System.out.println("Enter the directory Path where you want to perform Search(e.g C://Anand Backup)");
				String c = s.nextLine();
				//Creating a File object for directory
			      File directoryPath = new File(c);
			      //List of all files and directories
			      String contents[] = directoryPath.list();
			     
			      System.out.println("List of files and directories(in Alphabetical Order) in the specified directory:");
			      for(int i=0; i<contents.length; i++) {
			         System.out.println(i+1 + ") "+ contents[i]);
			      }
				break;
			case "2":
				System.out.println("Enter the file name you want to add...");
				String fileName = s.nextLine();
				System.out.println("Enter the Directory where you want to add the above file...(e.g C://Anand Backup)");
				String directory = s.nextLine();
				
				   //  creating the file based upon directory and fileName entered. 
	            File file = new File(directory + "//"+ fileName); 
	  
	            if (!file.exists()) { 
	                 file.createNewFile(); // Create a new file if not exists. 
	                 System.out.println("File -" + fileName + "  Added successfully ..!!");
	            }
	            else
	             System.out.println("File already exists..!!Please select a unique name for the file or delete the older file to add with the same name");
	            break;
	            
			case "3": 
				System.out.println("Enter the file name you want to delete...");
				String DeletefileName = s.nextLine();
				System.out.println("Enter the Directory from where you want to delete the above file...(e.g C://Anand Backup)");
				String DeleteDirectory = s.nextLine();
				
				   //  creating the file based upon directory and fileName entered. 
	            File fileDelete = new File(DeleteDirectory + "//"+ DeletefileName); 
	  
	            if (!fileDelete.exists()) { 
	                 System.out.println("File does not exists in specified directory..!!"); 
	            } 
	            
	            else
	            {
	            fileDelete.delete(); // Delete the file if exists.
	            System.out.println("File " + DeletefileName + "  deleted successfully..!!");
	            }
	            break;
			case "4": 
				System.out.println("Enter the file name you want to search...");
				String SearchfileName = s.nextLine();
				System.out.println("Enter the Directory path where you want to search the above file...(e.g C://Anand Backup)");
				String SearchDirectory = s.nextLine();
				
				   //  creating the file based upon directory and fileName entered. 
	            File fileSearch = new File(SearchDirectory + "//"+ SearchfileName); 
	  
	            if (!fileSearch.exists()) { 
	                 System.out.println("File does not exists..!!"); 
	            } 
	            
	            else
	            System.out.println("File  " + SearchfileName + "  exists in the provided directory..!!");
	            break;
			case "5":
				System.out.println("Terminating the session");
				break;
				
		    default:
		    	System.out.println("Invalid Input...Pls enter any value out of 1 - 5");
		    	break;
		}
				
		}
			catch(Exception e)
			{
				
				System.out.println("Please enter a valid directory path...!!");
			}
		}
}
	
	

