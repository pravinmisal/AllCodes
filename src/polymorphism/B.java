package polymorphism;

public class B extends A{
	String s= "def";
public static void main(String[] args) {
	B b = new B();
	System.out.println(b.s);//def 
	A a = new A ();
System.out.println(a.s);//abc
A aa=new B();
System.out.println(aa.s);//
}
}
