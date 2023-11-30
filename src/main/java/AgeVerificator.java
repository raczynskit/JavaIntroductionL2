public class AgeVerificator {


    public static boolean isAdult(int age) {
        boolean result;
        if (age >= 18) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}