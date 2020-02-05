package org.day3.animal;

import org.day3.animal.Animal;

public class Bird extends Animal {
    private int legs ;
    public Bird(){}

    public Bird(String name,int legs){
        super(name,legs);
        this.legs = 2;
    }


    @Override
    public void move() {
        System.out.println(this.getName()+"腿的个数："+this.getLegs()+" "+"XXX Flying!");
    }
}
