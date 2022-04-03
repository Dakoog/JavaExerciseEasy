package JavaBasic.DayOne.Task4;

import java.util.Scanner;
/*
       Napisz program obliczający BMI (Body Mass Index) oraz sprawdzający, czy jest ono w normie.
   Program powinien wczytać od użytkownika dwie zmienne: wagę (weight) w kilogramach (typ
   float) oraz wzrost (height) w centymetrach (typ int). BMI powinno zostaćwyliczone zgodnie
   z poniższymwzorem:
   Optymalny zakres BMI wynosi od 18,5 do 24,9, wartości mniejsze lub większe są wartościami
   nieoptymalnymi. Twój program powinien wypisać „BMI is correct” lub „BMI is not correct”,
   zgodnie z powyższymizałożeniami.
   Przykład:
   Please insert weight in kg: 80
   Please insert height in cm: 185
   BMI is correct: 23.374725
    */

public class TaskFourth {
    private static final Scanner input = new Scanner(System.in);
    private static final double BMI_MIN_RANGE = 18.5;
    public static final double BMI_MAX_RANGE = 24.9;

    // static -> będzie to obiekt wspólny dla wszystkich wywołań

    public static void main(String[] args) {

        int height = getHeightFromUser();
        float weight = getWeightFromUser();
        float bmi = calculateBMI(weight, height);
        displayBmiResult(bmi);
    }

    private static float getWeightFromUser() {

        System.out.println("Please insert weight in kg: ");
        return input.nextFloat();

    }

    private static int getHeightFromUser() {

        System.out.println("Please insert height in cm: ");
        return input.nextInt();

    }
    private static float calculateBMI(final float weight, final int height){
        // weight/height(m)^2;
        float heightInMeter = height / 100f;
        return weight/(float)Math.pow(heightInMeter,2);
    }
    private static void displayBmiResult(final float bmi){
        if(bmi< BMI_MIN_RANGE || bmi > BMI_MAX_RANGE){
            System.out.println("BMI is not correct "+ bmi);
        }
        else {
            System.out.println("BMI is correct: "+ bmi);
        }
    }
}

