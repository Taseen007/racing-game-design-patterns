package factory;

import car.Car;
import race.*;
import strategy.*;
import track.Track;

import java.util.Scanner;

public class GameSetup {

    private static Scanner sc = new Scanner(System.in);

    public static Car createCar(){

        System.out.println("Choose Car Category (coupe/roadster):");
        String category = sc.nextLine();

        CarFactory factory;

        if(category.equalsIgnoreCase("coupe"))
            factory = new CoupeFactory();
        else
            factory = new RoadsterFactory();

        System.out.println("Choose Car:");
        Car car = factory.createCar(sc.nextLine());

        configureEngine(car);
        configureTurbo(car);

        return car;
    }

    private static void configureEngine(Car car){

        System.out.println("Choose Engine (v6/v8/v12):");

        String engine = sc.nextLine();

        if(engine.equalsIgnoreCase("v6"))
            car.setEngineBehavior(new V6Engine());

        else if(engine.equalsIgnoreCase("v8"))
            car.setEngineBehavior(new V8Engine());

        else
            car.setEngineBehavior(new V12Engine());
    }

    private static void configureTurbo(Car car){

        System.out.println("Choose Turbo (alpine/cummins/honeywell):");

        String turbo = sc.nextLine();

        if(turbo.equalsIgnoreCase("alpine"))
            car.setTurboBehavior(new AlpineTurbo());

        else if(turbo.equalsIgnoreCase("cummins"))
            car.setTurboBehavior(new CumminsTurbo());

        else
            car.setTurboBehavior(new HoneywellTurbo());
    }

    public static Track createTrack(){

        TrackFactory factory = new TrackFactoryImpl();

        System.out.println("Choose Track (blue/bb/spa):");

        return factory.createTrack(sc.nextLine());
    }

    public static Race createRace(){

        System.out.println("Choose Race Type (sprint/circuit):");

        String raceType = sc.nextLine();

        if(raceType.equalsIgnoreCase("sprint"))
            return new SprintRace();

        return new CircuitRace();
    }
}