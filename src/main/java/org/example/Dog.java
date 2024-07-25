package org.example;

public class Dog implements Animal,Mammal {

    @Override
    public void run() {
        System.out.println("Dog runs");
    }
    @Override
    public void breastfeed() {
        System.out.println("Dog feed their puppies with her breast");
    }
    @Override
    public void breatheWithLungs() {
        System.out.println("Dog uses his lungs to breathe");
    }
}
