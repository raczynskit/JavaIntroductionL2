import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class AgeVerificatorTest {

    @Test
    void shouldNotBeAdult() {

        //when
        boolean isFalse = AgeVerificator.isAdult(17);

        //then
        assertFalse(isFalse);
    }

    @Test
    void shouldBeAdult() {

        //when
        boolean isTrue = AgeVerificator.isAdult(18);

        //then
        assertTrue(isTrue);
    }
}
