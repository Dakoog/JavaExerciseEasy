package JavaBasic.daySecond.Task4;

import JavaBasic.daySecond.Helper.StringHelper;

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
