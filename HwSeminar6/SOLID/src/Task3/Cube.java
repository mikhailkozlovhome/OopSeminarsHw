package Task3;

// Переписать код в соответствии с Interface Segregation Principle:
// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

// public class Cube implements Shape {
public class Cube implements Shape, VolumetricShape {
    private int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
