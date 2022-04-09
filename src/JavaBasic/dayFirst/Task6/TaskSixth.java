package JavaBasic.dayFirst.Task6;

import java.util.Scanner;
/*Napisz program, który wypisze poniższy kawałek tabliczki mnożenia np:
5 x 1 = 5
5 x 2 = 10
5 x 3 15
5 x 4 20
*
Zmodyfikuj metodę, tak aby wyświetlała powyższy kawałek tabliczki mnożenia dla zadanego
mnożnika i mnożnej (dwa parametry od do) zadanych jako parametry
Przykład
multiplier 6, multiplicandMin 2, multiplicandMax 5
6 x 2 = 12
6 x 3 = 18
6 x 4 = 24
6 x 5 = 30 */

public class TaskSixth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int multiplier = input.nextInt();
        int minMultiplicand = input.nextInt();
        int maxMultiplicand = input.nextInt();
        printMultiplicationTableWithFor(multiplier, minMultiplicand, maxMultiplicand);
    }

    private static void printMultiplicationTableWithFor(int multiplier, int minMultiplicand, int maxMultiplicand) {
        for (int i = minMultiplicand; i <= maxMultiplicand; i++) {
            int result = multiplier * i;
            System.out.println(multiplier + " x " + i + " = " + result);

        }
    }

    private static void printMultiplicationTableWithWhile(int multiplier, int minMultiplicand, int maxMultiplicand) {

        while (minMultiplicand <= maxMultiplicand) {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        }
    }

    private static void printMultiplicationTableWithDoWhile(int multiplier, int minMultiplicand, int maxMultiplicand) {

        do {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier + " x " + minMultiplicand + " = " + result);
            minMultiplicand++;
        } while (minMultiplicand <= maxMultiplicand);
    }
}



