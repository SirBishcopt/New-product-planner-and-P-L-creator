package repositories;

import exceptions.ConfigDataException;
import exceptions.ConfigFileException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Configurator {


    private static int numberOfYearsPlanned;

    static {
        try (Stream<String> lines = Files.lines(Paths.get("src/config.txt"))) {
            List<String> configDataFromFile = lines.collect(Collectors.toList());
            String[] row1 = configDataFromFile.get(0).split(":");
            numberOfYearsPlanned = Integer.parseInt(row1[1]);
        } catch (IOException e) {
            throw new ConfigFileException("Błąd dostępowy pliku konfiguracyjnego.");
        } catch (NullPointerException | IndexOutOfBoundsException | NumberFormatException e) {
            throw new ConfigDataException("Błąd danych konfiguracyjnych.");
        }
    }

    public static int getNumberOfYearsPlanned() {
        return numberOfYearsPlanned;
    }

}