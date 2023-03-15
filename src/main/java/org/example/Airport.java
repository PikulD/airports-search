package org.example;

public class Airport{
    private final String properties;

    private final String line;
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
    public void output (){
        System.out.println(properties + '['+line+']');
    }

    @Override
    public String toString() {
        return properties + '['+line+']'+'\n';
    }
}
