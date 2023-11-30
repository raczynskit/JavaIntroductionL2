import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void shouldBeEven() {

        //when
        boolean isTrue = Numbers.isEven(1000);

        //then
        assertTrue(isTrue);
    }

    @Test
    void shouldNotBeEven() {

        //when
        boolean isFalse = Numbers.isEven(1001);

        //then
        assertFalse(isFalse);
    }

    @Test
    void shouldBeOdd() {

        //when
        boolean isTrue = Numbers.isOdd(999);

        //then
        assertTrue(isTrue);
    }

    @Test
    void shouldNotBeOdd() {

        //when
        boolean isFalse = Numbers.isOdd(998);

        //then
        assertFalse(isFalse);
    }
}



