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

	public void multi(int a, int b) {
		System.out.println(a * b);
	}

	public void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public void multi(int a, int b, int c) {
		System.out.println(a * b * c);
	}
	{
	 int num = 121, reversedInteger = 0, remainder, originalInteger;

     originalInteger = num;

     // reversed integer is stored in variable 
     while( num != 0 )
     {
         remainder = num % 10;
         reversedInteger = reversedInteger * 10 + remainder;
         num  /= 10;
     }


     if (originalInteger == reversedInteger)
         System.out.println(originalInteger + " is a palindrome.");
     else
         System.out.println(originalInteger + " is not a palindrome.");
}
}
