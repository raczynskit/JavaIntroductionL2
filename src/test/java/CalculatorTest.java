import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void shouldAddValues() {
        double sum = Calculator.addValues(6,3);

        Assertions.assertEquals(9, sum);

    }

    @Test
    void ShouldSubtractValues() {
        double sub = Calculator.subtractValues(6,3);

        Assertions.assertEquals(3, sub);
    }

    @Test
    void ShouldMultiplyValues() {
        double mult = Calculator.multiplyValues(6,3);

        Assertions.assertEquals(18, mult);
    }

    @Test
    void ShouldDivideValues() {
        double div = Calculator.divideValues(6,3);

        Assertions.assertEquals(2, div);
    }
}