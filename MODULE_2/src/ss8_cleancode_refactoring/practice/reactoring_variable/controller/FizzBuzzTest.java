package ss8_cleancode_refactoring.practice.reactoring_variable.controller;

import org.junit.Assert;
import ss8_cleancode_refactoring.practice.reactoring_variable.model.FizzBuzz;

public class FizzBuzzTest {

    void testFizz3() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals(expected, result);
    }

    void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals(expected, result);
    }

    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals(expected, result);
    }

    void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals(expected, result);
    }

    void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals(expected, result);
    }

    void testFizzBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        Assert.assertEquals(expected, result);
    }
}
