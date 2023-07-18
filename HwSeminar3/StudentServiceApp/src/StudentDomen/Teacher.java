package StudentDomen;

public class Teacher extends User {
    private String subject;
    private Long id;

    public Teacher(String firstName, String secondName, int age, String subject, Long id) {
        super(firstName, secondName, age);
        this.subject = subject;
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher [subject=" + subject + ", id=" + id + "]";
    }
}
