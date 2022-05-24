package ro.fasttrackit.code.lab13;

public class NoActivitiesForDayException extends Exception {
    @Override
    public String getMessage() {
        return "No activities found";
    }
}
