package com.example;

// for Junit4 no depencies need to be added and pojo tests will run with Surefire plugin out of the box
public class JavaHelloWorldTest {

    public void testGetHello() {
        JavaHelloWorld helloWorld = new JavaHelloWorld();
        assert("Hello World".equals(helloWorld.getHello()));
    }
}
