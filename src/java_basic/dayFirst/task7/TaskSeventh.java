package java_basic.dayFirst.task7;

import java.util.Scanner;
    /*
    Napisz program realizujący prosty kalkulator Program powinien
    a) pobrać pierwszą liczbę (typu float
    b) pobrać jeden ze znaków
    c)pobrać drugą liczbę (typu float
    d) zwrócić wynik pobranego działania
    * Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać Operator not exist i zakończyć program
    * Jeśli wpisanego działania nie da się zrealizować (tj jest niezgodne z zasadami matematyki), to
    program powinien wypisać napis Wrong operation
    * * *
    Dodaj funkcjonalność, która pozwoli na wielokrotne wykonywanie działań, a z akończenie działania programu nastąpi po wpisaniu tekstu */

public class TaskSeventh {
    private static final String STOP_DECISION = "Stop";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String decision;
        do {
            System.out.print("Please insert firstDigit: ");
            float firstDigit = scanner.nextFloat();
            scanner.nextLine();

            System.out.print("""
                    Please insert operator
                    + - add
                    - - difference
                    * - product
                    : - quotient
                    pwr - power
                    """);
            String operator = scanner.nextLine();

            System.out.print("Please insert secondDigit: ");
            float secondDigit = scanner.nextFloat();
            scanner.nextLine();

            float result = calculate(firstDigit, secondDigit, operator);
            System.out.println("Result: " + result);

            System.out.print("New calculation or Stop? ");
            decision = scanner.nextLine();
        } while (!STOP_DECISION.equals(decision));
    }


    private static float calculate(float firstDigit, float secondDigit, String operator) {
        float result=0;
        switch (operator) {
            case "+" -> {
                System.out.println(firstDigit + " + " + secondDigit);
                result= firstDigit + secondDigit;
            }
            case "-" -> {
                System.out.println(firstDigit + " - " + secondDigit);
               result = firstDigit - secondDigit;
            }
            case "*" -> {
                System.out.println(firstDigit + " * " + secondDigit);
                result= firstDigit * secondDigit;
            }
            case "/" -> {
                System.out.println(firstDigit + " : " + secondDigit);

                if (secondDigit == 0) {
                    System.out.println("Wrong operation");

                } else
                    result= firstDigit / secondDigit;
            }
            case "pwr" -> {
                System.out.println(firstDigit + " ^ " + secondDigit);
                if (secondDigit <= 0) {
                    System.out.println("Wrong operation");
                }
                result = (float) Math.pow(firstDigit, secondDigit);
            }
            default -> System.out.println("Operator not exist");
        }
        return result;
    }
}