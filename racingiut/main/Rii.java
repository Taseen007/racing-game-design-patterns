package main;

import player.Player;
import factory.GameSetup;
import car.Car;
import track.Track;
import race.Race;

import java.util.Scanner;

public class Rii {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter Player Name:");
            Player player = Player.getInstance(sc.nextLine());

            player.playerInfo();

            Car car = GameSetup.createCar();
            Track track = GameSetup.createTrack();
            Race race = GameSetup.createRace();

            race.race(car, track);
        } finally {
            sc.close();
        }
    }
}