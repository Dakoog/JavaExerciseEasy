package java_basic.daySecond.task7;

import java_basic.new_method.RoundsNumbers;

import java.util.Scanner;
    /*
    Napisz program, który pobierze od użytkownika tekst (typu String)
     i policzy jakim procentem wszystkich znaków tekstu był znak spacji*/


public class TaskSeventh {
    public static void main(String[] args) {
        System.out.println("The percentage of spaces in the entire text is "+percentageSpacesInText()+"%.");
    }
    private static String getTextforUser(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert your text");

        return input.nextLine();

    }

    private static double percentageSpacesInText(){
        String text = getTextforUser();
        String onlyLetters = text.replaceAll(" ", "");
        double spaces = text.length()-onlyLetters.length();
        return RoundsNumbers.hundredths(spaces/text.length()*100d);
    }
    }
