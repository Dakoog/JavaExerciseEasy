package java_basic.day_first.Task4;

import java.util.Scanner;
/*
       Napisz program obliczający BMI (Body Mass Index) oraz sprawdzający, czy jest ono w normie.
   Program powinien wczytać od użytkownika dwie zmienne: wagę (weight) w kilogramach (typ
   float) oraz wzrost (height) w centymetrach (typ int). BMI powinno zostaćwyliczone zgodnie
   z poniższym wzorem:
   Optymalny zakres BMI wynosi od 18,5 do 24,9, wartości mniejsze lub większe są wartościami
   nieoptymalnymi. Twój program powinien wypisać „BMI is correct” lub „BMI is not correct”,
   zgodnie z powyższymi założeniami.
   Przykład:
   Please insert weight in kg: 80
   Please insert height in cm: 185
   BMI is correct: 23.374725
    */

public class TaskFourth {
    // determining the range of the correct weight in the BMI scale with the final fields
    private static final double BMI_MIN_RANGE = 18.5;
    private static final double BMI_MAX_RANGE = 24.9;
    private static final Scanner INPUT = new Scanner(System.in);


    public static void main(String[] args) {
        int height = getHeightFromUser();
        float weight = getWeightFromUser();
        float bmi = calculateBMI(weight, height);
        displayBmiResult(bmi);
    }

    // methods inserting weight and height of user
    private static float getWeightFromUser() {
        System.out.println("Please insert weight in kg: ");
        return INPUT.nextFloat();

    }

    private static int getHeightFromUser() {
        System.out.println("Please insert height in cm: ");
        return INPUT.nextInt();
    }

    private static float calculateBMI(final float weight, final int height) {
        // change from units of the indicated height in centimeters to height in meters
        float heightInMeter = height / 100f;
        // formula for calculating BMI
        return weight / (float) Math.pow(heightInMeter, 2);
    }

    private static void displayBmiResult(final float bmi) {
        //introducing final fields for better code reading
        if (bmi < BMI_MIN_RANGE || bmi > BMI_MAX_RANGE) {
            System.out.println("BMI is incorrect " + bmi);
        } else {
            System.out.println("BMI is correct: " + bmi);
        }
    }
}

