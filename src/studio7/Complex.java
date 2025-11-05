package studio7;

public class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex that) {
        double newReal = this.real + that.real;
        double newImaginary = this.imaginary + that.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex that) {
        double newReal = this.real * that.real - this.imaginary * that.imaginary;
        double newImaginary = this.real * that.imaginary + this.imaginary * that.real;
        return new Complex(newReal, newImaginary);
    }


}
