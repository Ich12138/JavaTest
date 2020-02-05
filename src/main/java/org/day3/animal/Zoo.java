package org.day3.animal;

import org.day3.animal.Animal;
import org.day3.animal.Bird;
import org.day3.animal.Fish;

public class Zoo {

    public static void main(String[] args) {
        Animal animal1 = new Animal("AA",4);
        Animal animal2 = new Animal("BB",5);

        Bird bird1 = new Bird("bird1",6);
        Bird bird2 = new Bird();

        Fish fish1 = new Fish("sasa",2);
        Fish fish2 = new Fish();

        animal1.getLegs();
        animal1.move();
        animal1.move(3);
        animal2.move(2);

        bird1.getLegs();
        bird1.getName();
        bird1.move();
        bird2.move();
        fish1.move();
        fish2.move();
    }
}
