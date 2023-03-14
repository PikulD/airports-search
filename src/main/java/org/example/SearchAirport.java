package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SearchAirport {
    public List<Airport> readCSV(String filePath, int column) {
        List<Airport> airports = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                int numberLine = Integer.parseInt(values[0]);
                String properties = values[column-1];
                airports.add(new Airport(numberLine, properties));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return airports;
    }

    public List<Airport> searchArrayList(List<Airport> list, String searchTerm) {
        List<Airport> searchResult = new ArrayList<>();
        for (Airport s : list) {
            if (s.getProperties().toLowerCase().startsWith('\"'+searchTerm.toLowerCase())||
                    s.getProperties().toLowerCase().startsWith(searchTerm.toLowerCase())) {
                searchResult.add(new Airport(s.getLine(),s.getProperties()));
            }
        }
        return searchResult;
    }
    public static List<Result> readLinesFromFileByNumbers(String filename, List<Airport> airports) throws IOException {
        File file = new File(filename);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        List<Result> results = new ArrayList<>();
        String line;
        int airNumber = 0;
        while ((line = reader.readLine()) != null ) {

            String[] lin = line.split(",");
            int l = Integer.parseInt(lin[0]);
            if (airNumber== airports.size()) break;
            if (l==airports.get(airNumber).getLine()){
                results.add(new Result(airports.get(airNumber).getProperties(),line));
                airNumber++;
            }
        }
        reader.close();
        return results;
    }
}
