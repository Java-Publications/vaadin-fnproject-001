package org.rapidpm.fnproject.helloworld;

public class HelloFunction {

    public String handleRequest(String input) {
        String name = (input == null || input.isEmpty()) ? "world"  : input;
        return "Hello, " + name + "!" + System.getProperty("line.separator");
    }
}