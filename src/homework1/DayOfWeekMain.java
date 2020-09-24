package homework1;

public class DayOfWeekMain {

    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.SATURDAY));
    }

    public static String getWorkingHours(DayOfWeek dayOfWeek) {
        return dayOfWeek.getHours();
    }
}
