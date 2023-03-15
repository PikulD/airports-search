package org.example;

public class Airport{
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

}
