package exercises;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {
        getArithmeticSequence(5, 2, 3);
    }

    private static void getArithmeticSequence(int lenght, int firstNumber, int incrementValue) {
        int[] arythmeticSequence= new int [lenght];
        //arythmeticSequence[0] = firstNumber; // initialize first element
        for (int index=0;index<lenght;index++){
           // int valueBase=firstNumber;
            arythmeticSequence[index]=firstNumber+incrementValue*index;
           // firstNumber

        }System.out.println(Arrays.toString(arythmeticSequence));

    }

}

