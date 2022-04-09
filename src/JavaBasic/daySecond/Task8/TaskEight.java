package JavaBasic.daySecond.Task8;

import JavaBasic.daySecond.Helper.StringHelper;

public class TaskEight {
    private static final int VALUE_UPPER_A_IN_ASCII = 65;
    private static final int VALUE_UPPER_Z_IN_ASCII = 90;
    private static final int VALUE_LOWER_A_IN_ASCII = 97;
    private static final int VALUE_LOWER_Z_IN_ASCII = 122;
    public static final int DIFF_UPPER_AND_LOWER_IN_ASCII = 32;

    public static void main(String[] args) {
        String inptut = "AlA Ma kOtA.";
        String result = replaceChars(inptut);
        System.out.println(result);
    }

    private static String replaceChars(String input) {
        if(StringHelper.isValid(input)) {
            //String result = "";
            StringBuilder resultSb = new StringBuilder();
            for(int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                if(isUpperLetter(currentChar)) {
                    //result = result.concat(String.valueOf(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                    //result += (char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII);
                    resultSb.append((char)(currentChar + DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else if (isLowerLetter(currentChar)) {
                    //result += (char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII);
                    resultSb.append((char)(currentChar - DIFF_UPPER_AND_LOWER_IN_ASCII));
                } else {
                    //result += currentChar;
                    resultSb.append(currentChar);

                }
            }
            //return result;
            return resultSb.toString();
        }
        return input;
    }

    private static boolean isUpperLetter(char currentChar) {
        return currentChar >= VALUE_UPPER_A_IN_ASCII && currentChar <= VALUE_UPPER_Z_IN_ASCII;
    }

    private static boolean isLowerLetter(char currentChar) {
        return currentChar >= VALUE_LOWER_A_IN_ASCII && currentChar <= VALUE_LOWER_Z_IN_ASCII;
    }
}

