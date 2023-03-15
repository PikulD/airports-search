package org.example;

public class Airport implements Comparable<Airport>{
    private String properties;
    private String line;
    public Airport(String properties, String line) {
        this.properties = properties;
        this.line = line;
    }
    public String getProperties() {
        return properties;
    }
    public String getLine() {
        return line;
    }
    public void Output (){
        System.out.println(properties + '['+line+']');
    }

    @Override
    public int compareTo(Airport o) {
        return properties.compareTo(o.getProperties());
    }
}
