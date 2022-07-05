package variableinjava;

public class Class2 {
     static int i =20;
     String s = "ramesh";
     static boolean b=false;
     float f=2.55f;
     public static void m1() {
       int i=30;
       Class2 xx =new Class2();
    	System.out.println(xx.s);     	 
    	System.out.println(xx.f);
    	 
    	 }
     public void m2() {
    	 
    System.out.println(this.s);
    System.out.println(this.i);

     }
     
     public static void main(String[] args) {
		m1();
		Class2 a = new Class2();
		a.m2();
	}
}
