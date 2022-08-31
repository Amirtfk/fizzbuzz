import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class fizzbuzzTest {

    @Test
    void fizzbuzzTest3und5(){
        // GIVEN
        int number = 15;
        // WHEN
        String actual = fizzbuzz.fizzbuzz(number);
        // THEN
        assertEquals("Fizzbuzz", actual);
    }

    @Test
    void fizzbuzzTest3(){
        // GIVEN
        int number = 3;
        // WHEN
        String actual = fizzbuzz.fizzbuzz(number);
        // THEN
        assertEquals("Fizz", actual);
    }

    @Test
    void fizzbuzzTest5(){
        // GIVEN
        int number = 5;
        // WHEN
        String actual = fizzbuzz.fizzbuzz(number);
        // THEN
        assertEquals("Buzz", actual);
    }

}
