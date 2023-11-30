import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void isNumberEvenTrue() {

    //given
        int i = 1000;

    //when
        boolean number = Numbers.checkIfNumberIsEven(1000);

    //then
        assertTrue(number);
    }

    @Test
    void isNumberEvenFalse() {

        //given
        int i = 1001;

        //when
        boolean number = Numbers.checkIfNumberIsEven(1001);

        //then
        assertFalse(number);
    }

    @Test
    void isNumberOddTrue() {

    //given
        int i = 999;

    //when
        boolean number = Numbers.checkIfNumberIsOdd(999);

    //then
        assertTrue(number);
    }

    @Test
    void isNumberOddFalse() {

        //given
        int i = 998;

        //when
        boolean number = Numbers.checkIfNumberIsOdd(998);

        //then
        assertFalse(number);
    }
}



