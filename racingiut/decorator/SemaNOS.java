package decorator;

import car.Car;

public class SemaNOS extends CarDecorator {

    public SemaNOS(Car car){
        super(car);
    }

    @Override
    public void accelerate(){
        car.accelerate();
        System.out.println("NOS Applied: Sema Nitro");
    }

    @Override
    public void carInfo(){
        car.carInfo();
    }
}