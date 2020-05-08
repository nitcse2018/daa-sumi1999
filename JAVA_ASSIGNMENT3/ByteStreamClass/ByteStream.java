import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream SourceFile = null;
		FileOutputStream OutputFile = null;
		try
		{
			SourceFile = new FileInputStream("src1.txt");
			OutputFile = new FileOutputStream("output1.txt");
			int temp;
			while((temp = SourceFile.read()) != -1) 
			{
				OutputFile.write((byte)temp);
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