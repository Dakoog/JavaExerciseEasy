package java_basic.day_second.task11;
/*
    Napisz program, który będzie sprawdzał czy podane słowo (typu String) jest palindromem.
    Przykład:
    Input: kajak
    Result: true
    Input: sda
    Result: false
*/
import java_basic.day_second.helper.StringHelper;

public class TaskEleventh {
    public static void main(String[] args) {

        String input = "kajak";
        System.out.println(isPalindrome(input));
        input = "programowanie";
        System.out.println(isPalindrome(input));
    }

    private static boolean isPalindrome(String input) {
        if (StringHelper.isValid(input)) {

    }return new StringBuilder(input).reverse().toString().equals(input);
    }

}
