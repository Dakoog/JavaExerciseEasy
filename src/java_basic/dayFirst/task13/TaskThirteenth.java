package java_basic.dayFirst.task13;

import java.util.Scanner;

public class TaskThirteenth {

    private static final Scanner INPUT = new Scanner(System.in);

    /*
                Napisz program, który wczytuje od użytkownika liczby całkowite, do momentu aż zostanie
              podana liczba 0 (wartość ta jest pomijana w dalszych operacjach), następnie wyliczy i wyświetli
              a)średnią arytmetyczną podanych liczb
              b)ilość wszystkich podanych liczb
              c) ilość liczb parzystych
              Przykład:
              Please insert digit 2
              Please insert digit 4
              Please insert digit 5
              Please insert digit 10
              Please insert digit 0
              Total Number Of Digits 4
              Total Number Of Even Digits 3
              Arithmetic Average 5 25
        */
    public static void main(String[] args) {
        getNumbers();
    }

    private static void getNumbers() {
        int number = 0;
        int sum = 0;
        int counter = 0;
        int counterEvenNumbers = 0;
        do {
            System.out.println("Please insert number." +
                    "\n When you want to quit -> insert 0");
            number = INPUT.nextInt();
            sum += number;// sum all numbers
            counter++;// counter for all numbers

            // counter for even numbers
            if (number % 2 == 0) {
                counterEvenNumbers++;
            }
        } while (number != 0);
        System.out.println("Total number of Digits it:" + (counter - 1));
        System.out.print("Total number of Even Digits it:" + " is " + (counterEvenNumbers - 1));
        System.out.println("\nArithmetic Average with numbers is " + 1.0 * sum / (counter - 1));
    }

}


