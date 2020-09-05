package exercises;

public class Exercise9_10 {
    public static void main(String[] args) {
        int dividedNumber= 3;
        int divider=10;
        int count=0;
        for (int i=1;i*divider<dividedNumber;i++) {
        count++;}
        System.out.println(dividedNumber-(divider*count));


        System.out.println(dividedNumber%divider);

    }
}
