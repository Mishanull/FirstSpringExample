package com.example.demo;

import java.util.ArrayList;
import java.util.Random;

public class RandomNameTest {

    private int number;

    public RandomNameTest( int number) {

        this.number = number;
    }

    public String getRandomMessage() {
        String[] messages = {"This the list of divisors from your number ", "Here are the diviz for your number ", "Nothing much , just a few divisors "};
        Random random = new Random();
        StringBuilder message = new StringBuilder(messages[random.nextInt(3)]);
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                message.append(i).append(" , ");
            }

        }
        return message.toString();

    }
}