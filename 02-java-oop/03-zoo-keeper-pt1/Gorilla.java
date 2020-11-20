public class Gorilla extends MammalClass {



	public void throwSomething() {
		System.out.println("throw something");
		energylevel -= 5;
	}
	public void eatBananas() {
		System.out.println("eating bananas");
		energylevel += 10;
	}
	public void climb() {
		System.out.println("climb");
		energylevel -= 10;
	}
}