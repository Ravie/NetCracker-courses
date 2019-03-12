package OOP2;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {}

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        if(!isImaginary())
            return "(" + real + ")";
        else if(!isReal())
            return "(" + imag + "i)";
        else
            return "(" + real + "+" + imag + "i)";
    }

    public boolean isReal() {
        return (real != 0.0);
    }

    public boolean isImaginary() {
        return (imag != 0.0);
    }

    public boolean equals(double real, double imag) {
        return Double.compare(this.real, real) == 0 &&
                Double.compare(this.imag, imag) == 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyComplex myComplex = (MyComplex) o;
        return Double.compare(myComplex.real, real) == 0 &&
                Double.compare(myComplex.imag, imag) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imag);
    }

    public double magnitude() {
        return Math.hypot(real,imag);
    }

    public double argument() {
        return Math.toRadians(Math.atan2(imag,real));
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        MyComplex result = new MyComplex(this.real + right.real, this.imag + right.imag);
        return result;
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        MyComplex result = new MyComplex(this.real - right.real, this.imag - right.imag);
        return result;
    }

    public MyComplex multiply(MyComplex right) {
        this.real = this.real * right.real - (this.imag * right.imag);
        this.imag = this.real * right.imag + (this.imag * right.real);
        return this;
    }

    public MyComplex divide(MyComplex right) {
        try {
            double denom = Math.pow(right.real, 2) + Math.pow(right.imag, 2);
            if (denom == 0.0)
                throw new ArithmeticException("Denominator is 0");
            this.real = (this.real * right.real + (this.imag * right.imag)) / denom;
            this.imag = (right.real * this.imag - (this.real * right.imag)) / denom;
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        return this;
    }

    public MyComplex conjugate() {
        this.imag *= -1;
        return this;
    }

    public static void main(String[] args) {
        MyComplex numerator = new MyComplex(1.0, 1.0);
        MyComplex denominator = new MyComplex(0.0, 0.0);
        MyComplex c1 = new MyComplex(0.0, 1.0);
        MyComplex c2 = new MyComplex(1.0, 0.0);
        numerator.divide(denominator);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(denominator.toString());
    }
}
