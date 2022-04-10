package java_basic.daySecond.task2;

import java_basic.daySecond.helper.StringHelper;

public class TaskSecond {
    /*
        Napisz program, który przyjmie jako argumenty input i prefix (oba typu String), a następnie
    sprawdzi czy zmienna input rozpoczyna się od słowaprzesłanegopod argumentem prefix.
    * Spróbuj napisać program, który będzie robił to samo, ale gdy podanym jest suffix.
    Przykład:
    Input: programowanie, Prefix: pro
    Result: true
    Input: programowanie, Suffix: nie
    Result: true
*/


        public static void main(String[] args) {
            String input = "programowanie";
            String prefix = "pro";
            boolean result = isWordContainsPrefix(input, prefix);
            System.out.println(result);

            result = isWordContainsPrefix(input, null);
            System.out.println(result);

            result = isWordContainsPrefix("", "");
            System.out.println(result);
        }

        private static boolean isWordContainsPrefix(String input, String prefix) {
            if(StringHelper.isValid(input) && StringHelper.isValid(prefix)) {
                return input.startsWith(prefix);
            }
            return false;
        }
    }



