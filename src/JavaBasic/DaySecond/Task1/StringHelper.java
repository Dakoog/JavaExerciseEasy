package JavaBasic.DaySecond.Task1;

public class StringHelper {
    public static boolean isValid(String input){
        // wyłapanie problemu null i pustego stringa
        return input != null && !input.isBlank();// jeśli jest ok, to zwróci true, nie to false
    }

}
