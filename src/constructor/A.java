package constructor;

public class A {
//public A(){
//      
//	}
public A() {
		System.out.println("zero argument constructor");
	}
	public A (char c) {
		this("pravin",20);
		System.out.println("one argument constructor");
	}
	public A(String s, int a){
		this();
		System.out.println("two argumenttype constructor");
	}public static void main(String[] args) {
		A a= new A('a');
		
	}
	
}
