package java_basic.day_third.task5;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

/*
    Napisz program, działającyjak stoper.
    Program powinien wyświetlićkomunikat, żepomiar czasu rozpoczyna sięod wciśnięciaklawisza
    Enter. Po uruchomieniu pomiaru powinien pojawićsiękolejny komunikat informującyo tym, że
    w celu zatrzymania pomiaru należyponownie wcisnąćklawisz Enter.
    Po zakończeniupomiaru program powinien wyświetlićinformacje o całkowitymczasie pomiaru.
    Podpowiedź: Użyj klasy Duration do wyliczenia czasu pomiaru.
    Przykład:
    To start timing press ENTER
    To stop timing press ENTER
    Total time: 6 sec
**/
public class TaskFifth {
    public static void main(String[] args) {
        stoper();
    }

    private static void stoper() {
        Scanner input = new Scanner(System.in);
        System.out.println("To start timing press ENTER");
        input.nextLine();
        LocalTime start = LocalTime.now();
        System.out.println("To stop timing press ENTER");
        input.nextLine();
        LocalTime stop = LocalTime.now();
        Duration stoper = Duration.between(start, stop);
        if (stoper.getSeconds() < 60) {
            System.out.printf("Seconds: %02d " + stoper.getSeconds());
        } else {
            long minut = stoper.getSeconds() / 60;
            long second = stoper.getSeconds() % 60;
            System.out.printf(" Minutes: %02d Seconds: %02d" +  minut,second);
        }
        ;


    }
}


