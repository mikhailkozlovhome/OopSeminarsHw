package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComparator;
import Domen.Teacher;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String firstName, int age) {
        Teacher teach = new Teacher(firstName, age, "Docent", (long) count);
        count++;
        teachers.add(teach);
    }

    public void sortbyFIOStdLst() {
        teachers.sort(new PersonComparator<Teacher>());
    };

    public String getSortTeachLstToStr() {
        StringBuilder sb = new StringBuilder();

        sortbyFIOStdLst();

        for (Teacher teach : teachers) {
            sb.append(teach);
            sb.append("\n");
        }
        return sb.toString();
    }
}
