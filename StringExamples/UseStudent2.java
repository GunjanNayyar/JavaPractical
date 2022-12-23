package StringExamples;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class UseStudent2 {

	public static void main(String[] args) {
		try
		{
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("Ftest.txt"));
			  Student s2=(Student)in.readObject();  
			  //printing the data of the serialized object  
			  System.out.println(s2.id+" "+s2.name);  
			  //closing the stream  
			  in.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	 }  

		

	}


