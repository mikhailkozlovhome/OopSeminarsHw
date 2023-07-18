package StudentDomen;

import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;
    private String groupNumber;
    private Long grpId;

    public StudentGroup(List<Student> students, String groupNumber, Long grpId) {
        this.students = students;
        this.groupNumber = groupNumber;
        this.grpId = grpId;
    }

    public StudentGroup(List<Student> students, String groupNumber) {
        this.students = students;
        this.groupNumber = groupNumber;
    }

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    // return new StudentGroupIterator(students);
    // }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < students.size();
            }

            @Override
            public Student next() {
                if (!hasNext()) {
                    return null;
                }
                return students.get(counter++);
            }

        };

    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    /**
     * Т.к. имплементирован интерфейс Comparable, для того чтобы можно было
     * использовать сортировку класса StudentSteams по группам, переопределяем метод compareTo.
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.students.size()) {
            if (this.grpId == o.grpId) {
                return 0;
            }
            if (this.grpId < o.grpId) {
                return -1;
            }
            return 1;
        }
        if (this.students.size() < o.students.size()) {
            return -1;
        }
        return 1;
    }

    public Long getGrpId() {
        return grpId;
    }

    public void setGrpId(Long grpId) {
        this.grpId = grpId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group Id: ");
        sb.append(this.grpId);
        sb.append("; Group number: ");
        sb.append(this.groupNumber);
        sb.append("; Number of students: ");
        sb.append(this.students.size());
        sb.append("\n");
        for (Student stud : this) {
            sb.append(stud);
            sb.append("\n");
        }
        return sb.toString();
    }
}
