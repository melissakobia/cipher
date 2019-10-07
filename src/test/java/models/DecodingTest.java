package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DecodingTest {
    @Test
    public void newDecoder_instantiatesCorrectly() {
        Decoding newDecoder = new Decoding("word",3);
        assertEquals(true, true);

    }

    @Test
    public void newDecoder_getsInput() {
        Decoding newDecoder = new Decoding("word",3);
        assertEquals("word", newDecoder.getInput());
    }

    @Test
    public void newDecoder_getsKey() {
        Decoding newDecoder = new Decoding("word",3);
        assertEquals(3, newDecoder.getKey());
    }

    @Test
    public void decoder_DecryptsUppercaseCharacterD_A() {
        Decoding newDecoder = new Decoding("D",3);
        assertEquals("A", newDecoder.decoder(newDecoder.getInput(),newDecoder.getKey()));

    }


}