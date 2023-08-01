package Calculator.Controller;



public class Controller {
    private iCalculable calculator;
    private iGetView view;

    public Controller(iCalculable calculator, iGetView view) {
        this.calculator = calculator;
        this.view = view;
    }

    public void run() {
        // iCalculable calculator = new Calculator(0);

        // iCalculable newCalcLog = new CalcDecorator(calculator, new Logger());

        // ViewCalculator view = new ViewCalculator(newCalcLog);
        this.view.run();
    }

}
