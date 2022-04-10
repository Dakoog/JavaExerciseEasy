package java_basic.dayFirst.task14;


import java_basic.new_method.RoundsNumbers;

import java.util.Scanner;

/*
Napisz program, który na podstawie zmiennych kwota double oraz ilość rat int obliczał
będzie miesięczną kwotę raty pożyczki, a następnie wypisywał ją w konsoli.
Parametry posiadają, pewne ograniczenia, które powinieneś uwzględnić w programie
a) kwota pożyczki musi mieścić się w przedziale od 100 00 zł do 10 000 00 zł
b)liczba rat musi mieścić się w przedziale od 6 do 48
c) w przypadku wykroczenia kwoty pożyczki poza akceptowalny przedział, kwota pożyczki
powinna być ustawiona na 5 000 00 zł W przypadku podania zbyt małej kwoty, kwota pożyczki
powinna być ustawiona na 1000 00 zł
d) W przypadku wykroczenia ilości rat poza akceptowalny przedział, ilość rat powinna być
ustawiona na 36 W przypadku podania zbyt małej ilości, ilość rat powinna być ustawiona na 18.
Obliczona miesięczna rata powinna zawierać również odsetki.
Dla uproszczenia przyjmij, że do kwoty pożyczki doliczasz x procent w zależności od ilości rat:
6-12 rat -> 2,5%
13-24 rat->5,0%
25=48 rat->10,0
a następny krok to obliczenie kwoty raty na podstawie ilości rat
    */
public class TaskFourteenth {
    private static final double LOW_INTEREST_RATE = 1.025;
    private static final double HIGH_INTEREST_RATE = 1.1;
    private static final double AVERAGE_INTEREST_RATE = 1.05;
    private static final Scanner INPUT = new Scanner(System.in);




    public static void main(String[] args) {

        System.out.println("The amount of your monthly loan installment is " + amountOfMonthlyLoanInstallment() + " PLN.");
    }

    private static int getNumberOfInstallments() {
        System.out.println("Please insert number of installments for your loan.");
        return INPUT.nextInt();
    }

    private static double getLonaAmount() {
        System.out.println("Please insert amount of the loan.");
        return INPUT.nextDouble();
    }

    private static double loanAmount() {
        double cash = getLonaAmount();
        if (cash > 10000) {
            cash = 5000;
        }
        if (cash < 100) {
            cash = 1000;
        }

        return cash;
    }

    private static int calculateNumberOfInstallments() {
        int numberOfInstallments = getNumberOfInstallments();
        if (numberOfInstallments > 48) {
            numberOfInstallments = 36;
        }
        if (numberOfInstallments < 6) {
            numberOfInstallments = 18;
        }
        return numberOfInstallments;
    }

    private static double amountOfMonthlyLoanInstallment() {
        double cash = loanAmount();
        double monthlyInstallment = 0;

        int numberOfInstallments = calculateNumberOfInstallments();
        if (numberOfInstallments >= 25) {
            monthlyInstallment = cash * HIGH_INTEREST_RATE / numberOfInstallments;
            return RoundsNumbers.hundredths(monthlyInstallment);
        }
        if (numberOfInstallments >= 13) {
            monthlyInstallment = cash * AVERAGE_INTEREST_RATE / numberOfInstallments;
            return RoundsNumbers.hundredths(monthlyInstallment);
        }
        if (numberOfInstallments >= 6) {
            monthlyInstallment = cash * LOW_INTEREST_RATE / numberOfInstallments;
            return RoundsNumbers.hundredths(monthlyInstallment);
        }
        return cash;

    }
}


