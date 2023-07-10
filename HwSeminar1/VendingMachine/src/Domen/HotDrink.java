package Domen;

public class HotDrink extends Product {

    // Объявим дополнительное поле температура
    private byte temperature;

    // Создадим конструкторы
    public HotDrink(byte temperature) {
        this.temperature = temperature;
    }

    public HotDrink(int price, byte temperature) {
        super(price);
        this.temperature = temperature;
    }

    public HotDrink(int price, int place, byte temperature) {
        super(price, place);
        this.temperature = temperature;
    }

    public HotDrink(int price, int place, String name, byte temperature) {
        super(price, place, name);
        this.temperature = temperature;
    }

    public HotDrink(int price, int place, String name, long id, byte temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    // Создадим методы установки и возврата значения поля температура
    public byte getTemperature() {
        return temperature;
    }

    public void setTemperature(byte temperature) {
        this.temperature = temperature;
    }

    // Переопределим метод toString для класса HotDrink
    @Override
    public String toString() {
        return super.toString() + "Temperature = " + this.temperature + "\n";
    }

}
