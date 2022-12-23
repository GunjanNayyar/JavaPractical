package StringExamples;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a value:");
		String str1 = br.readLine();
		int v1= Integer.parseInt(str1);
		System.out.println("Enter another value:");
		String str2 = br.readLine();
		int v2=Integer.parseInt(str2);
		System.out.println("Addition: "+(v1+v2));
		
	}

}
