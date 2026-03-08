package race;

import car.Car;
import decorator.ResonacNOS;
import track.Track;

public class SprintRace extends Race {

    protected void startLine(Track track){
        System.out.println("Sprint race started!");
    }

    protected void finishLine(Track track){
        System.out.println("Finish line reached (end of track).");
    }

    protected Car pitStop(Car car){
        System.out.println("Pit Stop: Installing Resonac NOS");
        return new ResonacNOS(car);
    }
}