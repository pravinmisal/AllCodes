package variableininheritance;

public class Child extends Parent{
public void bike() {
	System.out.println(j);//accessing static variable into child class
	System.out.println(this.s);//accessing nonstatic variable into child class
	System.out.println(s);
}public static void property() {
	Child c =new Child();
	System.out.println(c.s);
	System.out.println(j);
}
public static void main(String[] args) {
	Child c =new Child();
	c.bike();
	property();
}
}
