package java_basic.day_first.task10;
/*
    Napisz program, który pobierze od użytkownika liczbę całkowitą (typu int), a następnie obliczy
    sumę cyfr podanej liczby.
    Przykład:
    Please insert digit: 123
    Sum Of Digits: 6
    Please insert digit: 6
    Sum Of Digits: 6
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class TaskTenth {
    public static void main(String[] args) {

        int number;
        do {
            // if number is double or float
            try {
                number = getNumber();
            } catch (InputMismatchException ime) {
                number = -1;
            }
            // if number is negative value
            if (number < 0) {
                System.out.println("This isn't a natural number");
            }

        } while (number < 0);// use when number is negative value

          // calculate sum of digits given number
        int DigitsSum = sumOfDigitWithNumber(number);
        System.out.println("The sum of the digits of the number " + number + " is " + DigitsSum);

    }



// download number for user
    private static int getNumber() {
        System.out.println("Please insert natural number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
// calculate calculate sum of digits given number
    private static int sumOfDigitWithNumber(int number) {
        int sum = 0;
        int digit;

        do {
            digit = number % 10;
            sum += digit;
            number = (number - digit) / 10;


        } while (digit != 0);

        return sum;
    }
}
