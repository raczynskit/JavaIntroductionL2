import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void isNumberEven() {

    //given
        int i = 1000;

    //when
        boolean number = Numbers.checkIfNumberIsEven(1000);

    //then
        assertTrue(number);
    }

    @Test
    void isNumberOdd() {

    //given
        int i = 999;

    //when
        boolean number = Numbers.checkIfNumberIsOdd(999);

    //then
        assertTrue(number);
    }
}



