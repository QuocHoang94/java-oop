package lesson12.Lab12;

import java.security.SecureRandom;

public class Tiger extends Animal implements RunBehavior {
    protected int speed;

    @Override
    public void AnimalSpeed() {
        this.speed = new SecureRandom().nextInt(100 + 1);
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
