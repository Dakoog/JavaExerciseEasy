package JavaBasic.dayThird.Task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFirst {
    //private static final String EMAIL_VALIDATOR = "[A-Za-z0-9._-]+@[a-z]+(\\.[a-z]+)?";
    private static final String EMAIL_VALIDATOR = "[\\w\\d._-]+@[\\w]+(\\.[\\w]+)?";

    public static void main(String[] args) {
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

    private static boolean isCorrectFormat(String emailAddress) {
        /*
            true:
            sda@com
            sda@com.pl
            sda_biuro@com.pl .-
            sda_biuro1@com.pl
            false:
            sda.com.pl
            @sda
            sda@
            sda!@com.pl
            @
            sda@com.
         */
                /*
        a? -> zero or one
        a* -> zero or more
        a+ -> one or more
        \d -> dowolna cyfra
        \w -> dowolny znak
         */
        //pattern matcher
        Pattern pattern = Pattern.compile(EMAIL_VALIDATOR);
        return pattern.matcher(emailAddress).matches();
        //Matcher matcher = pattern.matcher(emailAddress);
        //return matcher.matches();
    }
}
