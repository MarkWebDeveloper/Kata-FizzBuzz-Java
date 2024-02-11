package com.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Numbers numbers = new Numbers(100);

        numbers.numbersArray.forEach((number) -> fizzBuzz.fizzbuzzArray.add(fizzBuzz.replaceNumber(number)));

        System.out.println(fizzBuzz.fizzbuzzArray);
    }
}
