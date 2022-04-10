package java_basic.day_third.circle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int radius = input.nextInt();
        Circle circle = new Circle(radius);
        System.out.println(circle);
    }


}
