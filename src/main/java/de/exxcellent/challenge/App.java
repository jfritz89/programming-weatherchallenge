package de.exxcellent.challenge;

import java.io.FileNotFoundException;

/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) throws FileNotFoundException {

        // Your preparation code …

        String dayWithSmallestTempSpread = challenge.GetDifferenz.getDifferenz("weather.csv","Weatherdata"); //challenge.Weatherdata.weatherdata();  // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = challenge.GetDifferenz.getDifferenz("football.csv","Footballteams"); //challenge.Football.footballteam(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
