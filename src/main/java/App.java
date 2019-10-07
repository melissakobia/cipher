import models.Encoding;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter a text to encrypt: ");
        String inputString = myScanner.nextLine();

        System.out.println("Enter a key value: ");
        String keyString = myScanner.nextLine();
        Integer keyInt = Integer.parseInt(keyString);

        Encoding newEncoder = new Encoding(inputString, keyInt);

        System.out.println("ENCRYPTED TEXT: "+newEncoder.encoder(newEncoder.getInput(),newEncoder.getKey()));


    }

}


















