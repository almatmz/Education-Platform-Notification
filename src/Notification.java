import java.util.Date;

public final class Notification {
    private final String title;
    private final String message;
    private final Date timestamp;


    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
        this.timestamp = new Date();
    }

    public String getTitle() { return title; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s", timestamp, title, message);
    }
}