public class Human {
    int health = 100;
    int strength = 3;
    int stealth = 3;
    int intelligence = 3;

    public void attack(Human target) {
        target.health -= this.strength;
        System.out.println("Human swings a sword and hits the target for " + this.strength + "damage");
    }

}