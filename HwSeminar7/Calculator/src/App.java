import Calculator.Logger;
import Calculator.Controller.Controller;
import Calculator.Controller.iCalculable;
import Calculator.Model.Arg;
import Calculator.Model.CalcDecorator;
import Calculator.Model.Calculator;
import Calculator.View.ViewCalculator;

public class App {
    public static void main(String[] args) throws Exception {
        Arg arg = new Arg(0, 0);
        iCalculable calculator = new Calculator(arg);

        iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());
        
        ViewCalculator view = new ViewCalculator(newCalcLog);

        Controller control = new Controller(newCalcLog, view);
        control.run();
    }
}
