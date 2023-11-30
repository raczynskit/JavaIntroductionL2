import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificatorTest {

    @Test
    void isAgeLessThan18() {

    //given
        int i = 17;

    //when
        boolean age = AgeVerificator.isAdult(17);

    //then
        assertFalse(age);
    }

    @Test
    void isAgeEqualOrGreaterThan18() {

    //given
        int i = 18;

    //when
        boolean age = AgeVerificator.isAdult(18);

    //then
        assertTrue(age);
    }
}
