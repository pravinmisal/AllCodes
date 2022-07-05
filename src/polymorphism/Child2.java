package polymorphism;

public class Child2 extends Parent2{
	public static void m1() {
		System.out.println("m1 method from Child2 class");
	}
	public static void main(String[] args) {
		Child2 c=  new Child2 ();
		c.m1();
		Parent2 p = new Parent2();
		p.m1();
		Parent2 pp=  new Child2 ();
		pp.m1();
	}
}
