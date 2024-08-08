package br.com.atividade1.atividade1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    
    private MyService service;

    @BeforeEach
    public void setUp() {
        service = new MyService();
    }

    @Test
    public void testAddition() {
        int result = service.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtraction() {
        int result = service.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}
