package arry_tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArryTddTest {

    ArryTdd arryTdd;
    int[]array = {10, -10, 20, -15, 45, 23, 26};


    @BeforeEach
    void setUp() {

        arryTdd = new ArryTdd(array);
    }

    @Test
    void countPositive() {

        //expected
        int expected = 5;


        //actual
        int actual = arryTdd.countPositive(array);

        assertEquals(actual, expected,"Bad info:  ");


    }
}