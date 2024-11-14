package numberFactory;

class RationalNumber {
    private double value;

    public RationalNumber(double value) {
        this.value = value;
    }

    public double getModulus() {
        return Math.abs(value);
    }
}

class ComplexNumber extends RationalNumber {
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        super(real);
        this.imaginary = imaginary;
    }

    public double getModulus() {
        return Math.sqrt(super.getModulus() * super.getModulus() + imaginary * imaginary);
    }
}

enum NumberType {
    RATIONAL, COMPLEX
}

public class NumberFactory {
    public RationalNumber createNumber(NumberType type, double real, double imaginary) {
        switch (type) {
            case RATIONAL:
                return new RationalNumber(real);
            case COMPLEX:
                return new ComplexNumber(real, imaginary);
            default:
                throw new IllegalArgumentException("Unknown type: " + type);
        }
    }
}

class TestNumberFactory {
    public static void main(String[] args) {
        NumberFactory factory = new NumberFactory();
        RationalNumber rational = factory.createNumber(NumberType.RATIONAL, -10, 0);
        RationalNumber complex = factory.createNumber(NumberType.COMPLEX, -10, 10);
        System.out.println(rational.getModulus());
        System.out.println(complex.getModulus());
    }
}
