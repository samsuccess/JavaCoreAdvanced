package homework1;

public enum DayOfWeek {
    MONDAY("40"),
    TUESDAY("32"),
    WEDNESDAY("24"),
    THURSDAY("16"),
    FRIDAY("8"),
    SATURDAY("today is a day off"),
    SUNDAY("today is a day off");

    private String hours;

    DayOfWeek(String hours) {
        this.hours = hours;
    }

    public String getHours() {
        return hours;
    }
}
