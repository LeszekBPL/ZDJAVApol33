package exercises;

public class Exercise2Try2 {
    public static void main(String[] args) {
        int number = 11;
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(number + " jest liczba pierwsza");
        } else {
            System.out.println(number + " nie jest liczba pierwsza");
        }
    }
}