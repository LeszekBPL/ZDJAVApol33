package exercises;

public class Exercise2 {
    public static void main(String[] args) {
        //Jakub H
        int number = 155;
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
//        //Michał
//        public static boolean isNumberPrime (int number){
//            for (int i = 2; i < number; i++) {
//                if (number % i == 0) return false;
//            }
//            return true;
//        }
        //Grzegorz
        int num = 155;
        for (int i = 1; i < num; i++) {
            boolean dividableByItself = num % i == 0;
            System.out.println(dividableByItself);
        }
        //Kamil
        Exercise2.loop(10);
    }
    //Kamil
    public static void loop(int n) {
        int a = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                a++;
            } else if (a > 2) {
                break;
            }
        }
        if (a == 2) {
            System.out.println("Liczba: " + n + " jest pierwsza");
        } else {
            System.out.println("Liczba: " + n + " nie jest pierwsza");
        }
    }
}