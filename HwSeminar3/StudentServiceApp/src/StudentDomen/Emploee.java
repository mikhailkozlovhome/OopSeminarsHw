package StudentDomen;

public class Emploee extends User {
    private String jobTitle;

    public Emploee(String firstName, String secondName, int age, String jobTitle) {
        super(firstName, secondName, age);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Emploee [jobTitle=" + jobTitle + "]";
    }

}
