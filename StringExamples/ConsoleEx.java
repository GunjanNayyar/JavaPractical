package StringExamples;

import java.io.Console;

public class ConsoleEx {

	public static void main(String[] args) throws Exception {
		Console c=System.console();
		
		//String name=c.readLine("Enter your name:");
		char[] pwd=c.readPassword("Password:");
		String cpwd=new String(pwd);
		
		System.out.println("The password is:"+cpwd);

	}

}
