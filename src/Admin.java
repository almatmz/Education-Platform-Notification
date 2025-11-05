public class Admin implements Observer {
    private final String name;

    public Admin( String name) {
        this.name = name;
    }

    @Override
    public void update(Course course, Notification notification) {
        if (notification.getTitle().contains("Announcement")) {
            System.out.printf("Admin '%s' noticed announcement on '%s' with id '%s': %s\n", name, course.getCourseName(),course.getCourseId(), notification.getMessage());
        }
    }
}