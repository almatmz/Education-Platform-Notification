import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Course implements Subject {
    private final String courseId;
    private final String courseName;
    private final List<Observer> observers = new ArrayList<>();


    public Course(String courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }


    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }


    @Override
    public void register(Observer observer) {
        if (observer == null) return;
        if (!observers.contains(observer)) observers.add(observer);
    }


    @Override
    public void unregister(Observer observer) {
        if (observer == null) return;
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Notification notification) {
        for (Observer observer : observers) {
            try {
                observer.update(this, notification);
            } catch (Exception e) {
                System.err.println("Failed to notify observer: " + e.getMessage());
            }
        }
    }

    public void addLesson(String lessonTitle) {
        Notification notification = new Notification(
                "New lesson added to " + courseName,
                "Lesson: " + lessonTitle
        );
        notifyObservers(notification);
    }


    public void postAnnouncement(String announcement) {
        Notification notification = new Notification(
                "Announcement for " + courseName,
                announcement
        );
        notifyObservers(notification);
    }
}