package homework1;

public class DayOfWeekMain {

    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.MONDAY));

    }

    public static int getWorkingHours(DayOfWeek dayOfWeek) {

        int sumHour = 0;
        for (int i = dayOfWeek.ordinal(); i < 5; i++) {
            int hour = Integer.parseInt(dayOfWeek.getHours());
            sumHour += hour;
        }
        return sumHour;


    }
}
