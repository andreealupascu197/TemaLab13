package ro.fasttrackit.code.lab13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DailyPlanner {
    private List<DaySchedule> daySchedules;

    public DailyPlanner() {
        this.daySchedules = new ArrayList<>();
    }

    public void addActivity(DayOfWeek day, String activity) {
        if (activity == null) {
            throw new NoActivityException();
        } else {
            boolean wasAdded = false;
            for (DaySchedule daySchedule : daySchedules) {
                if (daySchedule.getDay().equals(day)) {
                    wasAdded = true;
                    daySchedule.add(activity);
                }
            }
            if (!wasAdded) {
                DaySchedule daySchedule = new DaySchedule(day);
                daySchedule.add(activity);
                daySchedules.add(daySchedule);
            }
        }
    }

    public void removeActivity(DayOfWeek day, String activity) {
        boolean wasFound = false;
        for (DaySchedule daySchedule : daySchedules) {
            if (daySchedule.getDay().equals(day)) {
                List<String> activities = daySchedule.getActivities();
                for (String s : activities) {
                    if (s.equals(activity)) {
                        wasFound = true;
                    }
                }
                if (wasFound) {
                    daySchedule.remove(activity);
                }
            }
        }
        if(!wasFound) {
            throw new NoActivityException();
        }
    }

    public List<String> getActivities(DayOfWeek day) {
        for (DaySchedule daySchedule : daySchedules) {
            if(daySchedule.getDay().equals(day)) {
                return daySchedule.getActivities();
            }
        }
        return new ArrayList<>();
    }

    public Map<DayOfWeek, List<String>> endPlanning() throws NoActivitiesForDayException {
        Map<DayOfWeek, List<String>> plan = new HashMap<>();
        for (DaySchedule daySchedule : daySchedules) {
            plan.put(daySchedule.getDay(), daySchedule.getActivities());
        }
        if(plan.keySet().size() < 7 ) {
            throw new NoActivitiesForDayException();
        }
        return plan;
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "daySchedules=" + daySchedules +
                '}';
    }
}
