package StringExamples;

import java.io.FileWriter;

public class FileWriterEx {

	public static void main(String[] args) {
		try
		{
			FileWriter fw=new FileWriter("Test2.txt",true);
			fw.write("How are you?");
			fw.close();
			System.out.println("Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
