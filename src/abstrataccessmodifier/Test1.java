package abstrataccessmodifier;

public abstract class Test1 {
	public Test1() {
		System.out.println("constructor");
	}
	
	public void loginpage() {
		System.out.println("login method from Test1");
	}

	public void homepage() {
System.out.println("homepage method from test1");
	}

	public abstract void editinformation();

	public abstract void uploadimage();
}
