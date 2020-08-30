package exercises;

import java.util.Arrays;

public class Exercise8 {
    public boolean isAritmeticSequence(int[] numbers) {
    int difference = numbers[1] - numbers[0];
    int[] tempSeq = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
        tempSeq[i] = numbers[0] + difference * i;
    }
    System.out.println("Sequence to check: " + Arrays.toString(numbers));
    System.out.println("Control sequence: " + Arrays.toString(tempSeq));
    return Arrays.equals(tempSeq, numbers);
}


}
