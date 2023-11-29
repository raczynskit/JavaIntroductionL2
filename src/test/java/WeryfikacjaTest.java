import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeryfikacjaTest {

    @Test
    void shouldCheckIfAgeErrors() {
        String age = Weryfikacja.isEqualOrOlderThan18(-1);
        String expectedResult = "Podany wiek nie jest poprawny.";

        assertEquals(expectedResult, age);
    }

    @Test
    void shouldCheckIfAgeIsLessThan18() {
        String age = Weryfikacja.isEqualOrOlderThan18(17);
        String expectedResult = "Wiek jest mniejszy od 18.";

        assertEquals(expectedResult, age);
    }

    @Test
    void shouldCheckIfAgeIsEqualOrOlderThan18() {
        String age = Weryfikacja.isEqualOrOlderThan18(18);
        String expectedResult = "Wiek jest równy, bądź większy od 18.";

        assertEquals(expectedResult, age);
    }
}
