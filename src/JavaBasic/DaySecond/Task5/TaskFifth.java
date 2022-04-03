package JavaBasic.DaySecond.Task5;

import JavaBasic.DaySecond.Helper.StringHelper;

/*Napisz program, któryprzyjmie jako argument input (typu String) i znak (typu char), a następnie
zwróciliczbęwystąpieńpodanego znaku w danym łańcuchu znaków.
Przykład:
Input: Ala ma kota
Searched Character: a
Result: */
public class TaskFifth {
    public static void main(String[] args) {
      String input = "Ala ma kota.";
      char letter = 'z';
        System.out.println(numberChars(input,letter));
    }

    private static int numberChars(String input, char searchedCharacter) {
        int counter =0;
                                         // jeśli danej litery nie ma
       if(StringHelper.isValid(input) && input.contains(String.valueOf(searchedCharacter))){
           for (int i = 0; i <input.length() ; i++) {
               if(input.charAt(i)== searchedCharacter){
                   counter++;
               }

           }
       }
        return counter;
    }
}