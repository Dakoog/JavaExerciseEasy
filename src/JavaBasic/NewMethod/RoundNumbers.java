package JavaBasic.NewMethod;

public class RoundNumbers {
    public static double hundredths(double number){

        return (double) (Math.round(100 * number) / 100d);
    }
    public static double thousandths (double number){

        return (double) (Math.round(1000 * number) / 1000d);
    }
    public static double decimals(double number){

        return (double) (Math.round(10 * number) / 10d);
    }
}
