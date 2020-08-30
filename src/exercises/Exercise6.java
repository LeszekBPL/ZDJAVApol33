package exercises;

public class Exercise6 {
    public static void countNegativeValues(int[] allValues) {
        int counter = 0;
        for (int value:allValues){
            if(value<0){
                counter++;

            }
        }
        System.out.println("numbers of negative values: " + counter);
    }

    public static void main(String[] args) {
        int[] allValues = {1, 2, 3, -4, 5, 6, 7, 8, 9, 0,-7,-1};
        countNegativeValues(allValues);

    }

}
