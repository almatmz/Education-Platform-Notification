import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {
    private final String studentId;
    private final String fullName;
    private final List<Notification> inbox = new ArrayList<>();


    public Student(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }

    @Override
    public  void update(Course course, Notification notification) {
        if (notification == null) return;
        inbox.add(notification);
        System.out.printf("Student '%s'('%s') received notification from '%s': %s\n",
                fullName,studentId, course.getCourseName(), notification.toString());
    }


    public List<Notification> getInbox() {
        return List.copyOf(inbox);
    }
}