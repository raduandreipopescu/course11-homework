package exercise4;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private final WeekDays weekDay;
    private final List<String> activities = new ArrayList<>();

    public DaySchedule(WeekDays weekDay, List<String> activities) {
        this.weekDay = weekDay;
        this.activities.addAll(activities);
    }
}
