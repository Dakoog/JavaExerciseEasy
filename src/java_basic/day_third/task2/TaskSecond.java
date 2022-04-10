package java_basic.day_third.task2;

import java.util.regex.Pattern;

/*
Napiszprogram, który sprawdzi czy podany polski numer IBAN ma poprawny format
    Przykład
    If PL IBAN PL 10105000997603123456789123 has correct format true
    If PL IBAN 1324 has correct format false

     // Regex -> wyrażenie regularne.
    /*  ||         ZNAKI       ||  KWANTYFIKATORY    ||              GRUPOWANIE                         ||
        ___________________________________________________________________________________________________
         \d – dowolna liczba   ||  * – 0 lub więcej  || [ ] – dopasowuje wszystkie znaki w nawiasach    ||
         \D – nie liczba       ||  + – 1 lub więcej  || [^ ] – dopasowuje wszystkie znaki spoza nawiasów||
         \w – dowolna litera   ||  ? – 0 lub 1       || () – grupowanie                                 ||
         \W – nie litera       ||  {}– dok. licz. zn.|| | – albo                                        ||
         \s – biały znak       ||  {min,max}– zakres ||
         \S – nie biały znak   ||
         . – dowolny znak      ||
         \ – wyjściowy znak    ||
         \b – granica słowa    ||
         \B – nie granica słowa||
         ^ – początek ciągu    ||
         $ – koniec ciągu      ||
*
*/
public class TaskSecond {

    private static final String PL_IBAN= "(PL)+[0-9]{26}";

    public static void main(String[] args) {
        System.out.println("PL29921876098215675502317409 :"+ isCorectFormat("PL29921876098215675502317409"));
        System.out.println("pl29921876098215675502317409:"+ isCorectFormat("pl29921876098215675502317409"));
        System.out.println("SV29921876098215675502317409 :"+ isCorectFormat("SV29921876098215675502317409"));
        System.out.println("PL299218760982156755023 :"+ isCorectFormat("PL299218760982156755023"));

    }

    private static boolean isCorectFormat(String iban) {

        Pattern pattern = Pattern.compile(PL_IBAN);
        return pattern.matcher(iban).matches();
    }
    }


