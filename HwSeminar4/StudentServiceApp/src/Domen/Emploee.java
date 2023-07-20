package Domen;

public class Emploee extends Person {
    private String special;

    public Emploee(String firstName, String secondName, int age, String special) {
        super(firstName, secondName, age);
        this.special = special;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String jobTitle) {
        this.special = jobTitle;
    }

    @Override
    public String toString() {
        return "Emploee [jobTitle=" + special + "]";
    }

}
