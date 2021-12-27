package lesson12.Lab12;

public abstract class Animal {
    FlyBehavior flyBehavior;
    public void isFly(){
        flyBehavior.FlyAble();
    }

    protected abstract void AnimalSpeed();

    protected abstract int getSpeed();
}
