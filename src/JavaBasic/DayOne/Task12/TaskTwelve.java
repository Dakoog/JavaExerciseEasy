package JavaBasic.DayOne.Task12;

import java.util.Scanner;

public class TaskTwelve {
    /*
    Załóżmy, że nie wiesz, że istnieje operator a potrzebujesz wyliczyć resztę z dzielenia dwóch
    liczb Napisz własną wersję funkcji modulo
    Przykład
    private static int ownModuloImplementation int a, int b)
    a 2 b 4
    Result
    of 2 4 2
    Result
    of 4 2 0
    *
    Napisz funkcję, która będzie sprawdzała, czy napisana w poprzednim zadaniu funkcja zwraca
    dokładnie takie same wyniki jak operator Przetestuj dla różnych przypadków
    Przykład
    private static boolean ifOwnModuloImplementationIsCorrect (int a, int b)
*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please insert twice numbers a and b when a >= b ");
        int firstNumber;
        int secondNumber;

        do {
            System.out.println("Remember a >= b!");
            firstNumber = input.nextInt();
            secondNumber = input.nextInt();
        }
        while (firstNumber < secondNumber);

        int modulo = ownMethodForCalculateModuloTwiceNumbers(firstNumber, secondNumber);
        System.out.println("The remainder of dividing " + firstNumber + " by " + secondNumber + " is " + modulo);
        
        boolean check = ifOwnModuloImplementationIsCorrect(firstNumber, secondNumber);
        System.out.println(check);
    }


    private static int ownMethodForCalculateModuloTwiceNumbers(int a, int b) {
        int modulo = 0;
        if (a >= b) {
            modulo = a - (a / b) * b;
        } else {
            System.out.println("You insert wrong number ");
        }
        return modulo;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return ownMethodForCalculateModuloTwiceNumbers(a, b) == a % b;
    }
}
