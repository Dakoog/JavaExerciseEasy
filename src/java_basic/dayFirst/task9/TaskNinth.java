package java_basic.dayFirst.task9;

public class TaskNinth {
    public static void main(String[] args) {
        int rangeFrom = 1;
        int rangeTo = 20;

        for(int i = rangeFrom; i <=rangeTo; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    private static String fizzBuzz(int number) {

        if(number % 3 == 0) {

        }
        if(number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}