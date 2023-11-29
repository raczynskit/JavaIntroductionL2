import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekTest {

    @Test
    void shouldGetMonday() {

        //given
        String dayOfWeek = Week.getDayOfWeek(1);

        //when
        String expectedResult = "Monday";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldGetTuesday() {

        //given
        String dayOfWeek = Week.getDayOfWeek(2);

        //when
        String expectedResult = "Tuesday";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldGetWednesday() {

        //given
        String dayOfWeek = Week.getDayOfWeek(3);

        //when
        String expectedResult = "Wednesday";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldGetThursday() {

        //given
        String dayOfWeek = Week.getDayOfWeek(4);

        //when
        String expectedResult = "Thursday";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldGetFriday() {

        //given
        String dayOfWeek = Week.getDayOfWeek(5);

        //when
        String expectedResult = "Friday";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldGetWeekend1() {

        //given
        String dayOfWeek = Week.getDayOfWeek(6);

        //when
        String expectedResult = "Weekend";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldGetWeekend2() {

        //given
        String dayOfWeek = Week.getDayOfWeek(7);

        //when
        String expectedResult = "Weekend";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

    @Test
    void shouldReturnError() {

        //given
        String dayOfWeek = Week.getDayOfWeek(8);

        //when
        String expectedResult = "There is no such day!";

        //then
        assertEquals(expectedResult, dayOfWeek);
    }

}