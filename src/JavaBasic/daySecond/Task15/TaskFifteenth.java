package JavaBasic.daySecond.Task15;
/*
*    Napisz program, w którym zdefiniujesz dwie tablice przechowujące Stringi. Napisz metodę,
        która porówna obie tablice i sprawdzi, czy są one dokładnie takie same (takie same wartości
        i kolejności elementów).
        Przykład:
        Input:
        FirstArray: "Ala", "ma", "kota”
        SecondArray: "Ala", "ma", "kotaa"
        Result: false
        * */
public class TaskFifteenth {

    public static void main(String[] args) {
        String[] firstArray = {"Ala", "ma", "kota"};
        String[] secondArray = {"Ala", "ma", "kota"};
        System.out.println(areEqual(firstArray, secondArray));

        String[] firstArray1 = {"Ala", "ma", "kot"};
        String[] secondArray1 = {"Ala", "ma", "kota"};
        System.out.println(areEqual(firstArray1, secondArray1));

        String[] firstArray2 = {"Ala", null, "kota"};
        String[] secondArray2 = {"Ala", "ma", "kota"};
        System.out.println(areEqual(firstArray2, secondArray2));

        String[] firstArray3 = {"Ala", "ma", "kota"};
        String[] secondArray3 = {"Ala", null, "kota"};
        System.out.println(areEqual(firstArray3, secondArray3));

        String[] firstArray4 = {"Ala", null, "kota"};
        String[] secondArray4 = {"Ala", null, "kota"};
        System.out.println(areEqual(firstArray4, secondArray4));
    }

    private static boolean areEqual(String[] firstArray, String[] secondArray) {
        if(firstArray.length == secondArray.length) {
            for(int i = 0; i < firstArray.length; i++) {
                String firstArrElement = firstArray[i];
                String secondArrElement = secondArray[i];
                if(firstArrElement == null && secondArrElement == null) {
                    continue;
                }
                // null.equals(wartość) -> NPE
                // wartosc.equals(null) -> ok
                // wyrażenie1 && wyrażenie2
                // wyrażenie1 || wyrażenie2
                if(firstArrElement == null || !firstArrElement.equals(secondArrElement)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}