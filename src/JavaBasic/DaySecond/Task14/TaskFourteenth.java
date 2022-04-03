package JavaBasic.DaySecond.Task14;

import java.util.Arrays;
/*
    Napisz program, którydla zadanej tablicy int'ówpoliczy ile jest w niej liczb ujemnych. Jeślitakie
    występująutworzy nowątablicę,do którejprzepisze tylko te ujemne liczby.
    Przykład:
    Input: 12, -7, 19, -5
    Result: -7, -5
*/
public class TaskFourteenth {

    public static void main(String[] args) {
        int[] inputs = {12, -7, 19, -5};
        System.out.println("Inputs: " + Arrays.toString(inputs));
        int lengthOfNewArray = countNegativeValues(inputs);
        if(lengthOfNewArray > 0) {
            int[] result = createNewArrayWithNegativeValues(inputs, lengthOfNewArray);
            System.out.println("Result: " + Arrays.toString(result));
        }
    }

    private static int countNegativeValues(int[] inputs) {
        int counter = 0;
        for(int element : inputs) {
            if(element < 0) {
                counter++;
            }
        }
        return counter;
    }

    private static int[] createNewArrayWithNegativeValues(int[] inputs, int lengthOfNewArray) {
        int[] result = new int[lengthOfNewArray];
//        for(int i = 0, j = 0; i < inputs.length; i++) {
//            if(inputs[i] < 0) {
//                result[j] = inputs[i];
//                j++;
//            }
//        }
        int counter = 0;
        for(int element : inputs) {
            if(element < 0) {
                result[counter] = element;
                counter++;
            }
        }
        return result;
    }
}