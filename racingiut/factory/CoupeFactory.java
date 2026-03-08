package factory;

import car.*;

public class CoupeFactory implements CarFactory {

    @Override
    public Car createCar(String type){

        if(type.equalsIgnoreCase("toyota"))
            return new ToyotaGR86();

        if(type.equalsIgnoreCase("subaru"))
            return new SubaruBRZ();

        throw new IllegalArgumentException("Unknown coupe car type: " + type);
    }
}