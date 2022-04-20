package java_basic.day_third.task6;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
    Napisz program, który pobierze od użytkownika datę jego urodzin i obliczy
   czas (lata, dni, godziny
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
public class TaskSixth {
    public static void main(String[] args) {
       numberOfDaysToMeeting();
    }
    private static void numberOfDaysToMeeting(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please insert date for your SDA meeting.");
        String meetingDate = input.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.printf("%1$td %1$tB %1$tY, %1$tA %n",meetingDate);
//        LocalDateTime nextLessons = LocalDateTime.parse(meetingDate, formatter);
//
//        LocalDateTime now = LocalDateTime.now();
//
//        Duration duration = Duration.between(now, nextLessons);
//        long days = duration.toDaysPart();
//        int hours = duration.toHoursPart();
//        int minutes = duration.toMinutesPart();
//        int secs = duration.toSecondsPart();
//        System.out.println("You have Days: " + days + " Hours: " + hours + " Minutes: " + minutes + " Seconds: " + secs);
//        System.out.printf("You have Days: %02d Hours: %02d Minutes: %02d Seconds: %02d", days, hours, minutes, secs);
//        System.out.printf("\n%02d:%02d:%02d:%02d", days, hours, minutes, secs);


    }
}
