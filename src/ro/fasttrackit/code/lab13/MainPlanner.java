package ro.fasttrackit.code.lab13;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainPlanner {
    public static void main(String[] args) throws NoActivitiesForDayException {
        DailyPlanner dailyPlanner = new DailyPlanner();
        dailyPlanner.addActivity(DayOfWeek.FRIDAY,"dance");
        System.out.println(dailyPlanner);
        dailyPlanner.addActivity(DayOfWeek.FRIDAY,"sleep");
        System.out.println(dailyPlanner);

        System.out.println(dailyPlanner.getActivities(DayOfWeek.FRIDAY));
        dailyPlanner.removeActivity(DayOfWeek.FRIDAY, "sleep");
        System.out.println(dailyPlanner);

        dailyPlanner.addActivity(DayOfWeek.FRIDAY, "walk");
        System.out.println(dailyPlanner);
        System.out.println(dailyPlanner.getActivities(DayOfWeek.FRIDAY));
        dailyPlanner.addActivity(DayOfWeek.MONDAY, "sleep");
        dailyPlanner.addActivity(DayOfWeek.TUESDAY, "work");
        dailyPlanner.addActivity(DayOfWeek.WEDNESDAY, "work");
        dailyPlanner.addActivity(DayOfWeek.THURSDAY, "run");
        dailyPlanner.addActivity(DayOfWeek.SATURDAY, "clean");
        dailyPlanner.addActivity(DayOfWeek.SUNDAY, "sleep");


        try {
            System.out.println(dailyPlanner.endPlanning());
        }
        catch (NoActivitiesForDayException e) {
            System.out.println(e.getMessage());
        }

    }
}
