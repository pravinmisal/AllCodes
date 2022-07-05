package polymorphism;

public class Test {
private void m1() {
	System.out.println("m1 method from zero argument");
}
public int m1(int a) {
	System.out.println("m1 method from one argument");
	return 50;
}public void namechange(String name , int id) {
	System.out.println("name has been sucessfully updated ");
}
public void namechange(String name, int id ,String marriagecertificate) {
	System.out.println("name has been updated as per ");
}public static void main(String[] args) {
Test t = new Test ();
t.m1();
int k=t.m1(20);
System.out.println(k);
t.namechange("pravin", 80);
t.namechange("Megha ", 0, "Megha talapete");
}
}
