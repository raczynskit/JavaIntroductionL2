import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {

    @Test
    void shouldGetMonday() {
        String dayOfWeek = Week.getDayOfWeek(1);
        String expectedResult = "Monday";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldGetTuesday() {
        String dayOfWeek = Week.getDayOfWeek(2);
        String expectedResult = "Tuesday";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldGetWednesday() {
        String dayOfWeek = Week.getDayOfWeek(3);
        String expectedResult = "Wednesday";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldGetThursday() {
        String dayOfWeek = Week.getDayOfWeek(4);
        String expectedResult = "Thursday";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldGetFriday() {
        String dayOfWeek = Week.getDayOfWeek(5);
        String expectedResult = "Friday";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldGetWeekend1() {
        String dayOfWeek = Week.getDayOfWeek(6);
        String expectedResult = "Weekend";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldGetWeekend2() {
        String dayOfWeek = Week.getDayOfWeek(7);
        String expectedResult = "Weekend";

        assertEquals (expectedResult, dayOfWeek);
    }
    @Test
    void shouldReturnError() {
        String dayOfWeek = Week.getDayOfWeek(8);
        String expectedResult = "There is no such day!";

        assertEquals(expectedResult, dayOfWeek);
    }
}