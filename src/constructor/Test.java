package constructor;

public class Test {

	public Test () {
		System.out.println("constructor is executing");
		String s="abc";
		int i=10;
		System.out.println(s+i);	
		
	}
	public Test (int i) {
		System.out.println("one argument constructor");
		System.out.println(i);
		
	}
	public Test (String s, double d,boolean b) {
		System.out.println("three argument constructor");
		System.out.println(s+d+b);
		
	}
	public void m2() {
		System.out.println("m2 method");
	
	}
	public static void m1() {
		System.out.println("m1 method ");
		
	}
	public static void main(String[] args) {
		Test t =new Test();
		Test t1 =new Test(20);
		Test t2 =new Test("pravin",2.66,false);
		t.m2();
		m1();
	}
	
	
	
}
