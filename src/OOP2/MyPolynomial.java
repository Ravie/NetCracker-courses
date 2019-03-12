package OOP2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double ...coeffs)
    {
        this.coeffs = new double[coeffs.length];
        for(int i = 0; i < coeffs.length; i++)
            this.coeffs[(coeffs.length - 1) - i] = coeffs[i];
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder polynom = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (coeffs[i] != 0.0){
                if (coeffs[i] > 0.0)
                    polynom.append("+" + coeffs[i] + "x^" + i);
                else
                    polynom.append(coeffs[i] + "x^" + i);
            }
        }
        return polynom.toString();
    }

    public MyPolynomial add(MyPolynomial right) {
        int minDegree = (right.getDegree() < this.getDegree()) ? right.getDegree() : this.getDegree();
        int maxDegree = (right.getDegree() > this.getDegree()) ? right.getDegree() : this.getDegree();
        MyPolynomial result = new MyPolynomial(new double[maxDegree + 1]);
        for (int i = 0; i <= minDegree; i++)
            result.coeffs[i] = this.coeffs[i] + right.coeffs[i];
        for (int i = minDegree + 1; i <= maxDegree; i++) {
            if (right.getDegree() < this.getDegree()) {
                result.coeffs[i] = this.coeffs[i];
            } else if (right.getDegree() > this.getDegree()) {
                result.coeffs[i] = right.coeffs[i];
            }
        }
        return result;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        MyPolynomial result = new MyPolynomial(new double[this.getDegree() + right.getDegree() + 1]);
        for (int i = 0; i <= this.getDegree(); i++)
            for (int j = 0; j <= right.getDegree(); j++)
                result.coeffs[i + j] += this.coeffs[i] * right.coeffs[j];
        return result;
    }

    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1,0,1,0,-3,-3,8,2,-5);
        MyPolynomial p2 = new MyPolynomial(    3,0,5,0,-4,-9,21);
        System.out.println(p1.add(p2).toString());
    }
}
