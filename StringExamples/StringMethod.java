package StringExamples;

public class StringMethod {

	public static void main(String[] args) {
		String s1="Karan";
		StringBuffer sb=new StringBuffer();
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.charAt(4));
		System.out.println(s1.contains("an"));
		System.out.println(s1.startsWith("sa"));
		System.out.println(s1.endsWith("m"));
	}

}
