import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTests {

    @Test
    public void testSimplify() {
        assertEquals(new Rational(1,2).toString(), Rational.simplify(new Rational(2,4)).toString(), "The rational 2/4 when simplified should be: 1/2");
        assertEquals(new Rational(1,2).toString(), Rational.simplify(new Rational(1,2)).toString(), "The rational 1/2 when simplified should be: 1/2");
        assertEquals(new Rational(3,4).toString(), Rational.simplify(new Rational(9,12)).toString(), "The rational 9/12 when simplified should be: 3/4");
    }

    @Test
    public void testStaticAdd() {
        assertEquals(new Rational(5,6).toString(), Rational.add(new Rational(1,2), new Rational(1,3)).toString(), "The sum of 1/2 and 1/3 should be: 5/6");
        assertEquals(new Rational(1,1).toString(), Rational.add(new Rational(1,2), new Rational(1,2)).toString(), "The sum of 1/2 and 1/2 should be: 1/1");
        assertEquals(new Rational(1,2).toString(), Rational.add(new Rational(1,4), new Rational(1,4)).toString(), "The sum of 1/4 and 1/4 should be: 1/2");
    }

    @Test
    public void testStaticSubtract() {
        assertEquals(new Rational(1,6).toString(), Rational.subtract(new Rational(1,2), new Rational(1,3)).toString(), "The difference of 1/2 and 1/3 should be: 1/6");
        assertEquals(new Rational(1,4).toString(), Rational.subtract(new Rational(1,2), new Rational(1,4)).toString(), "The difference of 1/2 and 1/4 should be: 1/4");
        assertEquals(new Rational(1,3).toString(), Rational.subtract(new Rational(5,12), new Rational(1,12)).toString(), "The difference of 5/12 and 1/12 should be: 1/3");
    }

    @Test
    public void testStaticMultiply() {
        assertEquals(new Rational(1,6).toString(), Rational.multiply(new Rational(1,2), new Rational(1,3)).toString(), "The product of 1/2 and 1/3 should be: 1/6");
        assertEquals(new Rational(1,3).toString(), Rational.multiply(new Rational(2,3), new Rational(1,2)).toString(), "The product of 2/3 and 1/2 should be: 1/3");
        assertEquals(new Rational(5,22).toString(), Rational.multiply(new Rational(5,12), new Rational(6,11)).toString(), "The product of 5/12 and 6/11 should be: 5/22");
    }

    @Test
    public void testStaticDivide() {
        assertEquals(new Rational(2,3).toString(), Rational.divide(new Rational(1,3), new Rational(1,2)).toString(), "The quotient of 1/3 and 1/2 should be: 2/3");
        assertEquals(new Rational(3,4).toString(), Rational.divide(new Rational(1,2), new Rational(2,3)).toString(), "The quotient of 1/2 and 2/3 should be: 3/4");
        assertEquals(new Rational(1,2).toString(), Rational.divide(new Rational(1,4), new Rational(1,2)).toString(), "The quotient of 1/4 and 1/2 should be: 1/2");
    }
}
