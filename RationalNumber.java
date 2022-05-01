public class RationalNumber {
    int numerator, denominator;

    public RationalNumber(int numerator, int denominator) throws Exception {

        if (denominator == 0) {
            System.err.println("You have reached INFINITY!!!!! :)");
            throw new Exception("ERROR");

        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int gcdint(int a, int b) {
        int output;
        if (a == 0) {
            output = b;
        } else if (b == 0) {
            output = a;
        } else if (a > b) {
            output = gcdint(a - b, b);
        } else {
            output = gcdint(a, b - a);
        }
        return output;
    }

    public int simplify(int numerator, int denominator)
    {
        if(numerator<0)
        {
            return gcdint(numerator*(-1), denominator);
        }
        else
        {
            return gcdint(numerator,denominator);
        }
    }

    /**public RationalNumber add(RationalNumber other)
    {

    }**/
}
