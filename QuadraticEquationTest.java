package Equation;

import Equation.QuadraticEquation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuadraticEquationTest {
    @Test
    void testTwoRoots() {
        QuadraticEquation equation = new QuadraticEquation(1, -3, 2);
        equation.solve();
        Assertions.assertEquals(1.0, equation.getx1(), 0.1);
        Assertions.assertEquals(2.0, equation.getx2(), 0.1);
    }

    @Test
    void testOneRoot() {
        QuadraticEquation equation = new QuadraticEquation(1, -4, 4);
        equation.solve();
        Assertions.assertEquals(2, equation.getx(), 0.1);
    }

    @Test
    void testNoRealRoots() {
        QuadraticEquation equation = new QuadraticEquation(2, 1, 3);
        equation.solve();
        Assertions.assertTrue(Double.isNaN(equation.getx1()));
        Assertions.assertTrue(Double.isNaN(equation.getx2()));
    }
}
