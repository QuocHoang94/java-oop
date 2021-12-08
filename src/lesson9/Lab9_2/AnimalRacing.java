package lesson9.Lab9_2;

import java.security.SecureRandom;

public class AnimalRacing {

    public int speed;

    protected void AnimalSpeed(int maxSpeed){
        this.speed = new SecureRandom().nextInt(maxSpeed+1);
    }
    protected int getSpeed(){
        return this.speed;
    }

}
