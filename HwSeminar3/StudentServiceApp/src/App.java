// 1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
// 2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на кансоль
// 3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке,
// а затем вывести в консоль

// (задача со *)
// 1) Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы
// 2) Переопределить методы ToString классов StudentGroup(выводить идентификатор группы, количество студентов и список студентов) и
// StudentSteam(выводить номер потока, количество групп и список студентов с указанием идентификатора группы)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Mikhail", "Kozlov", 43);
        Student s1 = new Student("Андрей", "Иванов", 25, (long) 105);
        Student s2 = new Student("Иван", "Сидоров", 20, (long) 103);
        Student s3 = new Student("Игорь", "Петров", 20, (long) 106);
        Student s4 = new Student("Егор", "Иванов", 19, (long) 104);
        Student s5 = new Student("Даша", "Цветкова", 19, (long) 101);
        Student s6 = new Student("Лена", "Незабудкина", 20, (long) 107);
        Student s7 = new Student("Виктор", "Беседин", 19, (long) 115);
        Student s8 = new Student("Виктория", "Гутова", 18, (long) 114);
        Student s9 = new Student("Гузяль", "Абдуллина", 21, (long) 110);
        Student s10 = new Student("Михаил", "Юрзов", 18, (long) 108);
        Student s11 = new Student("Анастасия", "Комарова", 21, (long) 109);
        Student s12 = new Student("Анна", "Галкина", 20, (long) 113);
        Student s13 = new Student("Сергей", "Дмитриевский", 25, (long) 112);
        Student s14 = new Student("Татьяна", "Иванова", 18, (long) 111);
        Student s15 = new Student("Роман", "Егоров", 18, (long) 102);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s5);
        listStud2.add(s6);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s7);
        listStud3.add(s8);
        listStud3.add(s9);
        List<Student> listStud4 = new ArrayList<Student>();
        listStud4.add(s10);
        listStud4.add(s11);
        List<Student> listStud5 = new ArrayList<Student>();
        listStud5.add(s12);
        listStud5.add(s13);
        listStud5.add(s14);
        listStud5.add(s15);

        StudentGroup group1 = new StudentGroup(listStud1, "Group 1", (long) 205);
        StudentGroup group2 = new StudentGroup(listStud2, "Group 2", (long) 204);
        StudentGroup group3 = new StudentGroup(listStud3, "Group 3", (long) 203);
        StudentGroup group4 = new StudentGroup(listStud4, "Group 4", (long) 202);
        StudentGroup group5 = new StudentGroup(listStud5, "Group 5", (long) 201);

        List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        listGroup.add(group1);
        listGroup.add(group2);
        listGroup.add(group3);
        listGroup.add(group4);
        listGroup.add(group5);

        StudentSteam steam = new StudentSteam((byte) 1, listGroup);

        // System.out.println(u1);
        // System.out.println(s1);

        // for (Student stud : group) {
        // System.out.println(stud);
        // }

        // Collections.sort(group.getStudents());

        // for (Student stud : group) {
        // System.out.println(stud);
        // }
        // System.out.println(group);

        System.out.println("======================Неотсортированнный поток======================");

        /**
         * Для того чтобы можно было использовать цикл для класса StudentSteam
         * необходимо импелементировать интерфейс Iterable в классе StudentSteam, см.
         * StudentSteam.java, метод
         * Iterator
         */

        // for (StudentGroup group : steam.getStudentGroups()) {
        // System.out.println("Группа " + group.getGroupNumber() +
        // "====================================");
        // for (Student stud : group) {
        // System.out.println(stud);
        // }
        // System.out.println();
        // }
        for (StudentGroup group : steam) {
            System.out.println(group);
            System.out.println();
        }
        /**
         * Для того чтобы можно было отсортировать класс StudentSteam по группам
         * необходимо импелементировать интерфейс Comparable в классе StudentGroup, см.
         * StudentGroup.java, метод
         * compareTo
         */
        Collections.sort(steam.getStudentGroups());

        System.out.println();
        System.out.println("======================Отсортированнный поток======================");

        // for (StudentGroup group : steam.getStudentGroups()) {
        // System.out.println(group);
        // System.out.println();
        // }
        System.out.println(steam);
    }

}
