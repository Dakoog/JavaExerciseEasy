package JavaBasic.DayOne.Task5;

import java.util.Scanner;

/*
        Napisz program, który dla zadanych parametrów firstDigit i secondDigit (oba typu int), obliczy
        sumę liczb od firstDigit do secondDigit.
        Przykład:
        Please insert first digit: 4
        Please insert second digit: 11
        Sum: 60
 */
public class TaskFifth {

    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please insert first number: ");
        INPUT.nextInt();
        System.out.println("Please insert second number: ");
        INPUT.nextInt();
       // alternative methods
        int sum = sumOfTheSequenceWithForI();
        System.out.println(sum);

        int sum2 = sumOfTheSequenceWithWhile();
        System.out.println(sum2);

        int sum3 = sumOfTheSequenceWithDoWhile();
        System.out.println(sum3);

    }

    private static int getFirstNumber() {


    }

    private static int getSecondNumber() {


    }

    private static int sumOfTheSequenceWithForI() {

        int firstDigit = getFirstNumber();
        int secondDigit = getSecondNumber();

        if (firstDigit > secondDigit) {
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        int sum = 0;
        for (int i = firstDigit; i <= secondDigit; i++) {
            sum += i;
        }

        return sum;
    }

    private static int sumOfTheSequenceWithWhile(int firstNumber, int secondNumber) {

        int sum = 0;

        while(firstNumber <= secondNumber) {
            sum += firstNumber;
            firstNumber++;
        }
        return sum;
    }

    private static int sumOfTheSequenceWithDoWhile(int firstNumber, int secondNumber){

        int sum = 0;

        do {
            sum += firstNumber;
            firstNumber++;
        } while (firstNumber <= secondNumber);
        return sum;
    }
}
