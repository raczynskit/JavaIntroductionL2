public class Liczby {
    public static void main(String[] args) {

        int number = 200;
        System.out.println(checkEvenOrOdd(number));


    }

    public static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Liczba jest parzysta";
        } else {
            return "Liczba jest nieparzysta";
        }
    }
}