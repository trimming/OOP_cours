import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BottleOfWater> listProduct = new ArrayList<>();
        listProduct.add(new BottleOfWater("OOPSeminar", 24, 2));
        listProduct.add(new BottleOfWater("BonAqua", 27, 1));
        listProduct.add(new BottleOfWater("Aqua", 30, 1));
        listProduct.add(new BottleOfWater("AquaBob", 35, 3));
        BottleOfWaterVendingMachine vendingMachine = new BottleOfWaterVendingMachine(listProduct);
        System.out.println(vendingMachine);
    }
}