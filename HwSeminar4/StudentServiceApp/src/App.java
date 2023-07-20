// 1) Создать класс TeacherService и реализовать аналогично проделанному на семинаре. Подключить обобщенный интерфейс iPersonService. Добавить метод вывода списка учителей отсортированного обобщенным классом PersonComparator
// 2) Создать класс TeacherController. Подключить к классу обобщенный интерфейс iPersonController.
// 3) Разработать обобщенный класс AverageAge для подсчета среднего возраста студентов, учителей и работников. Вывести результат работы класса на консоль.

// (Задача со *) Переписать иерархию Person->Student/Teacher/Emploee в иерархию обобщенных типов.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeControler;
import Domen.Emploee;
import Domen.Person;
import Domen.PersonComparator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentSteam;
import Domen.Teacher;
import Services.AverageAge;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        // Person u1 = new Person("Mikhail", "Kozlov", 43);
        // Student s1 = new Student("Андрей", "Иванов", 25, (long) 105);
        // Student s2 = new Student("Иван", "Сидоров", 20, (long) 103);
        // Student s3 = new Student("Игорь", "Петров", 20, (long) 106);
        // Student s4 = new Student("Егор", "Иванов", 19, (long) 104);
        // Student s5 = new Student("Даша", "Цветкова", 19, (long) 101);
        // Student s6 = new Student("Лена", "Незабудкина", 20, (long) 107);
        // Student s7 = new Student("Виктор", "Беседин", 19, (long) 115);
        // Student s8 = new Student("Виктория", "Гутова", 18, (long) 114);
        // Student s9 = new Student("Гузяль", "Абдуллина", 21, (long) 110);
        // Student s10 = new Student("Михаил", "Юрзов", 18, (long) 108);
        // Student s11 = new Student("Анастасия", "Комарова", 21, (long) 109);
        // Student s12 = new Student("Анна", "Галкина", 20, (long) 113);
        // Student s13 = new Student("Сергей", "Дмитриевский", 25, (long) 112);
        // Student s14 = new Student("Татьяна", "Иванова", 18, (long) 111);
        // Student s15 = new Student("Роман", "Егоров", 18, (long) 102);

        // List<Student> listStud1 = new ArrayList<Student>();
        // listStud1.add(s1);
        // listStud1.add(s2);
        // listStud1.add(s3);
        // listStud1.add(s4);
        // List<Student> listStud2 = new ArrayList<Student>();
        // listStud2.add(s5);
        // listStud2.add(s6);
        // List<Student> listStud3 = new ArrayList<Student>();
        // listStud3.add(s7);
        // listStud3.add(s8);
        // listStud3.add(s9);
        // List<Student> listStud4 = new ArrayList<Student>();
        // listStud4.add(s10);
        // listStud4.add(s11);
        // List<Student> listStud5 = new ArrayList<Student>();
        // listStud5.add(s12);
        // listStud5.add(s13);
        // listStud5.add(s14);
        // listStud5.add(s15);

        // StudentGroup group1 = new StudentGroup(listStud1, "Group 1", (long) 205);
        // StudentGroup group2 = new StudentGroup(listStud2, "Group 2", (long) 204);
        // StudentGroup group3 = new StudentGroup(listStud3, "Group 3", (long) 203);
        // StudentGroup group4 = new StudentGroup(listStud4, "Group 4", (long) 202);
        // StudentGroup group5 = new StudentGroup(listStud5, "Group 5", (long) 201);

        // List<StudentGroup> listGroup = new ArrayList<StudentGroup>();
        // listGroup.add(group1);
        // listGroup.add(group2);
        // listGroup.add(group3);
        // listGroup.add(group4);
        // listGroup.add(group5);

        // StudentSteam steam = new StudentSteam((byte) 1, listGroup);

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

        // System.out.println("======================Неотсортированнный
        // поток======================");

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
        // for (StudentGroup group : steam) {
        // System.out.println(group);
        // System.out.println();
        // }
        /**
         * Для того чтобы можно было отсортировать класс StudentSteam по группам
         * необходимо импелементировать интерфейс Comparable в классе StudentGroup, см.
         * StudentGroup.java, метод
         * compareTo
         */
        // Collections.sort(steam.getStudentGroups());

        // System.out.println();
        // System.out.println("======================Отсортированнный
        // поток======================");

        // for (StudentGroup group : steam.getStudentGroups()) {
        // System.out.println(group);
        // System.out.println();
        // }
        // System.out.println(steam);

        // Student s1 = new Student("Андрей", "Иванов", 25, (long) 105);
        // Student s2 = new Student("Иван", "Сидоров", 20, (long) 103);

        // Student s1 = new Student("Андрей", "Иванов", 25, (long) 105);
        // Student s2 = new Student("Иван", "Сидоров", 20, (long) 103);

        // PersonComparator<Student> comS = new PersonComparator<Student>();
        // comS.compare(s1, s2);

        // Teacher t1 = new Teacher("Андрей", "Иванов", 25, "Docent", (long) 301);
        // Teacher t2 = new Teacher("Иван", "Сидоров", 20, "Professor", (long) 302);

        // PersonComparator<Teacher> comT = new PersonComparator<Teacher>();
        // System.out.println(comT.compare(t1, t2));

        // PersonComparator<Person> comP = new PersonComparator<Person>();
        // comP.compare(s1, t2);

        // Emploee e1 = new Emploee("Федор", "Иванов", 45, "разнорабочий");
        // // EmploeeControler empControll = new EmploeeControler();
        // // empControll.paySalary(e1);
        // EmploeeControler.paySalary(e1);

        TeacherService teachSrv = new TeacherService();

        teachSrv.create("Иван", 21);
        teachSrv.create("Андрей", 22);
        teachSrv.create("Федор", 23);
        teachSrv.create("Сергей", 24);
        teachSrv.create("Лука", 25);

        System.out.println(teachSrv.getSortTeachLstToStr());

        AverageAge<Teacher> avrgAge = new AverageAge<Teacher>();
        System.out.println("Средний возраст преподавателей равен: " + avrgAge.getAverageAge(teachSrv.getAll()));

    }

}
