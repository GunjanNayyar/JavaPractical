package StringExamples;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println("Enter your salary:");
		float sal=sc.nextFloat();
		System.out.println("Your name is:"+name);
		System.out.println("The age is:"+age);
		System.out.println("The salary is:"+sal);
	}

}
