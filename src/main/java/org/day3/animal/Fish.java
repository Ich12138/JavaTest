package org.day3.animal;

import org.day3.animal.Animal;

public class Fish extends Animal {


    public Fish() {
    }

    public Fish(String name, int legs) {
        super(name, legs);
        super.setLegs(0);


    }

    @Override
    public void move() {
        System.out.println(this.getName() + "腿的个数：" + this.getLegs() + " " + "XXX Swimming!");
    }
}
