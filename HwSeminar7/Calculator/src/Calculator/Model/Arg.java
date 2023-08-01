package Calculator.Model;

public class Arg {
    private double realPart;
    private double complexPart;

    public Arg(double realPart, double complexPart) {
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getComplexPart() {
        return complexPart;
    }

    public void setComplexPart(double complexPart) {
        this.complexPart = complexPart;
    }
}
