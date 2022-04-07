package JavaBasic.DaySecond.Task9;

import java.util.Scanner;

/*
        Napisz program, którybędzieod użytkownikapobierałkolejne teksty (typu String) tak długo,aż
      użytkownikpoda tekst „Enough”, a następniewypisze najdłuższyz podanych tekstów(nie biorąc
      pod uwagętekstu „Enough”). Jeśliużytkowniknie poda żadnegotekstu, to wypisz „Noinput”.
      Przykład:
      Please insert your text: Ala
      Please insert your text:
      No input
      Please insert your text: ma
      Please insert your text: kota
      Please insert your text: i
      Please insert your text: psa
      Please insert your text: Enough
      Result: kota
*/
public class TaskNinth {
    public static void main(String[] args) {
        System.out.println(longestWord());

    }

    private static String longestWord() {
        Scanner input = new Scanner(System.in);
        String resultMax = "";
        String result = "";
        do {

            System.out.println("Please insert your text: ");
            result = input.nextLine();
            if(result.equals("")){
                System.out.println("No input");
            }

            if (resultMax.length() < result.length() && !result.equals("Enough")) {
                resultMax = result;
            }

        } while (!result.equals("Enough"));

        return resultMax;
    }
}

