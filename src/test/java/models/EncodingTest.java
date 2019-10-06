package models;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class EncodingTest {
    @Test
    public void newEncoder_instantiatesCorrectly() {
        Encoding newEnconcoder = new Encoding("word",3,"output");
        assertEquals(true, newEnconcoder instanceof Encoding);

    }
}