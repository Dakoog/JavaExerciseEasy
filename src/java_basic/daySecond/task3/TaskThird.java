package java_basic.daySecond.task3;

import java_basic.daySecond.helper.StringHelper;

public class TaskThird {

    public static void main(String[] args) {
        String input = "Ala ma kota";
        String word = "ma";
        int result = getIndex(input, word);
        System.out.println(result);

        word = "";
        result = getIndex(input, word);
        System.out.println(result);

        word = "psa";
        result = getIndex(input, word);
        System.out.println(result);

        word = null;
        result = getIndex(input, word);
        System.out.println(result);
    }

    private static int getIndex(String input, String word) {
        if(StringHelper.isValid(input) && StringHelper.isValid(word)) {
//            boolean result = input.contains(word);
//            if(result) {
//                return input.indexOf(word);
//            }
            return input.indexOf(word);
        }
        return -1;
    }
}
