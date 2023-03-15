package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SearchAirport {
    public List<Airport> readAndSearchCSV(String filePath, int column, String searchTerm) {
        List<Airport> airports = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (propertyStartWithInput(values[column-1],searchTerm)){
                    airports.add(new Airport(values[column-1], line));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return airports;
    }
    private boolean propertyStartWithInput(String property, String input) {
        return property.toLowerCase().startsWith('\"'+input.toLowerCase())||
                property.toLowerCase().startsWith(input.toLowerCase());
    }
}
