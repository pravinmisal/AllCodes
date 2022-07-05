package polymorphism;

public class Child1 extends Parent1{
	public void m1() {
		System.out.println("m1 method from Child1 class");

	}public void m2() {
		System.out.println("m2 method from Child1 class");

	}public static void main(String[] args) {
		Child1 c= new Child1();
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		Parent1 p = new Parent1();
		p.m1();
		p.m2();
		Parent1 pp =new Child1();
		pp.m1();
		pp.m2();
		pp.m3();
		pp.m4();
	}
}
