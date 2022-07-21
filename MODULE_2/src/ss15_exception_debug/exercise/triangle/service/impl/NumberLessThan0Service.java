package ss15_exception_debug.exercise.triangle.service.impl;

public class NumberLessThan0Service extends Exception{
    public NumberLessThan0Service(String message) {
        super(message);
    }
}
