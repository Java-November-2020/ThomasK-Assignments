public class Bat extends MammalClass {


	public void fly() {
		System.out.println("flap flip flap flip");
		energylevel -= 50;
	}
	public void eatHumans() {
		System.out.println("Ohno CoronaVirus in the humans!");
		energylevel += 25;
	}
	public void attackTown() {
		System.out.println("crackle crackle crackle");
		energylevel -= 100;
	}
}