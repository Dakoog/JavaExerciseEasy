package JavaBasic.DayOne.Task10;
/*
    Napisz program, który pobierze od użytkownika liczbę całkowitą (typu int), a następnie obliczy
    sumę cyfr podanej liczby.
    Przykład:
    Please insert digit: 123
    Sum Of Digits: 6
    Please insert digit: 6
    Sum Of Digits: 6
*/

import java.util.Scanner;

public class TaskTenth {
    public static void main(String[] args) {
        int number = getNumber();
        int DigitsSum = sumOfDigitWithNumber(number);
        System.out.println("The sum of the digits of the number " + number + " is " + DigitsSum);

    }

    private static int getNumber() {
        System.out.println("Please insert number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

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
