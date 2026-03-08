package race;

import car.Car;
import track.Track;
import java.util.Random;

public abstract class Race {

    public final void race(Car car, Track track){

        car.carInfo();
        track.trackInfo();

        startCar(car);
        startLine(track);
        accelerateCar(car);

        Car nosCar = pitStop(car);

        applyNos(nosCar);

        finishLine(track);

        stopCar(nosCar);

        lapTime();
    }

    protected void startCar(Car car){
        car.start();
    }

    protected void accelerateCar(Car car){
        car.accelerate();
    }

    protected void stopCar(Car car){
        car.stop();
    }

    protected abstract void startLine(Track track);
    protected abstract void finishLine(Track track);
    protected abstract Car pitStop(Car car);

    protected void applyNos(Car car){
        System.out.println("NOS activated!");
    }

    protected void lapTime(){

        Random r = new Random();

        int sec = r.nextInt(60);
        int min = r.nextInt(60);
        int hr = r.nextInt(2);

        System.out.println("Lap Time: " + hr + ":" + min + ":" + sec);
    }
}