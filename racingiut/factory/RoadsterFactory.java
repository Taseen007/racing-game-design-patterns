package factory;

import car.*;

public class RoadsterFactory implements CarFactory {

    @Override
    public Car createCar(String type){

        if(type.equalsIgnoreCase("porsche"))
            return new PorscheBoxster();

        if(type.equalsIgnoreCase("ferrari"))
            return new Ferrari812();

        throw new IllegalArgumentException("Unknown roadster car type: " + type);
    }
}