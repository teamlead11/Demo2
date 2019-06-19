package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		BaseClass base = new BaseClass();
		base.add(6, 7);
		base.Arun();
	}

	public void add(int a, int b) {
		System.out.println(a + b);
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

}


