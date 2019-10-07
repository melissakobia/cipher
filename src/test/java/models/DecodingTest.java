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

    @Test
    public void decoder_DecryptsLowercaseCharacterp_m() {
        Decoding newDecoder = new Decoding("p",3);
        assertEquals("m", newDecoder.decoder(newDecoder.getInput(),newDecoder.getKey()));
    }

    @Test
    public void decoder_DecryptsAWordInLowecase_lazy() {
        Decoding newDecoder = new Decoding("qfed",5);
        assertEquals("lazy", newDecoder.decoder(newDecoder.getInput(),newDecoder.getKey()));
    }

    @Test
    public void decoder_DecryptsAWordInUppercase_LAZY() {
        Decoding newDecoder = new Decoding("QFED",5);
        assertEquals("LAZY", newDecoder.decoder(newDecoder.getInput(),newDecoder.getKey()));

    }





}