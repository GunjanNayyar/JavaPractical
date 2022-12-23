package StringExamples;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class UseStudent {

	public static void main(String[] args) {
		try {
		Student s1=new Student(101,"Ravi");
		FileOutputStream fs=new FileOutputStream("Ftest.txt");
		ObjectOutputStream os= new ObjectOutputStream(fs);
		os.writeObject(s1);
		os.flush();
		os.close();
		System.out.println("Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
