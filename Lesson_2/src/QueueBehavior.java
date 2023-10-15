public interface QueueBehavior {
    void takeInQueue(Actor actor);
    void giveOrders();
    void takeOrders();
    void releaseFromQueue();
}
