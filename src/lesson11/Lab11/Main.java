package lesson11.Lab11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> AnimalRacing = new ArrayList<>();

        int speedDog = 0;
        int speedTiger = 0;
        int speedHorse = 0;
        Dog dog = new Dog();
        Eagle eagle = new Eagle();
        Falcon falcon = new Falcon();
        Horse horse = new Horse();
        Tiger tiger = new Tiger();
        AnimalRacing.add(dog);
        AnimalRacing.add(eagle);
        AnimalRacing.add(falcon);
        AnimalRacing.add(horse);
        AnimalRacing.add(tiger);
        dog.AnimalSpeed();
        horse.AnimalSpeed();
        tiger.AnimalSpeed();
        AnimalRacing = AnimalRacing.stream().filter(x -> !x.checkFlyAble()).collect(Collectors.toList());
        for (Animal x : AnimalRacing) {
            if (x.getClass().getSimpleName().equals("Dog")) {
                speedDog = x.getSpeed();
                System.out.println("This is speed Dog = " + x.getSpeed());
            }
            if (x.getClass().getSimpleName().equals("Horse")) {
                speedHorse = x.getSpeed();
                System.out.println("This is speed Horse = " + x.getSpeed());
            }
            if (x.getClass().getSimpleName().equals("Tiger")) {
                speedTiger = x.getSpeed();
                System.out.println("This is speed Tiger = " + x.getSpeed());
            }
        }
        if (speedDog >= speedHorse && speedDog >= speedTiger) {
            System.out.println("Animal Racing Top Speed is Dog " + speedDog);
        }
        if (speedHorse >= speedDog && speedHorse >= speedTiger) {
            System.out.println("Animal Racing Top Speed is Horse " + speedHorse);
        }
        if (speedTiger >= speedDog && speedTiger >= speedHorse) {
            System.out.println("Animal Racing Top Speed is Tiger " + speedTiger);
        }
    }
}

/*Resolve Animal Racing with ABSTRACTION and we add flyAble field:
 * Horse: Max 75 km/h !flyAble
 * Tiger: Max 100 Km/h !flyAble
 * Dog: Max 60 KM/h !flyAble
 * Falcon: Max 40KM/H flyAble
 * Eagle: Max 60KM/H flyAble
 *
 *
 * AnimalRacing | Class | Controller

TestAnimalRacing

. Form Up test data (ex: animal list)
. Use th*/