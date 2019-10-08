import models.Decoding;
import models.Encoding;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("WELCOME TO CEASER CIPHER");
        System.out.println("");


        System.out.println("Enter a text : ");
        String inputString = myScanner.nextLine();

        System.out.println("Enter a key value: ");
        String keyString = myScanner.nextLine();
        Integer keyInt = Integer.parseInt(keyString);

        Encoding newEncoder = new Encoding(inputString, keyInt);

        Decoding newDecoder = new Decoding(inputString, keyInt);
        String encryptText = newEncoder.encoder(newEncoder.getInput(),newEncoder.getKey()) ;


        System.out.println("PLAIN TEXT: " + inputString);

        System.out.println("ENCRYPTED TEXT: "+ encryptText);

        System.out.println("DECRYPTED TEXT: "+ newDecoder.decoder(encryptText,newDecoder.getKey()));


    }

}


















