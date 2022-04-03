package JavaBasic.DaySecond.Task1;

import JavaBasic.DaySecond.Helper.StringHelper;

public class TaskFirst {/*
    Napisz program, który przyjmie jako parametr tekst (typu String), a następnie zwróci jego
    ostatni znak.
    Przykład:
    Original word: ala
    Last Char: a
    Original word: domek
    Last Char: k
*/

    private static final char DEFAULT_CHAR = '\u0000';

    public static void main(String[] args) {
        String input = "domek";
        char result = getLastChar(input);
        System.out.println(result);

        input = null;
        result = getLastChar(input);
        System.out.println(result);

        input = "";
        result = getLastChar(input);
        System.out.println(result);

    }

    private static char getLastChar(String input) {
        //domek length: 5 domek.charAt(4) -> k
        // null -> false && się nie wykona ponieważ nie ma sensu sprawdzać drugiego warunku gdy pierwszy to false -> false
        // "" -> true && false -> false
        if(StringHelper.isValid(input)) {
            int lastPosition= input.length()-1;
            return input.charAt(lastPosition);
        }
        return DEFAULT_CHAR;
    }
}
