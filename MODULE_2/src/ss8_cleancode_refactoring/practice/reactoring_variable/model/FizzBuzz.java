package ss8_cleancode_refactoring.practice.reactoring_variable.model;

public class FizzBuzz {
        public static String fizzBuzz(int number){
            final boolean isDivisible = number % 3 == 0;
            final boolean isDivisible5 = number % 5 == 0;
            if(isDivisible && isDivisible5)
                return "FizzBuzz";

            if(isDivisible)
                return "Fizz";

            if(isDivisible5)
                return "Buzz";

            return number + "";
        }
    }

