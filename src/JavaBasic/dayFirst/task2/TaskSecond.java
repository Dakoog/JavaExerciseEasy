package JavaBasic.dayFirst.task2;

import java.util.Scanner;

public class TaskSecond {
      // przypisanie stałej wartości finalnej (niezmiennej)
    private static final float PI = 3.14f;

    /*
            Napisz program, który pobierze od użytkownika średnicę okręgu(typu float), a następnie obliczy
            obwód oraz pole tego okręgu. Do obliczeń przyjmij:
            a) π = 3,14;
            b) wartość stałej π z klasy Math.
            Przykład:
            Please insert diameter: 2,5
            Circumference Of A Circle: 7.8500004
            Area Of A Circle: 4.90625
             */


    public static void main(String[] args) {
      // przypisanie zmiennej diameter wartości średnicy podanej przez użytkownika (Scanner)
        float diameter = getDiameterFromUser();

        double area1 = calculateAreaOfCircle(diameter);
        double circumference1 = calculatePerimeterOfCircle(diameter);
        System.out.println("Dla Pi = 3.14");
        System.out.println("Circumference of a circle: " + circumference1);
        System.out.println("Area of a circle: " + area1);

        double area2 = calculateAreaOfCircleWithMath(diameter);
        double circumference2 = calculatePerimeterOfCircleWithMath(diameter);
        System.out.println("\nZ klasą Math dla pi =  3.14159265358979323846");
        System.out.println("Circumference of a circle: " + circumference2);
        System.out.println("Area of a circle: " + area2);

    }

    // pobierz wartości od użytkownika (średnica)
    private static float getDiameterFromUser() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please insert diameter");
        // od razu wpisuje w return
        return input.nextFloat();
    }

    private static float calculatePerimeterOfCircle(float diameter) {
        return 3.14f * diameter;
    }

    private static float calculateAreaOfCircle(float diameter) {

               // przypisanie stałej finalnej do wartości PI = 3.14 -> ctrl + alt + c
        return PI * (float)Math.pow(diameter,2)/ 4f;
    }

    private static double calculatePerimeterOfCircleWithMath(float diameter) {
        return Math.PI * diameter;
    }

    private static float calculateAreaOfCircleWithMath(float diameter) {
        // return zwraca wartości typu float -> obie muszą być są a przed rzutowaniem są typu double
        return (float) Math.PI * (float)Math.pow(diameter,2)/ 4f;
                      // zastosowanie wartości liczby Pi z Metod Math PI = 3.141592653589793.
    }
}
