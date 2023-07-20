package Domen;

import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup> {
    private byte steamNumber;
    private List<StudentGroup> studentGroups;

    public StudentSteam(byte steamNumber, List<StudentGroup> studentGroups) {
        this.steamNumber = steamNumber;
        this.studentGroups = studentGroups;
    }

    public StudentSteam() {
    }

    public byte getSteamNumber() {
        return steamNumber;
    }

    public void setSteamNumber(byte steamNumber) {
        this.steamNumber = steamNumber;
    }

    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    /**
     * Т.к. имплементирован интерфейс Iterable, для того чтобы можно было
     * использовать циклы для класса StudenGroups, переопределяем метод итератор.
     * Переопределить можно так или, создав отдельный класс аналогично классу
     * StudentGroup и StudentGroupIterator.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                return counter < studentGroups.size();
            }

            @Override
            public StudentGroup next() {
                if (!hasNext()) {
                    return null;
                }
                return studentGroups.get(counter++);
            }

        };
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Steam number: ");
        sb.append(this.steamNumber);
        sb.append("; Number of groups: ");
        sb.append(this.studentGroups.size());
        sb.append("\n");
        for (StudentGroup group : this) {
            sb.append(group);
            sb.append("\n");
        }
        return sb.toString();
    }

}
