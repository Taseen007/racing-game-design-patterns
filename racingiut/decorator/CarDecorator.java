package decorator;

import car.Car;

public abstract class CarDecorator extends Car {

    protected Car car;

    public CarDecorator(Car car){
        this.car = car;
    }

    @Override
    public void start(){
        car.start();
    }

    @Override
    public void stop(){
        car.stop();
    }

    @Override
    public void performEngine(){
        car.performEngine();
    }

    @Override
    public void performTurbo(){
        car.performTurbo();
    }
}