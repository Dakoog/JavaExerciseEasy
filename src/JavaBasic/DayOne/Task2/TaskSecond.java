package JavaBasic.DayOne.Task2;

import java.util.Scanner;

public class TaskSecond {
    /*
    Napisz program, którypobierze od użytkownikaśrednicęokręgu(typu float), a następnieobliczy
    obwódoraz pole tego okręgu. Do obliczeńprzyjmij:
    a) π= 3,14;
    b) wartośćstałejπz klasy Math.
    Przykład:
    Please insert diameter: 2,5
    Circumference Of A Circle: 7.8500004
    Area Of A Circle: 4.90625
     */
    private static final float pi = 3.14F;

    public static void main(String[] args) {

        float diameter = getDiameterFromUser();

        double area1 = calculateAreaOFaCircle(diameter);
        double circumference1 = calculateCircumferenceOFaCircle(diameter);

        double area2 = calculateAreaOFaCircleWithMath(diameter);
        double circumference2 = calculateCircumferenceOFaCircleWithMath(diameter);

        System.out.println("Dla Pi = 3.14");
        System.out.println("Circumference of a circle: " + circumference1);
        System.out.println("Area of a circle: " + area1);

        System.out.println("\nZ klasą Math dla Pi =  3.14159265358979323846");
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

    private static double calculateCircumferenceOFaCircle(float diameter) {
        return pi * diameter;
    }

    private static double calculateAreaOFaCircle(float diameter) {
        return pi * diameter * diameter / 4f;
    }

    private static double calculateCircumferenceOFaCircleWithMath(float diameter) {
        return Math.PI * diameter;
    }

    private static double calculateAreaOFaCircleWithMath(float diameter) {
        return Math.PI * Math.pow(diameter, 2) / 4f;
    }
}
