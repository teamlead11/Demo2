package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		BaseClass base = new BaseClass();
		base.add(6, 7);
		base.Arun();
		base.rama();
		base.palindromeByMady();
		base.palindromeBySundar();
	}

	public void add(int a, int b) {
		System.out.println(a / b);
	}

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void multi(int a, int b, int c) {
		System.out.println(a * b * c);
	}
	public void Arun() {
		String name = "Arun";
		String res = "";
		for (int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			res = res+ch;

		}
		if(res.equals(name)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	public void Rohini() {
		String name = "Rohini";
		String res = "";
		for (int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			res = res+ch;

		}
		if(res.equals(name)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	
	public void rama() {
		String name = "Arun";
		String res = "";
		for (int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			res = res+ch;

		}
		if(res.equals(name)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}
	}
	public void palindromeByMady() {
		String s="MADHAVILATHA";
		String res="";
		int l = s.length();
		
		for(int i=(l-1);i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.println(res);
		if(s.equals(res)) {
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println(s +" is not a palindrome String");
		}

		System.out.println("Printed in branch **Rohini**");
	}
	public void palindromeBySundar() {
		String s="SUNDAR";
		String res="";
		int l = s.length();
		
		for(int i=(l-1);i>=0;i--) {
			res=res+s.charAt(i);
		}
		System.out.println(res);
		if(s.equals(res)) {
			System.out.println("palindrome String");
		}
		else
		{
			System.out.println(s +" is not a palindrome String");
		}

	}
}


