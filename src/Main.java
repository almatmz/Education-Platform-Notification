public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course("c01", "Software Design Patterns");


        Student almat = new Student("s001", "Almat Muzdybay");
        Student era = new Student("s002", "Erasyl Umirbay");
        Admin admin = new Admin( "Cristiano Ronaldo");

        javaCourse.register(almat);
        javaCourse.register(era);
        javaCourse.register(admin);


        javaCourse.addLesson("Observer Pattern");
        javaCourse.postAnnouncement("Practice session on Friday at 13:00.");

        javaCourse.unregister(almat);

        javaCourse.addLesson("Visitor Pattern");

        System.out.println("Era's inbox size: " + era.getInbox().size());
        System.out.println("Almat's inbox size: " + almat.getInbox().size());
        }
}