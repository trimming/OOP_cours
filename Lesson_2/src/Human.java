public class Human extends Actor{
    @Override
    public String getName() {
        String nameHuman = super.name;
        return nameHuman;
    }

    @Override
    public void setMakeOrder(boolean isMakeOrder) {
        super.isMakeOrder = isMakeOrder;
    }

    public Human(String name) {
        super(name);
    }

    @Override
    public void setTakeOrder(boolean isTakeOrder) {
        super.isTakeOrder = isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return false;
    }

    @Override
    public boolean isTakeOrder() {
        return false;
    }
}
