package org.example;

import java.io.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        SearchAirport searchAirport = new SearchAirport();
        String path = "src/main/resources/airports.csv";


        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку:");
            String inputLine = scanner.nextLine();
            if (inputLine.equals("!quit")) {
                break;
            }
            long start = System.currentTimeMillis();
            List<Airport> airports =searchAirport.readAndSearchCSV(path, 2,inputLine);
            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            Collections.sort(airports);


            for (Airport airport : airports) {
                airport.Output();
            }
            System.out.println("Колличество найденных строк: " + airports.size() + " Время затраченное на поиск: " + elapsed);
        }

    }




}