package Domen;

public class Teacher extends Person {
    private String acadDegree;
    private Long id;

    public Teacher(String firstName, String secondName, int age, String acadDegree, Long id) {
        super(firstName, secondName, age);
        this.acadDegree = acadDegree;
        this.id = id;
    }

    public Teacher(String firstName, int age, String acadDegree, Long id) {
        super(firstName, age);
        this.acadDegree = acadDegree;
        this.id = id;
    }

    public String getaAcadDegree() {
        return acadDegree;
    }

    public void setAcadDegree(String subject) {
        this.acadDegree = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher [firstName=" + super.getFirstName() + ", secondName=" + super.getSecondName() + ", age="
                + super.getAge() + ", acadDegree=" + acadDegree + ", id=" + id + "]";
    }
}
