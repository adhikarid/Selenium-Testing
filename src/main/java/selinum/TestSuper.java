package selinum;

public class TestSuper extends ParentSuper {
int i=6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSuper obj = new TestSuper();
		obj.show();
	}
	public void show() {
		super.show();
		System.out.println(super.i);
		System.out.println(i);
		System.out.println("inside child class.......");
		
	}
	
}
	

class ParentSuper{
	int i =5;
	public void show() {
		System.out.println("inside parent.......");
	}
}
		
		
		