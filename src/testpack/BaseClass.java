package testpack;

public class BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my base class");
		BaseClass base = new BaseClass();
		base.add(6, 7);
	}

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void multi(int a, int b, int c) {
		System.out.println(a * b * c);
	}
}
