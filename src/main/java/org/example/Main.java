package org.example;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.example.SearchAirport.readLinesFromFileByNumbers;

public class Main {

    public static void main(String[] args) throws IOException {

        SearchAirport searchAirport = new SearchAirport();
        String path = "classes/airports.csv";
        List<Airport> airportList = searchAirport.readCSV(path, Integer.parseInt(args[0]));

        //Collections.sort(airportList);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите строку:");
            String s = scanner.nextLine();
            if (s.equals("!quit")) {
                break;
            }
            long start = System.currentTimeMillis();
            List<Airport> searchResult = searchAirport.searchArrayList(airportList, s);

            List<Result> results = readLinesFromFileByNumbers(path, searchResult);
            long finish = System.currentTimeMillis();
            long elapsed = finish - start;
            Collections.sort(results);
            for (Result str : results) {
                str.Output();
            }
            System.out.println("Колличество найденных строк: " + results.size() + " Время затраченное на поиск: " + elapsed);
        }

    }




}