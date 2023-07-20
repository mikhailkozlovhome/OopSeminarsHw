package Controllers;

import Domen.Teacher;

import Services.TeacherService;

public class TeacherController implements iPersonController<Teacher>{
        private final TeacherService teachService = new TeacherService();


    //Метод регистрации преподавателя в базе данных
    @Override
    public void create(String firstName, int age) {
        teachService.create(firstName, age);
        teachService.sortbyFIOStdLst();
    }
}
