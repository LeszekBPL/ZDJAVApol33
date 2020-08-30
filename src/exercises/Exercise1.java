package exercises;

public class Exercise1 {
    public static void printMultiplyTableForN(int n) {
        for (int i = 1; i < 5; i++) {
            System.out.println(n * i);
        }
        System.out.println("--------");
    }
    public static void main(String[] args) {
        Exercise1.printMultiplyTableForN(2);
        Exercise1.printMultiplyTableForN(7);
        Exercise1.printMultiplyTableForN(11);
        Exercise1.printMultiplyTableForN(24);
        Exercise1.printMultiplyTableForN(33);
    }
}