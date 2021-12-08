package lesson8.Lab08;

import java.security.SecureRandom;

public class Tiger {
    private final int speed;
    public Tiger(){
        this.speed = new SecureRandom().nextInt(100+1);
    }
    public int getSpeed(){
        return this.speed;
    }
}
