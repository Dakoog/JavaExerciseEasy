package JavaBasic.DayOne.Task1;

public class TaskFirst {
    /*
        Napisz program, który wyświetli na ekranie wyraz SDA, nie używając ani jednego znaku " lub '
         */
    public static void main(String[] args) {
        displayWorldUsingDecimalFormat();
        System.out.println();
        displayWorldUsingBinaryFormat();
        System.out.println();
        displayWorldUsingBinaryHex();

    }

    private static void displayWorldUsingDecimalFormat() {
        char s = 83;
        char d = 68;
        char a = 65;
        System.out.print(s);
        System.out.print(d);
        System.out.print(a);

    }

    private static void displayWorldUsingBinaryFormat() {
        char S = 0b01010011;
        char D = 0b01000100;
        char A = 0b01000001;
        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

    }
    private static void displayWorldUsingBinaryHex() {
        char S = 0x53;
        char D = 0x44;
        char A = 0x41;
        System.out.print(S);
        System.out.print(D);
        System.out.print(A);

    }

}
