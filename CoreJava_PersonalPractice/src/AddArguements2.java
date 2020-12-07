/**
 * 
 */

/**
 * @author User
 *
 */
public class AddArguements2
{
    public static void main(String args[])
    { try { int sum=0;
            for(int i=0;i<args.length;i++)
            {
                sum += Integer.parseInt(args[i]);
                        }
            
            System.out.println("sum="+sum);}
    catch(NumberFormatException nfe) 
    {
            System.err.println("one of the command line"+"argument is not an integer.");
    }
}
}