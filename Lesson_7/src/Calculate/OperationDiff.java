package Calculate;

public class OperationDiff extends OperationDecorator{
    ComplexNumber number;

    public OperationDiff(InterfaceCalculate calculate, ComplexNumber number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public ComplexNumber getComplexNumber() {
        double newReal = this.number.getReal() - super.getComplexNumber().getReal();
        double newImaginary = this.number.getImaginary() - super.getComplexNumber().getImaginary();
        return new ComplexNumber(newReal, newImaginary);
    }
}
