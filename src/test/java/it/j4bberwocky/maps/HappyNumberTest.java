package it.j4bberwocky.maps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HappyNumberTest {
    
    private HappyNumber instance;

    @BeforeEach
    void instanceSetUp() {
        instance = new HappyNumber();
    }

    @Test
    void test19() {
        assertEquals(true, instance.isHappy(19));
    }

}
