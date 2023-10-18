package Calculate;

public class OperationAdd extends OperationDecorator{
    double number;

    public OperationAdd(InterfaceCalculate calculate, double number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public double getNumber() {
        super.getNumber();
        return this.number + super.getNumber();
    }
}
