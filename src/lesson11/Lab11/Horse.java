package lesson11.Lab11;

import java.security.SecureRandom;

public class Horse extends Animal {
    protected int speed;

    @Override
    protected boolean checkFlyAble() {
        return false;
    }

    @Override
    protected void AnimalSpeed() {
        this.speed = new SecureRandom().nextInt(75 + 1);
    }

    @Override
    protected int getSpeed() {
        return this.speed;
    }

}
