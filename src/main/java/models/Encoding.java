package models;

public class Encoding {

    private String input;
    private int key;
    private String output;

    public Encoding(String input,int key, String output) {
        this.input = input;
        this.key = key;
    }

    public String getInput() {
        return this.input;
    }

    public int getKey() {
        return this.key;
    }


}
