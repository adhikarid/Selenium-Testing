 package selinum;

public class Unaryoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// unary operator ++,--
		int x =5;
		System.out.println(++x); // pre increment
		System.out.println(x);
		System.out.println(x++); // post increment
		System.out.println(x);
		int a=10;
		System.out.println(a++);
		System.out.println(a);
		a=10;
		System.out.println(++a);
		System.out.println(--a);
		a*=4;
		System.out.println(a);
		a%=3;
		System.out.println(a);
	}

}
