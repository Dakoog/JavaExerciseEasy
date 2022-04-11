package java_basic.day_third.task3;

import java.util.regex.Pattern;

/*
    Napisz program, który sprawdzi czy liczba wejściowa (typu String) ma poprawny format
    Przykład:
    If digit 1234,1234 has correct format true
    If digit 123a123 has correct format false
*/
public class TaskThird {

    private static final String DOUBLE_NUMBER = "-?[1-9]*0?(,[0-9]+)?";

    public static void main(String[] args) {
        
        System.out.println("IS THIS DOUBLE NUMBER?");
        String doubleNumber = "1234,1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "-1234,1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "0,1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "10,1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "-10";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        System.out.println("------------------------");
        doubleNumber = "0!1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "01,1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "000,1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        doubleNumber = "1234a1234";
        System.out.println(doubleNumber + " is correct: " + isCorrectFormatForDouble(doubleNumber));
        System.out.println();


    }

    private static boolean isCorrectFormatForDouble(String doubleNumber) {
        Pattern pattern = Pattern.compile(DOUBLE_NUMBER);
        return pattern.matcher(doubleNumber).matches();
    }
}
