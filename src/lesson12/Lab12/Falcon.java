package lesson12.Lab12;

public class Falcon extends Animal{
    public Falcon(){
        flyBehavior = new FlyWithWings();
    }

    @Override
    protected void AnimalSpeed() {

    }

    @Override
    protected int getSpeed() {
        return 0;
    }
}
