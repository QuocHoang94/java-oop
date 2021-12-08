package lesson8.Lab08;

import java.security.SecureRandom;

public class AnimalRacing {
    public static void main(String[] args){
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Horse horse = new Horse();

        if(dog.getSpeed() >= horse.getSpeed() && dog.getSpeed() >= tiger.getSpeed()){
            System.out.println("The winner is " + dog.getClass().getSimpleName() + " with speed " + dog.getSpeed());
        } else if(horse.getSpeed() >= dog.getSpeed() && horse.getSpeed() >= tiger.getSpeed() ){
            System.out.println("The winner is " + horse.getClass().getSimpleName() + " with speed " + horse.getSpeed());
        }else{
            System.out.println("The winner is " + tiger.getClass().getSimpleName() + " with speed " + tiger.getSpeed());
        }
    }
}
