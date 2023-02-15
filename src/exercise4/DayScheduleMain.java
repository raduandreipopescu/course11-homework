package exercise4;

import java.util.Arrays;

public class DayScheduleMain {
    public static void main(String[] args) {
        DaySchedule mondaySchedule = new DaySchedule(WeekDays.MONDAY, Arrays.asList("Wash the car", "Attend Java course"));
        DaySchedule tuesdaySchedule = new DaySchedule(WeekDays.TUESDAY, Arrays.asList("Recap the Java course", "Do Java course homework"));
    }
}
