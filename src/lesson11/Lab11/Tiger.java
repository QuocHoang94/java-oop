package lesson11.Lab11;

import java.security.SecureRandom;

public class Tiger extends Animal {
    protected int speed;

    @Override
    protected boolean checkFlyAble() {
        return false;
    }

    @Override
    protected void AnimalSpeed() {
        this.speed = new SecureRandom().nextInt(100 + 1);
    }

    @Override
    protected int getSpeed() {
        return this.speed;
    }

}
