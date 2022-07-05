package inheritance;

public class Child extends Parent {
	public void Bike () {
		home();
		home();
		furniture();
		car();
	}
public static void main(String[] args) {
	Child c = new Child();
	c.Bike();
	c.home();
	c.furniture();
	c.car();
	property();
	c.firm();
}
}
