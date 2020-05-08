import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CharStream
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream SourceFile = null;
		FileOutputStream OutputFile = null;
		try
		{
			SourceFile = new FileInputStream("input2.txt");
			OutputFile = new FileOutputStream("output2.txt");
			int temp;
			while((temp = SourceFile.read()) != -1) 
			{
				OutputFile.write((char)temp);
			}
			System.out.println("Successfully written into the file.");
		}
		finally
		{
			if(SourceFile != null)
			{
				SourceFile.close();
			}
			if(OutputFile != null)
			{
				OutputFile.close();
			}
		}			
	}
}