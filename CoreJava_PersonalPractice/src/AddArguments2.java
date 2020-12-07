
public class AddArguments2 {

	public static void main(String args[]) {
		// TODO Auto-generated method stub

		try {
			
			int sum = 0;
			for (int i = 0; i<args.length;i++)
			{
				sum += Integer.parseInt(args[i]);
			}
			System.out.println("Sum=="+sum);
		}
		
			catch(NumberFormatException nfe)
			{
				System.err.println("One of the command line"+"argument is not an integer");

			}
		catch (Exception e)
		{
			System.err.println("general exception ocurred");
			
		}
		}
	}

