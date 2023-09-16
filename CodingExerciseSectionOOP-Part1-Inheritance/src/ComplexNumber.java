public class ComplexNumber {

    //instance variables or fields
    private double real;
    private double imaginary;

    //instance constructor to initialize class ComplexNumber fields
    public ComplexNumber(double real, double imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    //getters
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    //instance methods
    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
        add(number.getReal(),number.getImaginary());
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number) {
        subtract(number.getReal(),number.getImaginary());
    }

}
