public abstract class Actor implements ActorBehavior{
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
