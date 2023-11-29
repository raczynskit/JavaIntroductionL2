public class Calculator {
    public static void main(String[] args) {

        double value1 = 6;
        double value2 = 3;

        double dodawanie = addValues(value1, value2);
        double odejmowanie = subtractValues(value1, value2);
        double mnozenie = multiplyValues(value1, value2);
        double dzielenie = divideValues(value1, value2);

        System.out.println(dodawanie);
        System.out.println(odejmowanie);
        System.out.println(mnozenie);
        System.out.println(dzielenie);
    }
    public static double addValues (double value1, double value2) {
        double addResult = value1 + value2;

        return addResult;
    }
    public static double subtractValues (double value1, double value2) {
        double subResult = value1 - value2;

        return subResult;
    }
    public static double multiplyValues (double value1, double value2) {
        double multResult = value1 * value2;

        return multResult;
    }
    public static double divideValues (double value1, double value2) {
        double divResult = value1 / value2;

        return divResult;
    }


}
