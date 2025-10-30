import java.time.Instant;

public final class Notification {
    private final String title;
    private final String message;
    private final Instant timestamp;


    public Notification(String title, String message) {
        this.title = title;
        this.message = message;
        this.timestamp = Instant.now();
    }

    public String getTitle() { return title; }
    public String getMessage() { return message; }

    @Override
    public String toString() {
        return String.format("[%s] %s - %s", timestamp, title, message);
    }
}