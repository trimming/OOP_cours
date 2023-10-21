package Calculate;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        if(imaginary == 0) {
            return "ComplexNumber = " + real;
        } else if(real == 0){
            return "ComplexNumber = " + imaginary + "i";
        }
        else{
            return "ComplexNumber = " +
                    real + " + " +
                    imaginary + "i";
        }
    }
}
