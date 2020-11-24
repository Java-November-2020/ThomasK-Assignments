
public class Bat{
    int energyLevel = 300;

    public void fly(){
        System.out.println("I'm like a bird, I can fly away");
        energyLevel -= 50;
    }
    public void eatHumans(){
        energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("Oh No, CoronaVirus");
        energyLevel -= 100;
    }

}