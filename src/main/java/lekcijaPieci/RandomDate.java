package lekcijaPieci;

import com.github.javafaker.Faker;
import lekcijaCetri.Dog;

public class RandomDate {
    public static void main(String[] args) {
        Faker randomGenerator = new Faker();
        randomGenerator.address().fullAddress();
        System.out.println(randomGenerator.address().fullAddress());
        randomGenerator.dragonBall().character();
        System.out.println(randomGenerator.dragonBall().character());
        Dog mansSuns = new Dog();
        mansSuns.setAge(randomGenerator.number().numberBetween(1,20));
        mansSuns.setName(randomGenerator.funnyName().name());
        mansSuns.setWeight(randomGenerator.number().numberBetween(0,20));
        mansSuns.setBreed(randomGenerator.dog().breed());
        mansSuns.printDog();

    }

}
