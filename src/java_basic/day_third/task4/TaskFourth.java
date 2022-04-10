package java_basic.day_third.task4;

import java.util.regex.Pattern;

/*
Napisz program, który pobierze od użytkownika tekst i sprawdzi, czy użytkownik kichnął, tzn czy
w podanym tekście znajduje się aaaa psik” z dowolnie wieloma, ale minimum jedną literą ' na
początku wyrażenia
Przykład Please insert your text a psik
Result true
Please insert your text aaaaa psik
Result true
Please insert your text psik
Result false
 */
public class TaskFourth {

    private static final String REGEX = "a+ (psik|Psik)";
    //private static final String REGEX = "a+ [pP]sik";

    public static void main(String[] args) {
        System.out.println(isContains("a psik"));
        System.out.println(isContains("a Psik"));
        System.out.println(isContains("aaaa Psik"));
        System.out.println();
        System.out.println(isContains("psik"));
        System.out.println(isContains("Psik"));
        System.out.println(isContains("A psik"));

    }
    private static boolean isContains(String input){
        Pattern pattern = Pattern.compile(REGEX);

        return pattern.matcher(input).matches();
    }
}
