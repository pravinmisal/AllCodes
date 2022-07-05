package categorieofmethod;

public class MethodWithNoReturnAndWithArgument {
public static void m1(int a,int b) {
	System.out.println("two argument method ");
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
}
public static void m2(int k) {
	System.out.println("single argument");
	m1(30,30);
}public static void main(String[] args) {
	m1(20,40);
	m2(80);
	
}
}
