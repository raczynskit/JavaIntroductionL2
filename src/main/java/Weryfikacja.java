public class Weryfikacja {
    public static void main(String[] args) {
        isEqualOrOlderThan18(19);

    }

    public static String isEqualOrOlderThan18(int age) {
        if (age <= 0) {
            return "Podany wiek nie jest poprawny.";
        } else if (age < 18) {
            return "Wiek jest mniejszy od 18.";
        } else {
            return "Wiek jest równy, bądź większy od 18.";
        }
    }
}