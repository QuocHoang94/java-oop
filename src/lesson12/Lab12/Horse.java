package lesson12.Lab12;

import java.security.SecureRandom;

public class Horse extends Animal implements RunBehavior {
    protected int speed;

    @Override
    public void AnimalSpeed() {
        this.speed = new SecureRandom().nextInt(75 + 1);
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public boolean isRun() {
        return true;
    }
}
