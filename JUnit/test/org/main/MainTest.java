package org.main;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void isAllBeginningWithA() {
        String [] goodInput = {"Apple", "asdfsd"};
        assertTrue(Main.isAllBeginningWithA(goodInput));

        String [] badInput = {"Apple", "ADFSDF", "cachorro"};
        assertFalse(Main.isAllBeginningWithA(badInput));
    }
}