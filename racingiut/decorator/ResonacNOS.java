package decorator;

import car.Car;

public class ResonacNOS extends CarDecorator {

    public ResonacNOS(Car car){
        super(car);
    }

    @Override
    public void accelerate(){
        car.accelerate();
        System.out.println("NOS Applied: Resonac Boost");
    }

    @Override
    public void carInfo(){
        car.carInfo();
    }
}