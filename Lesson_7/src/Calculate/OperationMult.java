package Calculate;

public class OperationMult extends OperationDecorator{
    ComplexNumber number;

    public OperationMult(InterfaceCalculate calculate, ComplexNumber number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public ComplexNumber getComplexNumber() {
        double newReal = this.number.getReal() * super.getComplexNumber().getReal() -
                this.number.getImaginary() * super.getComplexNumber().getImaginary();
        double newImaginary = this.number.getReal() * super.getComplexNumber().getImaginary() +
                this.number.getImaginary() * super.getComplexNumber().getReal();
        return new ComplexNumber(newReal, newImaginary);
    }
}
