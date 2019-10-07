package models;

public class Decoding {

    private String input;
    private int key;


    public Decoding(String input, int key) {
        this.input = input;
        this.key = key;

    }

    public String getInput() {
        return this.input;
    }

    public int getKey() {
        return this.key;
    }


    public String decoder(String input, int key) {
        Character[] alphabetsUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Character[] alphabetsLower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int length = input.length();

        //Loops through the string
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < length; index++) {

            char letter = input.charAt(index);

            //Checks whether the character is a letter and in uppercase

            if (Character.isLetter(letter) && Character.isUpperCase(letter)) {
                //Loops through the alphabets characters in an array
                for (char alphabet : alphabetsUpper) {
                    //Checks whether the alphabet and the letter are similar
                    if (alphabet == letter) {
                        char newAlphabet = (char) ((alphabet - key - 'Z') % 26 + 'Z');
                        result.append(newAlphabet);

                    }
                }

            }
            else if (Character.isLetter(letter) && Character.isLowerCase(letter)) {
                for (int i = 0; i < alphabetsLower.length; i++) {
                    char alphabet = alphabetsLower[i];
                    if (alphabet == letter) {
                        char newAlphabet = (char) ((alphabet - key - 'z') % 26 + 'z');

                        result.append(newAlphabet);

                    }
                }

            }
            else if (letter == ' ') {
                result.append(letter);
            }

        }
        return result.toString();

    }

}
