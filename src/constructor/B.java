package constructor;

public class B {
String name;
String nativeplace;
int mathsmarke;
int age;
static int roll;
static String collegecity;
static String collegename;
public B(String name,String nativeplace,int mathsmarks,int age) {
	this.name=name;
	this.nativeplace=nativeplace;
	this.mathsmarke=mathsmarke;
	this.age=age;
}public static void main(String[] args) {
	B s1=new B("daniel","uk",90,25);
	B s2=new B("pravin","DHARASHIV",95,26);
	System.out.println(s1.name);
}
}
