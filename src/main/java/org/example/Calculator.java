package org.example;

public class Calculator {
    private int number;

    private Calculator(int number) {
        this.number = number;

    }

    private int add(int other) {
        return this.number + other;

    }
}
