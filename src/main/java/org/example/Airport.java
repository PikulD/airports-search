package org.example;

public class Airport {
    private Integer line;
    private String properties;

    public Airport(int line, String properties) {
        this.line = line;
        this.properties = properties;
    }

    public Integer getLine() {
        return line;
    }

    public String getProperties() {
        return properties;
    }

}
