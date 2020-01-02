package selinum;

public class Stringop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] ch = {'j','a','v','a'};
		String S="Java";
		StringBuilder F=new StringBuilder("Hellow");
		F.append("World");
		System.out.println(F);
		F.delete(0,4);
		System.out.println(F);
		F.reverse();
		System.out.println(F);
		F.replace(2,5,"a");
		System.out.println(F);
		StringBuffer b=new StringBuffer("hiiiiii");
		b.append("java");
		System.out.println(b);
		b.delete(2, 5);
		System.out.println(b);
		
		

	}

}

