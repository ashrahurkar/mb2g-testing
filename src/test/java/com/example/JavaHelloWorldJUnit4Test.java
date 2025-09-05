package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class JavaHelloWorldJUnit4Test {

    @Test
    public void testGetHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        assertEquals("Hello World", helloWorld.getHello());

    }
}
