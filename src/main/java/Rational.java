public class Rational {
    // instance variables: every Rational object will have its own copy
    // of these variables
    public int numerator;
    public int denominator;
    
    /**
     * Constructor: the special method that will actually create a new Rational
     * object
     * Constructors are always public
     * Constructors have the same name as the class
     * Constructors have no return type
     */
    public Rational(int a, int b) {
        numerator = a;
        denominator = b;
    }
    
    // This method takes two Rationals, add them up,
    // and returns a Rational equal to the sum
    // You will need to:
    // 1) Calculate the value of the new numerator
    // 2) Calculate the value of the new denominator
    // 3) Create a new Rational variable with the two above values
    // 4) Return your new Rational variable
    // (When you write the simplify method later on, you should
    // also call it in this method to return the simplified result)
    public static Rational add(Rational r, Rational s) {
        Rational added = new Rational(0,1);
        int numerator = r.numerator*s.denominator+s.numerator*r.denominator;
        int denominator = r.denominator*s.denominator;
        added.numerator = numerator;
        added.denominator = denominator;
        return Rational.simplify(added);
    }

    // This method takes two Rationals, subtracts thems up, 
    // and returns a Rational equal to the difference
    public static Rational subtract(Rational r, Rational s) {
        Rational difference = new Rational(0,1);
        int numerator = r.numerator*s.denominator-s.numerator*r.denominator;
        int denominator = r.denominator*s.denominator;
        if (numerator<0&&denominator<0){
            numerator*=-1;
            denominator*=-1;
        }
        difference.numerator = numerator;
        difference.denominator = denominator;
        return Rational.simplify(difference);
    }
    
    public static Rational multiply(Rational r, Rational s) {
        Rational product = new Rational(0,1);
        int numerator = r.numerator*s.numerator;
        int denominator = r.denominator*s.denominator;
        if (numerator<0&&denominator<0){
            numerator*=-1;
            denominator*=-1;
        }
        product.numerator = numerator;
        product.denominator = denominator;
        return Rational.simplify(product);
    }
    
    public static Rational divide(Rational r, Rational s) {
        Rational quotient = new Rational(0,1);
        int numerator = r.numerator*s.denominator;
        int denominator = r.denominator*s.numerator;
        if (numerator<0&&denominator<0){
            numerator*=-1;
            denominator*=-1;
        }
        quotient.numerator = numerator;
        quotient.denominator = denominator;
        return Rational.simplify(quotient);
    }

    // Finds the greatest common factor between a and b
    // To find the greatest common factor, find the largest number x
    // such that a and b are both multiples of x
    public static int greatestCommonFactor(int a, int b){
        int gcf = 1;
        for(int i = 1;i<=Math.min(a,b);i++){
            if(a%i==0&&b%i==0)
                gcf = i;
        }
        return gcf;
    }

    // This method is given a rational, and returns a simplified version
    // of the input rational
    // Use the greatestCommonFactor method here
    // e.g. simplify(2/4) => 1/2
    //      simplify(1/2) => 1/2
    public static Rational simplify(Rational r) {
        int gcf = Rational.greatestCommonFactor(r.numerator,r.denominator);
        r.numerator/=gcf;
        r.denominator/=gcf;
        return r;
    }

    // This following method is NOT static, we'll talk about it next class!
    // This returns a string representation of a Rational (e.g. "1/2")
    @Override
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}













