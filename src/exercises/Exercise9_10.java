package exercises;

public class Exercise9_10 {
    public static void main(String[] args) {
        int dividedNumber= 19;
        int divider=4;
        int count=0;
        for (int i=1;i*divider<dividedNumber;i++) {
        count++;}
        System.out.println(dividedNumber-(divider*count));


        System.out.println(dividedNumber%divider);

    }
}
