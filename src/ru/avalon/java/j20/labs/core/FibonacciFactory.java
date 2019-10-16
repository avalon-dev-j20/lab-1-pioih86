package ru.avalon.java.j20.labs.core;

import ru.avalon.java.j20.labs.models.Fibonacci;

public class FibonacciFactory implements Factory<Fibonacci, Integer> {

    @Override
    public Fibonacci getInstance(Integer amount) {
        if (amount < 2) {
            throw new IllegalArgumentException("Wrong array size");
        }
        int[] array = new int[amount];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < amount; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return new Fibonacci(array);
    }
}
