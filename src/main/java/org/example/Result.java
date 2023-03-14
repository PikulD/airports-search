package org.example;

public class Result implements Comparable<Result>{
    private String field;
    private String line;

    public String getField() {
        return field;
    }

    public Result(String field, String line) {
        this.field = field;
        this.line = line;
    }

    public void Output (){
        System.out.println(field+ '['+line+']');
    }


    @Override
    public int compareTo(Result o) {
        return field.compareTo(o.getField());
    }
}
