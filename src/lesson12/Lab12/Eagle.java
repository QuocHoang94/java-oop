package lesson12.Lab12;

public class Eagle extends Animal {
    public Eagle(){
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
