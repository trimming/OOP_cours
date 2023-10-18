package Calculate;

public abstract class OperationDecorator implements InterfaceCalculate {
    InterfaceCalculate calculate;

    public OperationDecorator(InterfaceCalculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public double getNumber() {
        return calculate.getNumber();
    }
}
