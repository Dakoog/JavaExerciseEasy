package JavaBasic.DayOne.Task3;

import java.util.Scanner;

public class TaskThird {

    private static final Scanner INPUT = new Scanner(System.in);

    /*
            Napisz program, który pobierze od użytkownika dwie zmienne x i y (typu int).
            Następnie, za pomocą operatorów logicznych i matematycznych wyświetli wynik następujących zapytań:
            a) Czy x jest większe od y?
            b) Czy x pomnożone przez 3 jest większe od y?
            c) czy y++ jest mniejsze od ++x i jednocześnie --x jest mniejsze od y++?
            d) Czy iloczyn liczb x i y jest parzysty
            */
    public static void main(String[] args) {
        int x = getValueX();
        int y = getValueY();
        System.out.println(isXUpperThanY(x,y));
        System.out.println(isTripleXHiggerThanY(x,y));
        System.out.println(isPre_incrementationXOrPost_incrementationY(x,y));
        System.out.println(isProductXAndYEven(x,y));

    }

    private static int getValueX() {

        System.out.println("Please insert value x = ");

        return INPUT.nextInt();
    }

    private static int getValueY() {
        System.out.println("Please insert value y= ");
        return INPUT.nextInt();
    }

    private static boolean isXUpperThanY(int x, int y) {
        return x > y;
    }

    private static boolean isTripleXHiggerThanY(int x, int y) {
        return 3 * x > y;
    }

    private static boolean isPre_incrementationXOrPost_incrementationY(int x, int y) {
        return y++ < ++x && --x < y++;

    }

    private static boolean isProductXAndYEven(int x, int y) {
        return (x * y) % 2 == 0;
    }


}
