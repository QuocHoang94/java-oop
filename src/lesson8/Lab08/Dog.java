package lesson8.Lab08;

import java.security.SecureRandom;

public class Dog {
    private final int speed;

    public Dog(){
        this.speed = new SecureRandom().nextInt(60+1);
    }

    public int getSpeed(){
        return this.speed;
    }
}
