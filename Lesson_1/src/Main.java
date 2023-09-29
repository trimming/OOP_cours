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
        
        List<HotDrink> listDrink = new ArrayList<>();
        listDrink.add(new HotDrink("Coffe", 120, 1, 70);
        listDrink.add(new HotDrink("Tea", 60, 1, 80);
        listDrink.add(new HotDrink("Cocoa", 100, 1, 60);
        HotDrinksVendingMachine hotDrinksVendingMachine = new HotDrinksVendingMachine(listDrink);
        System.out.println(hotDrinksVendingMachine);
    }
}
