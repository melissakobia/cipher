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

    @Test
    public void newEncoder_getsKey() {
        Encoding newEncoder = new Encoding("word",3,"output");
        assertEquals(3, newEncoder.getKey());
    }

    @Test
    public void newEncoder_getsOutput() {
        Encoding newEncoder = new Encoding("word",3,"output");
        assertEquals("output", newEncoder.getOutput());
    }
}