package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class EncodingTest {
    @Test
    public void newEncoder_instantiatesCorrectly() {
        Encoding newEncoder = new Encoding("word",3,"output");
        assertEquals(true, newEncoder instanceof Encoding);

    }

    @Test
    public void newEncoder_getsInput() {
        Encoding newEncoder = new Encoding("word",3,"output");
        assertEquals("word", newEncoder.getInput());
    }


}