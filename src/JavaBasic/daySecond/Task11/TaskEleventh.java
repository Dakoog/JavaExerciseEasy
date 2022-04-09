package JavaBasic.daySecond.Task11;
/*
    Napisz program, który będzie sprawdzał czy podane słowo (typu String) jest palindromem.
    Przykład:
    Input: kajak
    Result: true
    Input: sda
    Result: false
*/
import JavaBasic.daySecond.Helper.StringHelper;

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
