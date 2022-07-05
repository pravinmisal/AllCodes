package categorieofmethod;

public class MethodWithReturnAndNoArgument {
public static int m1() {
	System.out.println("method with return type and argument");
	return 100;
}
public String m2() {
	String s1= "MEGHA";
	System.out.println("MEGHA"+1);
	return "VELOCITY";
}public static void main(String[] args) {
	int k=m1();
	System.out.println(k); 
	MethodWithReturnAndNoArgument r =new MethodWithReturnAndNoArgument();
	String s=r.m2();
	System.out.println(s);
}
}
