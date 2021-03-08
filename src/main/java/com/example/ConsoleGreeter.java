package com.example;

public class ConsoleGreeter {

  public void greet(final Greeting greeting) {
    final String string = greeting.get();
    System.out.println(string);
  }
}
