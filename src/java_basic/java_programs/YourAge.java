package java_basic.java_programs;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
    Napisz program, który pobierze od użytkownika datę jego urodzin i obliczy
    czas (lata, dni, godziny, minuty, sekundy), jaki od nich minął, czyli jego dokładny wiek
    Przykład:
    Please insert date [in format [
    yyyy MM dd HH:mm:ss ]]: 1900 0 1 01 09:00:00
    You have 19 days to the next lesson
    * Spróbuj rozszerzyć program, tak aby wynik był uzupełniony równie o liczbę godzin i minut.
    Przykład:
    Please insert date [in format [
    yyyy MM dd HH:mm:ss ]]: 1900 0 1 01 09:00:00
    You have Days: 19 Hours : 10 Minutes : 38 Secs to the next lesson
*/
public class YourAge {
    public static void main(String[] args) {
        numberOfDaysYourBirthday();
    }

    private static void numberOfDaysYourBirthday() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert date your birth  in format yyyy-MM-dd HH:mm");
        String birthDate = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime nextLessons = LocalDateTime.parse(birthDate, formatter);

        LocalDateTime now = LocalDateTime.now();

        Duration duration = Duration.between(now, nextLessons);
        int years = (int) (duration.toDaysPart() / -365.24);
        int days = -(int) (duration.toDaysPart() + years * 365.24);
        long hours = -duration.toHoursPart();
        int minutes = -duration.toMinutesPart();
        int secs = -duration.toSecondsPart();
        System.out.println("You are " + years + " Years " + days + " Days " + hours + " Hours and " + minutes+" Minutes");
        System.out.printf("You are  %02d Years  %02d Days   %02d Hours and  %02d Minutes", years, days, hours, minutes, secs);



    }
}
