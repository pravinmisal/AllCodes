package variableininheritance;

public class B extends A{
	String s="nonstatic variables Chlild class";
	static String j ="Static variable from child class";

public void bike () {
	System.out.println(s);// Accssing nonstatic variable from child 
	System.out.println(this.s);// Accssing nonstatic variable from child
	System.out.println(j);// Accssing static variable from child
	System.out.println(super.s);
}
public static void property() {
	System.out.println(j);
	B c = new B();
	System.out.println(c.s);
	A a = new A();
System.out.println(a.s);
System.out.println(Parent.j);

}public static void main(String[] args) {
	B c = new B();
	c.bike();
	property();
	
}
}