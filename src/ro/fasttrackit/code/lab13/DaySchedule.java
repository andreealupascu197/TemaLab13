package ro.fasttrackit.code.lab13;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
    private DayOfWeek day;
    private List<String> activities;

    public DaySchedule(DayOfWeek weekday) {
        this.day = weekday;
        this.activities = new ArrayList<>();
    }

    public DayOfWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    public void add(String activity) {
        activities.add(activity);
    }

    public void remove(String activity) {
        activities.remove(activity);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
