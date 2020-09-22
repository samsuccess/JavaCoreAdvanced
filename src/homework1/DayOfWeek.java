package homework1;

public enum DayOfWeek {
    MONDAY("8"),
    TUESDAY("8"),
    WEDNESDAY("8"),
    THURSDAY("8"),
    FRIDAY("8"),
    SATURDAY("today is a day off"),
    SUNDAY("today is a day off8");

    private String hours;

    DayOfWeek(String hours) {
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }
}
