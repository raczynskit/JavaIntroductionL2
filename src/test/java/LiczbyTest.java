import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiczbyTest {

    @Test
    void shouldCheckIfNumberIsEven() {
        String number = Liczby.checkEvenOrOdd(1000);
        String expectedResult = "Liczba jest parzysta";

        assertEquals (expectedResult, number);
    }

    @Test
    void shouldCheckIfNumberIsOdd() {
        String number = Liczby.checkEvenOrOdd(9999);
        String expectedResult = "Liczba jest nieparzysta";

        assertEquals(expectedResult, number);
    }
}



