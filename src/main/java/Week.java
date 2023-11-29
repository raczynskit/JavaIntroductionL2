public class Week {
    public static void main(String[] args) {
        System.out.println(getDayOfWeek(7));
    }
    public static String getDayOfWeek (int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
            case 7:
                return "Weekend";
            default:
                return "There is no such day!";
        }
    }
}
