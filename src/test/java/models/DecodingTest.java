package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodingTest {
    @Test
    public void newDecoder_instantiatesCorrectly() {
        Decoding newDecoder = new Decoding("word",3);
        assertEquals(true, true);

    }



}