import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreams {
	

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("C://Anand Backup//ABC.txt");
		System.out.println(fis.getChannel());
		System.out.println(fis.getFD());
		System.out.println("no. of bytes in the files==" + fis.available());
		System.out.println("Content : ");
		
		int ch;		
		while((ch = fis.read())!=-1)	
			System.out.print((char)ch);		
		
		fis.close();
	}

}
