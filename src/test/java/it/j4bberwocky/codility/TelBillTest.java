package it.j4bberwocky.codility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TelBillTest {

    private TelBill instance = new TelBill();

    @Test
    void test() {
        assertEquals(4152L, instance.calculate("src/test/resources/it/j4bberwocky/codility/input.csv"));
    }
    
}
