package polymorphism;

public class Child extends Parent {
public void marry() {
	System.out.println("marry from child class");
}
public static void main(String[] args) {
	Child c = new Child ();
	c.marry();
	Parent p=new Parent();
	p.marry();
}
}
