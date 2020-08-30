package exercises;

import java.util.Arrays;

public class Exercise4_5 {
    public static void main(String[] args) {
        int[] dane = {12, 7, 19,12,1,23,66,};
        System.out.println(dane.length);
        System.out.println(dane[0]);
        dane[0]=dane[2];
        dane[2]=12;
        System.out.println(Arrays.toString(dane));
        System.out.println(Arrays.stream(dane).max());
        System.out.println(Arrays.stream(dane).min());
    }
    }

