package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EncodingTest {
    @Test
    public void newEncoder_instantiatesCorrectly() {
        Encoding newEncoder = new Encoding("word",3);
        assertEquals(true, newEncoder instanceof Encoding);

    }

    @Test
    public void newEncoder_getsInput() {
        Encoding newEncoder = new Encoding("word",3);
        assertEquals("word", newEncoder.getInput());
    }

    @Test
    public void newEncoder_getsKey() {
        Encoding newEncoder = new Encoding("word",3);
        assertEquals(3, newEncoder.getKey());
    }
    

    @Test
    public void encoder_EncryptsUppercaseCharacterA_D() {
        Encoding newEncoder = new Encoding("A",3);
        assertEquals("D", newEncoder.encoder(newEncoder.getInput(),newEncoder.getKey()));

    }

    @Test
    public void encoder_EncryptsLowercaseCharacterm_p() {
        Encoding newEncoder = new Encoding("m",3);
        assertEquals("p", newEncoder.encoder(newEncoder.getInput(),newEncoder.getKey()));
    }



}