package Calculate;

public class OperationDiv extends OperationDecorator{
    ComplexNumber number;

    public OperationDiv(InterfaceCalculate calculate, ComplexNumber number) {
        super(calculate);
        this.number = number;
    }

    @Override
    public ComplexNumber getComplexNumber() {
        double denominator = Math.pow(super.getComplexNumber().getReal(), 2) + Math.pow(super.getComplexNumber().getImaginary(), 2);
        double newReal = (complexNumberOne.getReal() * super.getComplexNumber().getReal() +
                complexNumberOne.getImaginary() * super.getComplexNumber().getImaginary()) / denominator;
        double newImaginary = (complexNumberOne.getImaginary() * super.getComplexNumber().getReal() -
                complexNumberOne.getReal() * super.getComplexNumber().getImaginary()) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }
}
