package JavaBasic.DayOne;

import java.util.Scanner;

/*
        Napisz program, który dla zadanych parametrów firstDigit i secondDigit (oba typu int), obliczy
        sumę liczb od firstDigit do secondDigit.
        Przykład:
        Please insert first digit: 4
        Please insert second digit: 11
        Sum: 60
 */
public class TaskFivth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert first Digit: ");
        int firstDigit = input.nextInt();
        System.out.println("Please insert second Digit: ");
        int secondDigit = input.nextInt();
        int sum = sumOfTheSequenceWithForI(firstDigit, secondDigit);
        System.out.println(sum);

    }

    private static int sumOfTheSequenceWithForI(int firstDigit, int secondDigit) {
        if(firstDigit > secondDigit) {
            int tmp = firstDigit;
            firstDigit = secondDigit;
            secondDigit = tmp;
        }
        int sum = 0;
        for(int i = firstDigit; i <= secondDigit; i++) {
            sum += i;
        }

//        for(;firstDigit <= secondDigit; firstDigit++) {
//            sum += firstDigit;
//        }

//        while(firstDigit <= secondDigit) {
//            sum +=firstDigit;
//            firstDigit++;
//        }

//        do {
//            sum +=firstDigit;
//            firstDigit++;
//        } while(firstDigit <= secondDigit);

        return sum;
    }
    private static int sumOfTheSequenceWithWhile(int firstDigit, int secondDigit) {
        int sum =0;
       while (firstDigit<=secondDigit){
           sum+=secondDigit;
       }
       return sum;
    }
}
