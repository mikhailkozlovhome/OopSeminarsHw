package Task1;

public class CalculateSalary {
    public int calculateNetSalary(Employee emp) {
        int tax = (int) (emp.getBaseSalary() * 0.25);
        return emp.getBaseSalary() - tax;
    }
}
