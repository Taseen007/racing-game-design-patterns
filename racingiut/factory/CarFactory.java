package factory;

import car.Car;

public interface CarFactory {
    Car createCar(String type);
}