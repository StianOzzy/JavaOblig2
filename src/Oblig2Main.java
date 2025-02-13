import Unrunable.Episode;
import Unrunable.TVSeries;

import java.time.LocalDate;
import java.util.Random;

public class Oblig2Main {

    public static void main(String[] args) {

        // Oppgave 2.2 - Opprette objekter
        // Creating a TVSeries object
        TVSeries GameOfThrones = new TVSeries("Game of Thrones", "A great show", LocalDate.of(2011,4,17));

        // Testing the TVSeries object in a print
        System.out.println("\n" + GameOfThrones);
        System.out.println("\n(TVSeries object has no episodes)");

        // Oppgave 2.4 - Hente episoder i sesong // Oppgave 2.6 - Generere tilfeldig spilletid
        // Loops for adding episodes
        int seasonCounter = 1;
        while (seasonCounter < 6) {
            int epCounter = 1;
            while (epCounter < 11) {
                String currentEpisodeName = "GoT_S" + seasonCounter + "E" + epCounter;
                Episode ep = new Episode(currentEpisodeName,epCounter,seasonCounter,new Random().nextInt(20, 30));
                GameOfThrones.addEpisode(ep);
                epCounter++;
            }
            seasonCounter++;
        }

        // Testing the Episode Objects, to see if they were added to the TVSeries object
        System.out.println("\n" + GameOfThrones);
        System.out.println("\n(TVSeries object now has episodes)");

        // Testing the Episode Objects in a separate print, to see if naming was done correctly.
        System.out.println("\n" + GameOfThrones.getEpisodes());

        // Oppgave 2.3 - Utskrift og toString()
        // Testing @Override toString() functionality
        System.out.println(GameOfThrones.toString());
        System.out.println(GameOfThrones.getEpisodes().get(0).toString());

        // Oppgave 2.4 - Hente episoder i sesong
        System.out.println("\n(Print episodes from season 4)");
        System.out.println(GameOfThrones.getEpisodesInSeason(4));

        // Oppgave 2.5 - Gjennomsnittlig spilletid // Oppgave 2.6 - Generere tilfeldig spilletid
        System.out.println("\n(Getting the average runtime of the episodes)");
        System.out.println(GameOfThrones.getAverageRunTime());

        // Oppgave 2.8 - "Teste" antall sesonger
        System.out.println("\n(Attemt to add episode in season 7, when season 6 is missing)");
        Episode exampleEpisode1 = new Episode("GoT_S7E1",1,7,new Random().nextInt(20, 30));
        GameOfThrones.addEpisode(exampleEpisode1);
        System.out.println("Number of seasons: " + GameOfThrones.getNumSeasons());


        System.out.println("\n(Adding episode in season 6...)");
        Episode exampleEpisode2 = new Episode("GoT_S6E1",1,6,new Random().nextInt(20, 30));
        GameOfThrones.addEpisode(exampleEpisode2);

        System.out.println("Number of seasons: " + GameOfThrones.getNumSeasons());
        System.out.println("\n(Attemt to add episode in season 7, when season 6 is present)");
        GameOfThrones.addEpisode(exampleEpisode1);
        System.out.println("Number of seasons: " + GameOfThrones.getNumSeasons());


    }

}
