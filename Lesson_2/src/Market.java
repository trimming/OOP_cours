import java.util.ArrayList;
import java.util.List;

public class Market implements QueueBehavior, MarketBehavior{
    private final List<Actor> queueList;

    public Market(List<Actor> actors) {
        this.queueList = actors;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        this.queueList.add(actor);
        System.out.println("Покупатель " + actor.getName() + " зашел в магазин.");
        takeInQueue(actor);
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println("Покупатель " + actor.getName() + " стал в очередь.");

    }

    @Override
    public void giveOrders() {
        for(Actor actor: this.queueList){
            System.out.println("Покупатель " + actor.getName() + " сделал заказ.");
            actor.setMakeOrder(true);
        }
    }

    @Override
    public void takeOrders() {
        for (Actor actor: this.queueList){
            if (actor.isMakeOrder) System.out.println("Покупатель " + actor.getName() + " получил заказ.");
            actor.setTakeOrder(true);
        }

    }

    @Override
    public void releaseFromQueue() {
        List<Actor> relesesList = new ArrayList<>();
        for(Actor actor: this.queueList){
            if (actor.isTakeOrder) System.out.println("Покупатель " + actor.getName() + " вышел из очереди.");
            relesesList.add(actor);
        }
        releaseFromMarket(relesesList);
    }
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor: actors){
            System.out.println("Покупатель " + actor.getName() + " покинул магазин");
            queueList.remove(actor);
        }
    }

    @Override
    public void update() {
        giveOrders();
        takeOrders();
        releaseFromQueue();
    }

    @Override
    public String toString() {
        return "Сейчас в магазине находятся " +
                this.queueList.size() + " покупателя.";
    }

}
