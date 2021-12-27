package lesson12.Lab12;

import lession2.Array;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void animalRacing(List<RunBehavior> animalList) {
        int speedDog = 0;
        int speedTiger = 0;
        int speedHorse = 0;
        for (RunBehavior x : animalList) {
            if (x.getClass().getSimpleName().equals("Dog")) {
                x.AnimalSpeed();
                speedDog = x.getSpeed();
                System.out.println("This is speed Dog = " + x.getSpeed());
            }
            if (x.getClass().getSimpleName().equals("Horse")) {
                x.AnimalSpeed();
                speedHorse = x.getSpeed();
                System.out.println("This is speed Horse = " + x.getSpeed());
            }
            if (x.getClass().getSimpleName().equals("Tiger")) {
                x.AnimalSpeed();
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

    public static void main(String[] args) {
        Animal Eagle = new Eagle();
        Animal Falcon = new Falcon();
        RunBehavior Dog = new Dog();
        RunBehavior Horse = new Horse();
        RunBehavior Tiger = new Tiger();

        Eagle.isFly();
        Falcon.isFly();

        List<RunBehavior> animalList = Arrays.asList(Dog, Horse, Tiger);
        Main.animalRacing(animalList);
    }
}
