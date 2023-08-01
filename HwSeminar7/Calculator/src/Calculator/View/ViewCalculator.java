package Calculator.View;

import java.util.Scanner;

import Calculator.Controller.iCalculable;
import Calculator.Controller.iGetView;
import Calculator.Model.Arg;

public class ViewCalculator implements iGetView{

    private iCalculable calculator;

    public ViewCalculator(iCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int realPrimArg = promptInt("Введите вещественную часть первого аргумента: ");
            int complexPrimArg = promptInt("Введите комплексную часть первого аргумента: ");
            Arg primaryArg = new Arg(realPrimArg, complexPrimArg);
            
            calculator.sum(primaryArg);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (+, *, /, =) : ");
                if (cmd.equals("*")) {
                    int realArg = promptInt("Введите вещественную часть второго аргумента: ");
                    int complexArg = promptInt("Введите комплексную часть второго аргумента: ");
                    Arg arg = new Arg(realArg, complexArg);
                    calculator.multi(arg);
                    continue;
                }
                if (cmd.equals("+")) {
                      int realArg = promptInt("Введите вещественную часть второго аргумента: ");
                    int complexArg = promptInt("Введите комплексную часть второго аргумента: ");
                    Arg arg = new Arg(realArg, complexArg);
 
                    calculator.sum(arg);
                    continue;
                }
                if (cmd.equals("/")) {
                                 int realArg = promptInt("Введите вещественную часть второго аргумента: ");
                    int complexArg = promptInt("Введите комплексную часть второго аргумента: ");
                    Arg arg = new Arg(realArg, complexArg);
 
                    calculator.div(arg);
                    continue;
                }
                if (cmd.equals("=")) {
                    Arg result = calculator.getResult();
                    System.out.printf("Результат %f + %f*i\n", result.getRealPart(), result.getComplexPart());
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}