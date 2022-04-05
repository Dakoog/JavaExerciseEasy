package JavaBasic.DayOne.Task11;

import java.util.Random;
import java.util.Scanner;

public class TaskEleventh {


    /*
            Napisz program, który będzie grał z użytkownikiem w „za dużo, za mało”
            a) W pierwszym kroku komputer losuje liczbę z zakresu od 0 d 100 skorzystaj z metody
            Random.nextInt
            b) Następnie czeka na podanie liczby przez użytkownika.
            c) Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer, program powinien
            wypisać too much” i czekać na podanie kolejnej liczby.
            Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „not enough i analogicznie czekać na następną liczbę.
            Jeśli podana wartość jest tą szukaną, to program powinien wypisać słowo BINGO i zakończyć się
            Example:
            Please insert digit:
            5
            Not enough
            Please insert digit
            15
            Too much
            Please insert digit 10
            Bingo!
            */
    public static void main(String[] args) {
        gameTooLowerOrTooUpper();

    }

    private static int drawnNaturalNumberNotGraterThanOneHundred() {
        Random r = new Random();
        return r.nextInt(100);
    }

    private static int getYourNumber() {
        Scanner input = new Scanner(System.in);

        return input.nextInt();
    }

    private static void gameTooLowerOrTooUpper() {
        String string = "";

        do {

            int number = drawnNaturalNumberNotGraterThanOneHundred();
            System.out.println("Please insert your number");
            int yourNumber = getYourNumber();
            if (yourNumber == number) {
                string = "Bingo";
                System.out.println(string);

            } else if (yourNumber > number) {
                string = "Too much";
                System.out.println(string);
            } else {
                string = "Not enough";
                System.out.println(string);
            }

        } while (!string.equalsIgnoreCase("Bingo"));

    }
}










