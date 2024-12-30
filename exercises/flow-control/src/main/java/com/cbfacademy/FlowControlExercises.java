package com.cbfacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // Implement this method such that
      
        //  it creates a list where for each element of the input list ${numbers}
        List<String> fizzBuzzList = new ArrayList<>();
           //using for loop to check
        for (int i = 0; i < numbers.size()); i++ {
            interger number = numbers.get(i);{
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
       if  (number % 3 == 0) && (number % 5 == 0);{
        fizzBuzzList.add("“FizzBuzz”");
        else if (number % 3 == 0);{
            fizzBuzzList.add("Fizz");
        }
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
         else if {
            (number % 5 == 0);
                fizzBuzzList.add("Buzz");
        }
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
          else if {
           
          }
        //  - it adds the element to the list in any other case
        else {

            fizzBuzzList.add(number.toString);//convert interger to string
        }
           
        //  - it returns the constructed list
       {return fizzBuzzList;
   
        //throw new RuntimeException("Not implemented");
    }
    }
    public String whichMonth(Integer number) {
        // Implement this method such that
        //  - it returns the month corresponding to the input ${number}

        //  - if the ${number} is invalid, the method should return "Invalid month number"
        throw new RuntimeException("Not implemented");
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
        }
    }
