package factory;

import track.*;

public class TrackFactoryImpl implements TrackFactory {

    @Override
    public Track createTrack(String type){

        if(type.equalsIgnoreCase("blue"))
            return new BlueMoonBay();

        if(type.equalsIgnoreCase("bb"))
            return new BBRaceway();

        if(type.equalsIgnoreCase("spa"))
            return new SpaFrancorchamps();

        throw new IllegalArgumentException("Unknown track type: " + type);
    }
}