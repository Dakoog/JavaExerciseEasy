package JavaBasic.DaySecond.Task6;

import JavaBasic.DaySecond.Task1.StringHelper;

/*
    Napisz program, który przyjmie jako argument input (typu String) i znak (typu char), a następnie
    zwróci indeks, na którym znajduje się pierwszy poszukiwany znak (w podanym łańcuchu
    znaków). Jeżeli znak nie występuje w inpucie, to wynikiem funkcji powinno być -1. Pozycje
    znakówpowinny byćnumerowane od 0.
    Przykład:
    Input: Ala ma kota
    Searched Character: a
    Result: 2
    Przykład:
    Input: Ala ma kota
    Searched Character: z
    Result: -1
*/
public class TaskSixth {
    public static void main(String[] args) {
        String input= "Ala ma kota";
        char letter = 'z';
        char letter2 = 'a';
        System.out.println(placeForChar(input,letter));
        System.out.println(placeForChar(input,letter2));
    }
    private static int placeForChar(String input, char letter){
        if(StringHelper.isValid(input)){
            return input.indexOf(letter);
        }

        return -1;
    }

}
