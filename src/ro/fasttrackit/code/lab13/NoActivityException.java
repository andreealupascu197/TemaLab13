package ro.fasttrackit.code.lab13;

public class NoActivityException extends RuntimeException {
    @Override
    public String getMessage() {
        return "No activity found";
    }
}
