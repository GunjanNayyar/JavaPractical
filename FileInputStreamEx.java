package StringExamples;

import java.io.FileInputStream;

public class FileInputStreamEx {
	public static void main(String args[])
	{
		try
		{
			FileInputStream fis=new FileInputStream("Test1.txt");
			int i=0;
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
			fis.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
