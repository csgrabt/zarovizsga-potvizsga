package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class People {
    public int getNumberOfMales(String s) {
        Path path = Path.of(s);
        int counter = 0;
        try (BufferedReader bf = Files.newBufferedReader(path)) {

            String line;
            bf.readLine();
            while ((line = bf.readLine()) != null) {
                String[] array = line.split(",");
                if ("Male".equals(array[4])) {
                    counter++;
                }

            }


        } catch (IOException ioe) {
            throw new IllegalArgumentException("Something went wrong!", ioe);
        }


        return counter;
    }
}
