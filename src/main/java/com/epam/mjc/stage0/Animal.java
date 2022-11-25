package com.epam.mjc.stage0;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color,int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String s;
        String s1;
        if(hasFur)
            s = "a";
        else
            s = "no";
        if(numberOfPaws != 1){
            s1 = "paws";
        }
        else
            s1 = "paw";
        return "This animal is mostly " + this.color + ". It has " + this.numberOfPaws + " " +
                s1+ " and " + s + " fur.";
    }

    public static void main(String[] args) {
        Animal animal = new Animal("aaa",2,false);
        Bird bird = new Bird();
        Dog dog = new Dog();
        System.out.println(animal.getDescription());
        System.out.println(bird.getDescription());
        System.out.println(dog.getDescription());
    }
}
