package org.example;

import java.util.Comparator;

public class AirportComparator implements Comparator<Airport> {
    @Override
    public int compare(Airport airport1, Airport airport2) {
        String properties1 = airport1.getProperties();
        String properties2 = airport2.getProperties();
        try {
            // Попытаемся преобразовать значения поля properties в числа
            double propertiesValue1 = Double.parseDouble(properties1);
            double propertiesValue2 = Double.parseDouble(properties2);
            // Если оба значения являются числами, сравниваем их как числа
            return Double.compare(propertiesValue1, propertiesValue2);
        } catch (NumberFormatException e) {
            // Если хотя бы одно значение не является числом, сравниваем их как строки
            return properties1.compareTo(properties2);
        }
    }
}