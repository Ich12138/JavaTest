package org.day3.animal;

public class Animal {
    private String name = "AAA";
    private int legs = 4;


    public Animal() {
    }

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;

    }


    public void move() {
        System.out.println(this.getName() + "腿的个数：" + this.getLegs() + " " + "XXX Moving!");
    }

    public void move(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(this.getName() + "腿的个数：" + this.getLegs() + " " + "XXX Moving!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
