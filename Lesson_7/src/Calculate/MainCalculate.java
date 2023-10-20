package Calculate;

public class MainCalculate implements InterfaceCalculate{
    ComplexNumber number;

    public MainCalculate(ComplexNumber number) {
        this.number = number;
    }

    @Override
    public ComplexNumber getComplexNumber() {
        return this.number;
    }
}
