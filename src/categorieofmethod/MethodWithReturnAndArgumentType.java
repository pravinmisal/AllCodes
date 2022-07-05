package categorieofmethod;

public class MethodWithReturnAndArgumentType {
public static int m1(int a,int b) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(a+b);
	a=b+4;
	System.out.println(a);
	return 100;
}public  String m2(String i ,String j) {
	String s="corporate";
	System.out.println(s);
	return "VELOCITY"; 
	
}
public String m3(int k,String g) {
	g=g+"DHARASHIV";
	System.out.println("value of g is:" +g);
	return "DHARASHIV";
}


public static void main(String[] args) {
	int k=m1(10,20);
	System.out.println(k);
	MethodWithReturnAndArgumentType ra=new MethodWithReturnAndArgumentType();
	String h=ra.m2("PRAVIn", "MEGHA");
	System.out.println(h);
	String j=ra.m3(20, "RENUKA");
	System.out.println(j);
}
}
