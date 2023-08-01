package Calculator.Model;

import Calculator.Logger;
import Calculator.Controller.iCalculable;

public class CalcDecorator implements iCalculable {

    private iCalculable oldCalc;
    private Logger logger;
 
    public CalcDecorator(iCalculable oldCalc, Logger logger) {
        this.oldCalc = oldCalc;
        this.logger = logger;
    }

    @Override
    public iCalculable sum(Arg arg) {
       Arg firstArg = oldCalc.getResult();

       logger.log(String.format("Первое значение калькулятора %f+%f*i. Начало вызова метода sum с параметром %f+%f*i", firstArg.getRealPart(), firstArg.getComplexPart(), arg.getRealPart(), arg.getComplexPart()));
       iCalculable result = oldCalc.sum(arg);
       logger.log(String.format("Вызова метода sum произошел"));

       return result;
    }

    @Override
    public iCalculable multi(Arg arg) {
       Arg firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %f+%f*i. Начало вызова метода multi с параметром %f+%f*i", firstArg.getRealPart(), firstArg.getComplexPart(), arg.getRealPart(), arg.getComplexPart()));
        iCalculable result = oldCalc.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public Arg getResult() {
        Arg result = oldCalc.getResult();
        logger.log(String.format("Получение результата %f+%f*i", result.getRealPart(), result.getComplexPart()));
        return result;
    }

    @Override
    public iCalculable div(Arg arg) {
       Arg firstArg = oldCalc.getResult();
        logger.log(String.format("Первое значение калькулятора %f+%f*i. Начало вызова метода div с параметром %f+%f*i", firstArg.getRealPart(), firstArg.getComplexPart(), arg.getRealPart(), arg.getComplexPart()));
        iCalculable result = oldCalc.div(arg);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }
    
}