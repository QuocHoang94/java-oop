package lesson8.Lab08;

import java.security.SecureRandom;

public class Horse {
    private final int speed ;

    public Horse(){
        this.speed = new SecureRandom().nextInt(75+1);
    }
    public int getSpeed(){
        return this.speed;
    }
}
