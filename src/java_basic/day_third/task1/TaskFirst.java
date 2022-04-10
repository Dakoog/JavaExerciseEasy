package java_basic.day_third.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
       Napisz program, który sprawdzi czy podany adres email ma poprawny format
    Przykład:
    If email address aaa@com pl has correct format true
    If email address aaa has correct format false
*/
public class TaskFirst {
    private static final String EMAIL_VALIDATOR = "[A-Za-z0-9._-]+@[a-z]+(\\.[a-z]+)?";
    //                                             [A-Za-z0-9._-]-> all: uppercase, lowercase, digits and sings only ._-(other is incorrect)
    //                                             + -> at least one character from this group will be used
    //                                             [a-z]+ -> only lowercase use least one character
    //                                             (\.[a-z]+) group
    //                                             ? -> group not used or used only once
    //                     use of abbreviations = "[\\w\\d._-]+@[\\w]+(\\.[\\w]+)?";

    public static void main(String[] args) {
        // Testing for method is CorrectFormat()
        System.out.println("sda@com: " + isCorrectFormat("sda@com"));
        System.out.println("sda@com.pl: " + isCorrectFormat("sda@com.pl"));
        System.out.println("sda_biuro@com.pl: " + isCorrectFormat("sda_biuro@com.pl"));
        System.out.println("sda_biuro1@com.pl: " + isCorrectFormat("sda_biuro1@com.pl"));
        System.out.println();
        System.out.println("sda.com.pl: " + isCorrectFormat("sda.com.pl"));
        System.out.println("@sda: " + isCorrectFormat("@sda"));
        System.out.println("sda@: " + isCorrectFormat("sda@"));
        System.out.println("sda!@com.pl: " + isCorrectFormat("sda!@com.pl"));
        System.out.println("@: " + isCorrectFormat("@"));
        System.out.println("sda@com.: " + isCorrectFormat("sda@com."));
    }
    /* When address email is:
               true:          or          false:
               sda@com                    sda.com.pl
               sda@com.pl                 @sda
               sda_biuro@com.pl .-        sda@
               sda_biuro1@com.pl          sda!@com.pl
                                          @
                                          sda@com.
             Remember that:
                            a? -> zero or one
                            a* -> zero or more
                            a+ -> one or more
                            \d -> dowolna cyfra
                            \w -> dowolny znak                                                 */

    private static boolean isCorrectFormat(String emailAddress) {

        //pattern (wzór) matcher (dopasowanie)
        Pattern pattern = Pattern.compile(EMAIL_VALIDATOR);// EMAIL_VALIDATOR -> writing our pattern
        //Matcher matcher = pattern.matcher(emailAddress);
        //return matcher.matches(); -> this block can be omitted and entered as for -> return
        return pattern.matcher(emailAddress).matches();

        //return matcher.matches();
    }
}
