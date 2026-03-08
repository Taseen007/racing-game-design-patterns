package race;

import car.Car;
import decorator.SemaNOS;
import track.Track;

public class CircuitRace extends Race {

    protected void startLine(Track track){
        System.out.println("Circuit race started!");
    }

    protected void finishLine(Track track){
        System.out.println("Finish line reached (lap completed).");
    }

    protected Car pitStop(Car car){
        System.out.println("Pit Stop: Installing Sema NOS");
        return new SemaNOS(car);
    }
}