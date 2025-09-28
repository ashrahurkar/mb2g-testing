package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JavaHelloWorldJUnit5Test {

    @Test
    public void getHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        assertEquals("Hello World", helloWorld.getHello());
    }

    @Test
    public void getHello2(){
        System.out.println("################");
        System.out.println(System.getenv("TEST_HOST"));
    }
}
