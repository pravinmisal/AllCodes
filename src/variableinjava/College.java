package variableinjava;

public class College {
String name;
int mathsmark;
int age;
String nativeplace;
static String collegecity;
static String collegename;
public static void main(String[] args) {
	collegecity = "pune";
	collegename = "coep";
	College s1 = new College();
	s1.name = "pravin";
	s1.mathsmark = 99;
	s1.age = 26;
	s1.nativeplace = "DHARASHIV";
	System.out.println(s1.name);
	System.out.println(s1.age);
	System.out.println(s1.mathsmark);
	System.out.println(s1.nativeplace);

}
}
