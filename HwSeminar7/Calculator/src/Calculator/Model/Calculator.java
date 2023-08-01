package Calculator.Model;

import Calculator.Controller.iCalculable;

public class Calculator implements iCalculable {

    private Arg primaryArg;

    public Calculator(Arg primaryArg) {
        this.primaryArg = primaryArg;
    }

    @Override
    public iCalculable sum(Arg arg) {
        primaryArg.setRealPart(primaryArg.getRealPart() + arg.getRealPart());
        primaryArg.setComplexPart(primaryArg.getComplexPart() + arg.getComplexPart());
        return this;
    }

    @Override
    public iCalculable multi(Arg arg) {
        primaryArg.setRealPart(
                primaryArg.getRealPart() * arg.getRealPart() - primaryArg.getComplexPart() * arg.getComplexPart());
        primaryArg.setComplexPart(
                primaryArg.getRealPart() * arg.getRealPart() + primaryArg.getComplexPart() * arg.getComplexPart());
        return this;
    }

    @Override
    public Arg getResult() {
        return primaryArg;
    }

    @Override
    public iCalculable div(Arg arg) {
        primaryArg.setRealPart(
                (primaryArg.getRealPart() * arg.getRealPart() + primaryArg.getComplexPart() * arg.getComplexPart())
                        / (Math.pow(arg.getRealPart(), 2) + Math.pow(arg.getComplexPart(), 2)));

        primaryArg.setComplexPart(
                (primaryArg.getComplexPart() * arg.getRealPart() + primaryArg.getRealPart() * arg.getComplexPart())
                        / (Math.pow(arg.getRealPart(), 2) + Math.pow(arg.getComplexPart(), 2)));

        return this;
    }
}
