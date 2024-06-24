package variables.enums.enumsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    
    public static void main(String[] args) {
        List<DayOfWeek> workingDays = getWorkingDays();
        printWorkingDaysList(workingDays);

        //example method in enum class getByDayNumber
        Random random = new Random();
        int randomNumber = random.nextInt(7)+1;
        DayOfWeek randomDay = DayOfWeek.getByDayNumber(randomNumber);
        System.out.println("random day: " + randomDay );
    }

    private static List<DayOfWeek> getWorkingDays() {
        List<DayOfWeek> workingDays = new ArrayList<>();
        for (DayOfWeek day : DayOfWeek.values()) {
            if (day.isWorkingDay()) {
                workingDays.add(day);
            }
        }
        return workingDays;
    }

    private static void printWorkingDaysList(List<DayOfWeek>workingDays){
        System.out.println(" Working days: ");
        for (DayOfWeek day : workingDays) {
            System.out.println(day.getName());
        }
    }


}
