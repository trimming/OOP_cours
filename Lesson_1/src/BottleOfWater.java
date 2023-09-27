public class BottleOfWater extends Product{
    private int volume;
    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "BottleOfWater{" +
                "name" + super.getName() + '\'' +
                "volume=" + this.volume + '\'' +
                ", cost=" + super.getPrice() +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BottleOfWater)) {
            return false;
        }

        BottleOfWater that = (BottleOfWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
                && super.getPrice() == that.getPrice()
                && getVolume() == that.getVolume();
    }
}
