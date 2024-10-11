package string_numbers_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringWithNumbersTest {

    StringWithNumbers stringWithNumbers;// object

    @BeforeEach
    void setUp() {
        stringWithNumbers = new StringWithNumbers("1 3 1");//5



    }

    @Test
    void sumOfNumbersInStringTest(){

        String str = "1 3 1";
        int expected = 5;
        int actual = stringWithNumbers.sumOfNumbersInString(str);
        assertEquals(expected, actual);

    }

}