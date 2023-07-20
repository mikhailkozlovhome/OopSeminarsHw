package Controllers;

import Domen.Emploee;
import Services.EmploeeService;

public class EmploeeControler implements iPersonController<Emploee>{
    private final EmploeeService empService = new EmploeeService();

    @Override
    public void create(String firstName, int age) {
        empService.create(firstName, age);
    }

    public static <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getFirstName() + " выплачена заработная плата 10000");
    }
}
