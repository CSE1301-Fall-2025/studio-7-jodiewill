public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction that) {
        int newNumerator = this.numerator * that.denominator + that.numerator * this.denominator;
        int newDenominator = this.denominator * that.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction that) {
        int newNumerator = this.numerator * that.numerator;
        int newDenominator = this.denominator * that.denominator;
        return new Fraction(newNumerator, newDenominator);
    }


}
