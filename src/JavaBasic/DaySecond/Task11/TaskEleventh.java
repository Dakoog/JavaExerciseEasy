package JavaBasic.DaySecond.Task11;

public class TaskEleventh {
    public static void main(String[] args) {
        String input = "kajak";
        System.out.println(isPalindrome(input));
        input = "programowanie";
        System.out.println(isPalindrome(input));
    }
    private static boolean isPalindrome(String input){
       return new StringBuilder(input).reverse().toString().equals(input);

    }
}
