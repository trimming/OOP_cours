public class HotDrink extends BottleOfWater{
    private int temperature;

    public HotDrink(String name, double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrink{" +
                "name" + super.getName() + '\'' +
                "volume=" + super.getVolume() + '\'' +
                "temperature=" + temperature +
                '}';
    }
}
