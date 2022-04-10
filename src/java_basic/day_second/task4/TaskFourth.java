package java_basic.day_second.task4;

import java_basic.day_second.helper.StringHelper;

public class TaskFourth {


    public static final String REPLACEMENT = "-STOP-";

    public static void main(String[] args) {
        String input = "Ala, ma kota. Kota ma Alę.";
        String result = replaceString(input);

    }
    private static String replaceString(String input){
        if(StringHelper.isValid(input)){
//           return input
//                   .replace(".", REPLACEMENT)
//                   .replace(",",REPLACEMENT);
           return input.replaceAll("[.,]",REPLACEMENT);

        }
        return input;

    }
}
