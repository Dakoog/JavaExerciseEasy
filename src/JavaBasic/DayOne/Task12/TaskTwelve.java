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

        System.out.println("Please insert twice numbers a and b");

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();


        int modulo = ownMethodForCalculateModuloTwiceNumbers(firstNumber, secondNumber);
        System.out.println("The remainder of dividing " + firstNumber + " by " + secondNumber + " is " + modulo);

        boolean check = ifOwnModuloImplementationIsCorrect(firstNumber, secondNumber);
        System.out.println(check);

    }


    private static int ownMethodForCalculateModuloTwiceNumbers(int a, int b) {

        return a - (a / b) * b;
    }

    private static boolean ifOwnModuloImplementationIsCorrect(int a, int b) {
        return ownMethodForCalculateModuloTwiceNumbers(a, b) == a % b;
    }
}
