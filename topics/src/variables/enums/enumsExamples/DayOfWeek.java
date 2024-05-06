package variables.enums.enumsExamples;

public enum DayOfWeek {
     MONDAY(1, "Monday", true),
    TUESDAY(2, "Tuesday", true),
    WEDNESDAY(3, "Wednesday", true),
    THURSDAY(4, "Thursday", true),
    FRIDAY(5, "Friday", true),
    SATURDAY(6, "Saturday", false),
    SUNDAY(7, "Sunday", false);

    private final int dayNumber;
    private final String name;
    private final boolean isWorkingDay;

    private DayOfWeek(int dayNumber, String name, boolean isWorkingDay) {
        this.dayNumber = dayNumber;
        this.name = name;
        this.isWorkingDay = isWorkingDay;
    }

    public int getDayNumber() {
        return dayNumber;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public static DayOfWeek getByDayNumber(int dayNumber) {
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.dayNumber == dayNumber) {
                return day;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
