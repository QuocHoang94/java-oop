package lesson9.Lab9_2;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();

        dog.AnimalSpeed(60);
        horse.AnimalSpeed(75);
        tiger.AnimalSpeed(100);
        int dogSpeed = dog.getSpeed();
        int horseSpeed = horse.getSpeed();
        int tigerSpeed = tiger.getSpeed();

        if(dogSpeed >= horseSpeed && dogSpeed >= tigerSpeed){
            System.out.println("The winner is " + dog.getClass().getSimpleName() + " with speed " + dog.getSpeed());
        }
        if(horseSpeed >=  tigerSpeed && horseSpeed >= dogSpeed){
            System.out.println("The winner is " + horse.getClass().getSimpleName() + " with speed " + horse.getSpeed());
        }
        if(tigerSpeed >= horseSpeed && tigerSpeed >= dogSpeed){
            System.out.println("The winner is " + tiger.getClass().getSimpleName() + " with speed " + tiger.getSpeed());
        }
    }
}
