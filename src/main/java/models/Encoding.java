package models;

public class Encoding {

    private String input;
    private int key;
    private String output;

    public Encoding(String input, int key) {
        this.input = input;
        this.key = key;

    }

    public String getInput() {
        return this.input;
    }

    public int getKey() {
        return this.key;
    }

    public String getOutput() {
        return this.output;
    }


    public String encoder(String input, int key) {
        Character[] alphabetsUpper = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        Character[] alphabetsLower = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        int length = input.length();

        //Loops through the l
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < length; index++) {

            char letter = input.charAt(index);

            if (Character.isLetter(letter) && Character.isUpperCase(letter)) {
                for (char alphabet : alphabetsUpper) {
                    if (alphabet == letter) {
                        char newAlphabet = (char) ((alphabet + key - 'A') % 26 + 'A');
                        result.append(newAlphabet);

                    }
                }

            }
            else if (Character.isLetter(letter) && Character.isLowerCase(letter)) {
                for (int i = 0; i < alphabetsLower.length; i++) {
                    char alphabet = alphabetsLower[i];
                    if (alphabet == letter) {
                        char newAlphabet = (char) ((alphabet + key - 'a') % 26 + 'a');
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
