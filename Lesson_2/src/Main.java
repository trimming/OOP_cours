import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Actor youngWoman = new Human("Ilona");
        Actor oldLady = new Human("Carmella");

        Market freshFish = new Market(new ArrayList<>());
        freshFish.acceptToMarket(oldLady);
        freshFish.acceptToMarket(youngWoman);
        freshFish.update();
        System.out.println(freshFish);
    }
}