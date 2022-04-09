package JavaBasic.dayFirst.task1;

public class TaskFirst {
    /*
        Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub '
         */
    public static void main(String[] args) {

        // nie używając apostrofu ani tez cudzysłowia
        // -> czyli bez string czy, też char
        // -> przejście na Decimal, zapis binarny lub Hexagonal
        displayWorldUsingDecimalFormat();// zapis dziesiątkowy
        System.out.println();
        displayWorldUsingBinaryFormat();// zapis binarny
        System.out.println();
        displayWorldUsingBinaryHex();// zapis dziesiątkowy

    }

    private static void displayWorldUsingDecimalFormat() {
        // zapis dziesiętny znaków graficznych -> liter
        // duże litery są od 65 do 97
        char S = 83;
        char D = 68;
        char A = 65;
        // wypisujemy każdy char osobno w jednej linii -> print!
        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

    }

    private static void displayWorldUsingBinaryFormat() {
        // zapis dwójkowy -> [ 0 1 ] -> zerojedynkowy -> binarny
        // dopisujemy przed zapisem 0b
        char S = 0b01010011;
        char D = 0b01000100;
        char A = 0b01000001;
        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

    }
    private static void displayWorldUsingBinaryHex() {
        // zapis szesnastkowy (hexagonal) -> dopisujemy prefix 0x przed zapisem
        char S = 0x53;
        char D = 0x44;
        char A = 0x41;
        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

    }

}
