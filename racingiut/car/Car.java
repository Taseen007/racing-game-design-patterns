package car;

import strategy.EngineBehavior;
import strategy.TurboBehavior;

public abstract class Car {

    protected EngineBehavior engineBehavior;
    protected TurboBehavior turboBehavior;

    public void setEngineBehavior(EngineBehavior engineBehavior){
        this.engineBehavior = engineBehavior;
    }

    public void setTurboBehavior(TurboBehavior turboBehavior){
        this.turboBehavior = turboBehavior;
    }

    public void performEngine(){
        engineBehavior.engineType();
    }

    public void performTurbo(){
        turboBehavior.turbo();
    }

    public void start(){
        System.out.println("Car started.");
    }

    public void accelerate(){
        System.out.println("Car accelerating...");
    }

    public void stop(){
        System.out.println("Car stopped.");
    }

    public abstract void carInfo();
}