# Enums

Enums in Java are a special data type used to represent a fixed set of constants. The keyword enum is used to declare an enum type. Each constant in an `enum` is an instance of that enum type.
```
public enum Direction {
    NORTH, SOUTH, EAST, WEST
}
```

Enums are often used to represent a predefined set of values, like days of the week, menu options, or cardinal directions.

## HOW TO USE Direction `enum`

### Cardinal Points example : 
```
public class Examplw {
    public static void main(String[] args) {
        Direccion miDir = Direction.NORTE;
        System.out.println("My direction is : " + miDir);
    }
}
```

### Days of the week example :
This example of enum to represent days of the week with additional attributes such as the day number and boolean working day or not.

```
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
}
```
 Making the constructor private in enums is a good practice to enforce that the enum constants are defined within the enum itself and cannot be instantiated elsewhere in the program. 